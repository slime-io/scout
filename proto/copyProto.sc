#!/bin/sh
  exec /usr/local/bin/amm -s "$0" "$0" "$@"
!#

import $repo.`https://oss.sonatype.org/content/repositories/snapshots`
import $ivy.`com.zhranklin::scala-tricks:0.2.1-SNAPSHOT`
import $ivy.`com.lihaoyi::ammonite-ops:2.2.0`
import $ivy.`com.flipkart.zjsonpatch:zjsonpatch:0.4.11`
import $ivy.`com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.8.11`
import com.fasterxml.jackson.databind.node.JsonNodeFactory
import com.fasterxml.jackson.databind.{JsonNode, ObjectMapper}
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.flipkart.zjsonpatch.{DiffFlags, JsonDiff}
import io.circe.Json
import zrkn.op._
import Pipe._
import ammonite.ops._

import scala.jdk.CollectionConverters._
import ammonite.ops._
import RegexOpsContext._

case class ProtoFile(path: String, javaPkg: Option[String], deps: List[String])
object ProtoFile {
  def apply(path: Path, base: Path): ProtoFile = {
    val relPath = path.relativeTo(base).toString()
    val proto: String = read!path
    val lines = proto.split("\n").map(_.trim)
    val deps = lines.flatMap {
      case rr"""import "$p(.*)"\s*;""" => Some(p)
      case _ => None
    }.toList
    val jp = lines.flatMap {
      case rr"""option\s+java_package\s*=\s*"$p(.*)"\s*;""" => Some(p + s".${path.last.replaceAll("\\.proto$", "")}")
      case _ => None
    }.headOption
      .orElse(
        lines.flatMap {
          case rr"""package\s+$p(.*);""" => Some(p + s".${path.last.replaceAll("\\.proto$", "")}")
          case _ => None
        }.headOption
      )
    ProtoFile(relPath, jp, deps)
  }
}

@main
def main(scriptPath: Path): Unit = {
  val source = scriptPath/up/up/'proto/'protobuf
  val target = scriptPath/up/up/'src/'main/'protobuf
  val all = protos(source, source)
  //  all.foreach(println)
  val pathToProto = all.map(p => p.path -> p).toMap
  val protoPaths = uses.flatMap(jp => all.find(_.javaPkg.contains(jp)).map(_.path))
  val files = protosWithDeps(protoPaths, pathToProto)
  rm!target
  files.foreach { f =>
    val sourceFile = RelPath(f).resolveFrom(source)
    if (sourceFile.toIO.exists()) {
      val targetFile = RelPath(f).resolveFrom(target)
      val dir = targetFile/up
      mkdir! dir
      cp(sourceFile, targetFile)
    }
  }
}


def protos(path: Path, base: Path): List[ProtoFile] = {
  if (path.isDir) (ls!path).toList.flatMap(p => protos(p, base))
  else List(ProtoFile(path, base))
}

def protosWithDeps(protoPaths: Set[String], all: Map[String, ProtoFile]): Set[String] = {
  val res = protoPaths.flatMap(all.get).flatMap(_.deps).toSet ++ protoPaths
  if (res.size == protoPaths.size) protoPaths
  else protosWithDeps(res, all)
}

def uses = """
  io.envoyproxy.envoy.admin.v3.config_dump.BootstrapConfigDump
  io.envoyproxy.envoy.admin.v3.config_dump.ClustersConfigDump
  io.envoyproxy.envoy.admin.v3.config_dump.ListenersConfigDump
  io.envoyproxy.envoy.admin.v3.config_dump.RoutesConfigDump
  io.envoyproxy.envoy.admin.v3.config_dump.ScopedRoutesConfigDump
  io.envoyproxy.envoy.admin.v3.config_dump.SecretsConfigDump
  io.envoyproxy.envoy.config.cluster.v3.cluster.Cluster
  io.envoyproxy.envoy.config.listener.v3.listener.Listener
  io.envoyproxy.envoy.config.route.v3.route.RouteConfiguration
  io.envoyproxy.envoy.config.trace.v3.zipkin.ZipkinConfig
  io.envoyproxy.envoy.extensions.access_loggers.file.v3.file.FileAccessLog
  io.envoyproxy.envoy.extensions.filters.http.cors.v3.cors.Cors
  io.envoyproxy.envoy.extensions.filters.http.fault.v3.fault.HTTPFault
  io.envoyproxy.envoy.extensions.filters.http.grpc_stats.v3.config.FilterConfig
  io.envoyproxy.envoy.extensions.filters.http.router.v3.router.Router
  io.envoyproxy.envoy.extensions.filters.listener.http_inspector.v3.http_inspector.HttpInspector
  io.envoyproxy.envoy.extensions.filters.listener.original_dst.v3.original_dst.OriginalDst
  io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.tls_inspector.TlsInspector
  io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.http_connection_manager.HttpConnectionManager
  io.envoyproxy.envoy.extensions.filters.network.tcp_proxy.v3.tcp_proxy.TcpProxy
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.tls.DownstreamTlsContext
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.secret.Secret
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.tls.UpstreamTlsContext
  com.github.udpa.udpa.type.v1.typed_struct.TypedStruct
  com.google.protobuf.wrappers.StringValue
  istio.envoy.config.filter.http.alpn.v2alpha1.config.FilterConfig
  istio.envoy.config.filter.http.authn.v2alpha1.config.FilterConfig
  io.envoyproxy.envoy.admin.v2alpha.config_dump.BootstrapConfigDump
  io.envoyproxy.envoy.admin.v2alpha.config_dump.ClustersConfigDump
  io.envoyproxy.envoy.admin.v2alpha.config_dump.ListenersConfigDump
  io.envoyproxy.envoy.admin.v2alpha.config_dump.RoutesConfigDump
  io.envoyproxy.envoy.admin.v2alpha.config_dump.ScopedRoutesConfigDump
  io.envoyproxy.envoy.admin.v2alpha.config_dump.SecretsConfigDump
  io.envoyproxy.envoy.api.v2.cluster.Cluster
  io.envoyproxy.envoy.api.v2.listener.Listener
  io.envoyproxy.envoy.api.v2.route.RouteConfiguration
  io.envoyproxy.envoy.config.accesslog.v2.file.FileAccessLog
  io.envoyproxy.envoy.config.filter.http.cors.v2.cors.Cors
  io.envoyproxy.envoy.config.filter.http.fault.v2.fault.HTTPFault
  io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.config.FilterConfig
  io.envoyproxy.envoy.config.filter.http.router.v2.router.Router
  io.envoyproxy.envoy.config.filter.listener.http_inspector.v2.http_inspector.HttpInspector
  io.envoyproxy.envoy.config.filter.listener.original_dst.v2.original_dst.OriginalDst
  io.envoyproxy.envoy.config.filter.listener.tls_inspector.v2.tls_inspector.TlsInspector
  io.envoyproxy.envoy.config.filter.network.http_connection_manager.v2.http_connection_manager.HttpConnectionManager
  io.envoyproxy.envoy.config.filter.network.tcp_proxy.v2.tcp_proxy.TcpProxy
  io.envoyproxy.envoy.config.trace.v2.zipkin.ZipkinConfig
  com.github.udpa.udpa.`type`.v1.typed_struct.TypedStruct
  com.google.protobuf.wrappers.StringValue
  istio.envoy.config.filter.http.alpn.v2alpha1.config.FilterConfig
  istio.envoy.config.filter.http.authn.v2alpha1.config.FilterConfig
  """.split("\n").map(_.trim).filter(_.nonEmpty).map(p => p.splitAt(p.lastIndexOf('.'))._1).toSet
