package scout

import TR._
import io.envoyproxy.envoy.api.v2.rds.RouteConfiguration
import io.envoyproxy.envoy.api.v2.route.route.{HeaderMatcher, Route, RouteAction, RouteMatch, VirtualHost}

/**
 * Created by 张武(zhangwu@corp.netease.com) at 2021/4/8
 */
case class DescribeRouteMatch(prefix: String, regex: String, exact: String, headerMatch: Map[String, DescribeHeaderMatch]) extends Node(
  s"Match",
  List("prefix"->prefix, "regex"->regex, "exact"->exact).filter(_._2.nonEmpty).map(tp => Node(tp._1 + ": " + tp._2)) :++
    List(Node("headerMatch", headerMatch.map(tp => tp._2.renderNode(tp._1)).toList)).filter(_ => headerMatch.nonEmpty)
)
case class DescribeHeaderMatch(prefixMatch: String, suffixMatch: String, exactMatch: String, safeRegexMatch: String, presentMatch: String, containsMatch: String) {
  def renderNode(name: String) =
    Node(name, productElementNames.toList.zip(productIterator).map(tp => Node(tp._1, List(Node(tp._2.toString)))))
}
case class DescribeDestination(cluster: String, weight: Int) extends Node(
  s"[Cluster] $cluster\n[Weight]$weight"
)
case class DescribeRoute(name: String, `match`: DescribeRouteMatch, destination: List[DescribeDestination]/* , plugin: Map[String, Object]*/) extends Node(
  s"[Route] $name",
  `match` :: destination
)
case class DescribeHost(name: String, domain: List[String], routes: List[DescribeRoute]) extends Node(
  s"[VirtualHost] $name", Node("Domains", domain.map(s => Node(s"[Domain] $s"))) :: routes
)
case class DescribeRDS(name: String, virtualHost: Map[String, DescribeHost]) extends Node(
  s"[RouteConfig] $name",
  virtualHost.map(tp => Node("[Domain] " + tp._1, List(tp._2))).toList
)
case class DisplayRDS(name: String, virtualHost: List[DescribeHost]) extends Node(
  s"[RouteConfig] $name", virtualHost
)

object DescribeRDS {

  def describeDestinations(clusterSpecifier: RouteAction.ClusterSpecifier): List[DescribeDestination] = {
    clusterSpecifier.cluster.map(c => List(DescribeDestination(c, 100)))
      .orElse(clusterSpecifier.weightedClusters.map(wc => wc.clusters.map(c => DescribeDestination(c.name, c.weight.getOrElse(0)))))
      .getOrElse(List.empty)
      .toList
  }

  def describeHeaderMatch(h: HeaderMatcher) = {
    val hs = h.headerMatchSpecifier
    DescribeHeaderMatch(hs.prefixMatch.getOrElse(""), hs.suffixMatch.getOrElse(""), hs.exactMatch.getOrElse(""), hs.regexMatch.getOrElse(""), hs.presentMatch.map(_.toString).getOrElse(""), "")
  }

  def describeRouteMatch(mtch: RouteMatch) = {
    mtch.headers
      .map(h => h.name -> describeHeaderMatch(h))
    val ps = mtch.pathSpecifier
    DescribeRouteMatch(ps.prefix.getOrElse(""), ps.regex.getOrElse(""), ps.path.getOrElse(""), mtch.headers.map(hm => hm.name -> describeHeaderMatch(hm)).toMap)
  }

  def describeRoute(r: Route): Option[DescribeRoute] = {
    r.action.route.map( rte =>
      DescribeRoute(r.name, r.`match`.map(describeRouteMatch).orNull, describeDestinations(rte.clusterSpecifier))//, r.typedPerFilterConfig)
    )
  }
  def describeHost(vh: VirtualHost): DescribeHost = {
    DescribeHost(vh.name, vh.domains.toList, vh.routes.flatMap(describeRoute).toList)
  }

  def apply(rc: RouteConfiguration): DescribeRDS = {
    val vhs = rc.virtualHosts
      .flatMap(vh => vh.domains.map(d => (d, describeHost(vh))))
      .toMap
    DescribeRDS(rc.name, vhs)
  }
  def display(rc: RouteConfiguration):DisplayRDS = {
    val vhs = rc.virtualHosts
      .map(describeHost)
    DisplayRDS(rc.name, vhs.toList)
  }
}

