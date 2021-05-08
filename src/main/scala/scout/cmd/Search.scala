package scout.cmd

import scout.{Main, Node}

object Search {
  val parser = {
    import scopt.OParser
    val builder = OParser.builder[Search]
    import builder._
    OParser.sequence(
      programName("search"),
      arg[String]("key")
        .required()
        .action { (k, s) => s.copy(key = k) },
      opt[String]('t', "type")
        .action((t, s) => s.copy(searchType = t))
    )
  }

  def apply(cmd: Seq[String]): Option[Search] = {
    scopt.OParser.parse(parser, cmd, Search("", ""))
  }
}

case class Search(key: String, searchType: String) extends Command {
  override def doExec(): Option[Node] = {
    if (searchType == "lds") {
      Option(Node("result", Main.listeners.filter(_._1.contains(key)).values.toList))
    } else if (searchType == "rds") {
      Option(Node("result", Main.rds.filter(_._1.contains(key)).values.toList))
    } else if (searchType == "cds") {
      Option(Node("result", Main.cds.filter(_._1.contains(key)).values.toList))
    } else if (searchType == "vh"){
      Option(Node("result", Main.rds.flatMap(_._2.virtualHost).filter(_._1.contains(key)).values.toList))
    }
    else {
      Option(Node("invalid search type", List[Node]()))
    }
  }
}
