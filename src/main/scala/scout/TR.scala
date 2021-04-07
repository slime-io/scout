package scout

/**
 * Created by 张武(zhangwu@corp.netease.com) at 2021/4/8
 */
object TR {
  import scalapb.json4s.TypeRegistry

  implicit class PBAnyExtend(pb: com.google.protobuf.any.Any) {
    def as[T <: scalapb.GeneratedMessage](implicit cmp: scalapb.GeneratedMessageCompanion[T]): Option[T] =
      Some(cmp)
        .filter(c => ("type.googleapis.com/" + c.scalaDescriptor.fullName) == pb.typeUrl)
        .map(_.parseFrom(pb.value.toByteArray))
  }
  import io.envoyproxy.envoy._
  import admin.v3.config_dump._
  import config._
  import extensions._
  import transport_sockets.tls.v3.{secret, tls}

  val tr = TypeRegistry()
    .addMessage[BootstrapConfigDump].addMessage[ClustersConfigDump].addMessage[ListenersConfigDump]
    .addMessage[RoutesConfigDump].addMessage[ScopedRoutesConfigDump].addMessage[SecretsConfigDump]
    .addMessage[cluster.v3.cluster.Cluster].addMessage[listener.v3.listener.Listener]
    .addMessage[route.v3.route.RouteConfiguration].addMessage[trace.v3.zipkin.ZipkinConfig]
    .addMessage[access_loggers.file.v3.file.FileAccessLog]
    .addMessage[filters.http.cors.v3.cors.Cors].addMessage[filters.http.fault.v3.fault.HTTPFault]
    .addMessage[filters.http.grpc_stats.v3.config.FilterConfig].addMessage[filters.http.router.v3.router.Router]
    .addMessage[filters.listener.http_inspector.v3.http_inspector.HttpInspector]
    .addMessage[filters.listener.original_dst.v3.original_dst.OriginalDst]
    .addMessage[filters.listener.tls_inspector.v3.tls_inspector.TlsInspector]
    .addMessage[filters.network.http_connection_manager.v3.http_connection_manager.HttpConnectionManager]
    .addMessage[filters.network.tcp_proxy.v3.tcp_proxy.TcpProxy]
    .addMessage[tls.DownstreamTlsContext].addMessage[secret.Secret].addMessage[tls.UpstreamTlsContext]
    .addMessage[com.github.udpa.udpa.`type`.v1.typed_struct.TypedStruct]
    .addMessage[com.google.protobuf.wrappers.StringValue]
    .addMessage[istio.envoy.config.filter.http.alpn.v2alpha1.config.FilterConfig]
    .addMessage[istio.envoy.config.filter.http.authn.v2alpha1.config.FilterConfig]
}
