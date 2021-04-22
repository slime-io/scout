package scout

import io.envoyproxy.envoy.admin.v2alpha.config_dump.{ConfigDump, ListenersConfigDump, RoutesConfigDump}
import io.envoyproxy.envoy.api.v2.rds.RouteConfiguration
import scout.TR._
import shapeless.syntax.std.tuple.productTupleOps

import scala.util.Try

/**
 * Created by 张武(zhangwu@corp.netease.com) at 2021/4/2
 */
object Main {
  val (listeners, rds, cds, data) = {
    val configDump = parseAsProto
    val lds = configDump._1.flatMap(_.as[ListenersConfigDump]).head.dynamicActiveListeners
      .map(dl => Node(dl.listener.map(_.name).getOrElse(""), DescribeListener(dl)))
    val ldsResult = lds.groupBy(l => {
      if (l.view.contains("virtual")) {
        l.view
      } else {
        l.view.split("_")(1)
      }
    }).map(x => Node("[Port]" + x._1, x._2.toList))
      .toList

    val rds = configDump._1.flatMap(_.as[RoutesConfigDump]).head.dynamicRouteConfigs
      .flatMap(drc => drc.routeConfig)
      .map(DescribeRDS.apply)

    val rdsResult = configDump._1.flatMap(_.as[RoutesConfigDump]).head.dynamicRouteConfigs
      .flatMap(drc => drc.routeConfig)
      .map(DescribeRDS.display).groupBy(l => {
      val ss = l.name.split(":")
      ss(ss.length - 1)
    }).map(x => Node("[Port]" + x._1, x._2.toList))
      .toList

    val cds = configDump._2.split("\n").filter(_.contains("health_flags"))
      .map(_.split("::")).filter(_.length == 4).map(f => DescribeCluster(f(0), List(DescribeEndpoint(f(1), f(3)))))
      .groupBy(_.name).values.map(l => DescribeCluster(l.head.name, l.flatMap(_.describeEndpoint).toList))

    val cdsResult = cds.groupBy(c => {
      val ss = c.name.split("\\|")
      if (ss.length == 4) {
        ss(3)
      } else {
        ""
      }
    }).map(a => Node("[Service]" + a._1, a._2.toList)).toList
      .groupBy(svc => {
        val ss = svc.view.split("\\.")
        if (ss.length >= 3) {
          ss(1)
        } else {
          ""
        }
      }).map(b => Node("[Namespace]" + b._1, b._2)).toList

    (lds.map(n => n.view -> n.children.head.asInstanceOf[DescribeListener]).toMap,
      rds.map(n => n.name -> n).toMap,
      cds.map(n => n.name -> n).toMap,
      Node("", List(Node("LDS", ldsResult), Node("RDS", rdsResult), Node("CDS", cdsResult)))
    )
  }
  data.open
  UI.init()

  def main(args: Array[String]): Unit = {
  }

  def getVal(htmlId: String): Option[String] = {
    import UIDeps._
    val result = Try($(s"#$htmlId").`val`())
      .filter(_.isInstanceOf[String])
      .map(_.asInstanceOf[String].trim)
      .filter(_.nonEmpty)
      .toOption
    if (result.isEmpty)
      println(s"didn't find: #$htmlId")
    result
  }

  def getInput = {
    val cd = getVal("configDump").getOrElse(Sample.json)
    val c = getVal("clusters").getOrElse("")
    (if (cd.isEmpty) Sample.json else cd, c)
  }

  def parseAsProto = {
    val (cdJson, clusterJson) = getInput
    (parser.fromJsonString[ConfigDump](cdJson).configs, clusterJson)
  }

}
