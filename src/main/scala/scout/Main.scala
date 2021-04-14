package scout

import io.envoyproxy.envoy.admin.v3.config_dump.{ConfigDump, ListenersConfigDump, RoutesConfigDump}
import io.envoyproxy.envoy.config.route.v3.route.RouteConfiguration
import scout.TR._

import scala.util.Try

/**
 * Created by 张武(zhangwu@corp.netease.com) at 2021/4/2
 */
object Main {
  val (listeners, rds, data) = {
    val configDump = parseAsProto
    val ldsResult = configDump.flatMap(_.as[ListenersConfigDump]).head.dynamicListeners
      .map(dl => Node(dl.name, DescribeListener(dl)))
      .toList
    val rdsResult = configDump.flatMap(_.as[RoutesConfigDump]).head.dynamicRouteConfigs
      .flatMap(drc => drc.routeConfig.flatMap(_.as[RouteConfiguration]))
      .map(DescribeRDS.apply)
      .toList
    (ldsResult.map(n => n.view -> n.children.head.asInstanceOf[DescribeListener]).toMap,
      rdsResult.map(n => n.name -> n).toMap,
      Node("", List(Node("LDS", ldsResult), Node("RDS", rdsResult)))
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
    import scalapb.json4s.Parser
    val parser = new Parser().withTypeRegistry(tr)
    parser.fromJsonString[ConfigDump](cdJson).configs
  }
}
