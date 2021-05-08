package scout.cmd

import scout.{DescribeCluster, DescribeDestination, DescribeEndpoint, DescribeHeaderMatch, DescribeRoute, DescribeRouteMatch, LinkDestination, LinkRDS, Main, Node}

object Curl {
  val parser = {
    import scopt.OParser
    val builder = OParser.builder[Curl]
    import builder._
    import shapeless._
    import syntax.std.tuple._
    OParser.sequence(
      programName("curl"),
      arg[String]("url")
        .required()
        .action { (url, c) =>
          val (host, port, path) = {
            val (addr, path) = Some(url.indexOf("/")).filter(_ != -1).map(url.splitAt).getOrElse(url, "/")
            Some(addr.lastIndexOf(":")).filter(_ != -1).map(addr.splitAt).getOrElse(addr, "") :+ path
          }
          c.copy(
            host = host,
            port = if (port != "") port.drop(1).toInt else c.port,
            path = path,
            header = c.header.updated("authority", host)
          )
        },
      opt[Int]('p', "port")
        .action((p, c) => c.copy(port = p))
        .text("端口号"),
      opt[String]('H', "header")
        .action((kv, c) => c.copy(header = c.header.updated(kv.split(":").head.trim, kv.split(":").tail.mkString(":").trim))),
      help("asdfasdfasdf"),
    )
  }

  def apply(cmd: Seq[String]): Option[Curl] = {
    scopt.OParser.parse(parser, cmd, Curl(Map.empty, "", "", 80))
  }
}

case class Curl(header: Map[String, String], host: String, path: String, port: Int) extends Command {

  override def doExec(): Option[Node] = {
    val prime = host + "_" + port.toString
    val secondary = "0.0.0.0_" + port.toString
    println((prime, secondary))
    val route = Main.listeners.get(prime).orElse(Main.listeners.get(secondary))
      .flatMap(_.filterChains.flatMap(_.filters.get("envoy.http_connection_manager")).find(_.rds.nonEmpty))
      .flatMap(filter => Main.rds.get(filter.rds))
      .flatMap(k => k.virtualHost.get(host).orElse(k.virtualHost.get("*")))
      .flatMap(_.routes.find(s => isMatch(path, header, s.`match`)))
    route.foreach(o => printf("name:%s, destination:%s", o.name, o.destination))

    if (route.isEmpty) {
      return Option(Node("NO Route Matched", List()))
    }
    route.map(r => LinkRDS(r, r.destination.map(l => LinkDestination(l, Main.cds.getOrElse(l.cluster, DescribeCluster("No Endpoint", List[DescribeEndpoint]()))))))
  }

    def isMatch(path: String, headers: Map[String, String], m: DescribeRouteMatch): Boolean = {
      List(
        m.prefix.isEmpty || path.startsWith(m.prefix),
        m.exact.isEmpty || path == m.exact,
        m.regex.isEmpty || path.matches(m.regex),
        m.headerMatch.forall(k => headers.get(k._1).exists(v => isHeaderMatch(v, k._2)))
      ).reduce(_ && _)
    }

    def isHeaderMatch(value: String, headerMatch: DescribeHeaderMatch): Boolean = {
      List(
        headerMatch.exactMatch.isEmpty || value == headerMatch.exactMatch,
        headerMatch.prefixMatch.isEmpty || value.startsWith(headerMatch.prefixMatch),
        headerMatch.suffixMatch.isEmpty || value.endsWith(headerMatch.suffixMatch),
        headerMatch.containsMatch.isEmpty || value.contains(headerMatch.containsMatch),
        headerMatch.safeRegexMatch.isEmpty || value.matches(headerMatch.safeRegexMatch)
      ).reduce(_ && _)
    }

  }