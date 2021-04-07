package scout

import io.envoyproxy.envoy.admin.v3.config_dump.{ConfigDump, ListenersConfigDump, RoutesConfigDump}
import io.envoyproxy.envoy.config.route.v3.route.RouteConfiguration
import scout.TR._

import scala.scalajs.js


/**
 * Created by 张武(zhangwu@corp.netease.com) at 2021/4/2
 */
object Main {
  def main(args: Array[String]): Unit = {
    val configDump = parseAsProto
    val ldsResult = configDump.flatMap(_.as[ListenersConfigDump]).head.dynamicListeners
      .map(dl => Node(dl.name, DescribeListener(dl)))
      .toList
    val rdsResult = configDump.flatMap(_.as[RoutesConfigDump]).head.dynamicRouteConfigs
      .flatMap(drc => drc.routeConfig.flatMap(_.as[RouteConfiguration]))
      .map(DescribeRDS.apply)
      .toList
    val data = Node("", List(
      Node("LDS", ldsResult),
      Node("RDS", rdsResult))
    )
    data.open
    UI.init(data)
  }

  def parseAsProto = {
    val jsonStr = Sample.json
    import scalapb.json4s.Parser
    val parser = new Parser().withTypeRegistry(tr)
    parser.fromJsonString[ConfigDump](jsonStr).configs
  }
}
