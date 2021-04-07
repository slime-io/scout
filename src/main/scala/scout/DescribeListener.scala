package scout

import io.envoyproxy.envoy.admin.v3.config_dump.ListenersConfigDump
import io.envoyproxy.envoy.config.listener.v3.listener.Listener
import io.envoyproxy.envoy.config.listener.v3.listener_components.{Filter, FilterChain, FilterChainMatch}
import io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.http_connection_manager.HttpConnectionManager
import TR._

/**
 * Created by 张武(zhangwu@corp.netease.com) at 2021/4/8
 */
case class DescribeFilterChainMatch (protocols: String, port: Int, ip: List[String]) extends Node(
  "Match", List(
    Node(s"[Protocols] $protocols"),
    Node(s"[Port] $port")
  ) ++ List(ip.map(Node(_))).filter(_.nonEmpty).map(ch => new Node("IP", ch))
)
case class DescribeFilterChain (`match`: Option[DescribeFilterChainMatch], filters: Map[String, DescribeFilter]) extends Node(
  "FilterChain",
  `match`.toList ++ filters.values.toList
)
case class DescribeFilter(name: String, subFilter: List[String], rds: String) extends Node(
  s"[Filter] $name\n",
  List(rds).filter(_.nonEmpty).map(r => Node(s"[RDS] $rds")) ++:
    List(subFilter.map(Node(_))).filter(_.nonEmpty).map(sf => Node("SubFilters", sf))
)
case class DescribeListener(name: String, state: String, filterChains: List[DescribeFilterChain]) extends Node(
  s"[Listener] $name($state)", filterChains
)
object DescribeListener {
  def describeFilter(f: Filter): DescribeFilter = {
    f.configType.typedConfig
      .flatMap(t => t.as[HttpConnectionManager])
      .map(hcm => DescribeFilter(f.name, hcm.httpFilters.map(_.name).toList, hcm.getRds.routeConfigName))
      .getOrElse(DescribeFilter(f.name, Nil, ""))
  }
  def describeFilterChainMatch(fcm: FilterChainMatch) = {
    DescribeFilterChainMatch(fcm.applicationProtocols.mkString(", "), fcm.destinationPort.getOrElse(0), fcm.prefixRanges.map(_.toString).toList)
  }
  def describeFilterChain(fc: FilterChain): DescribeFilterChain = {
    DescribeFilterChain(fc.filterChainMatch.map(describeFilterChainMatch), fc.filters.map(f => f.name -> describeFilter(f)).toMap)
  }
  def apply(l: ListenersConfigDump.DynamicListener): DescribeListener = {
    val state = Seq(l.activeState, l.errorState, l.warmingState, l.drainingState)
      .reduce(_.orElse(_)).map(_.getClass.getSimpleName).getOrElse("None")
    l.activeState
      .flatMap(_.listener.flatMap(_.as[Listener]))
      .map(listener => DescribeListener(l.name, state, listener.filterChains.map(describeFilterChain).toList))
      .getOrElse(new DescribeListener(l.name, state, Nil))
  }
}
