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

  val tr = TypeRegistry()
    .addMessage[io.envoyproxy.envoy.admin.v3.config_dump.BootstrapConfigDump]
    .addMessage[io.envoyproxy.envoy.admin.v3.config_dump.ClustersConfigDump]
    .addMessage[io.envoyproxy.envoy.admin.v3.config_dump.ListenersConfigDump]
    .addMessage[io.envoyproxy.envoy.admin.v3.config_dump.RoutesConfigDump]
    .addMessage[io.envoyproxy.envoy.admin.v3.config_dump.ScopedRoutesConfigDump]
    .addMessage[io.envoyproxy.envoy.admin.v3.config_dump.SecretsConfigDump]
    .addMessage[io.envoyproxy.envoy.config.cluster.v3.cluster.Cluster]
    .addMessage[io.envoyproxy.envoy.config.listener.v3.listener.Listener]
    .addMessage[io.envoyproxy.envoy.config.route.v3.route.RouteConfiguration]
    .addMessage[io.envoyproxy.envoy.config.trace.v3.zipkin.ZipkinConfig]
    .addMessage[io.envoyproxy.envoy.extensions.access_loggers.file.v3.file.FileAccessLog]
    .addMessage[io.envoyproxy.envoy.extensions.filters.http.cors.v3.cors.Cors]
    .addMessage[io.envoyproxy.envoy.extensions.filters.http.fault.v3.fault.HTTPFault]
    .addMessage[io.envoyproxy.envoy.extensions.filters.http.grpc_stats.v3.config.FilterConfig]
    .addMessage[io.envoyproxy.envoy.extensions.filters.http.router.v3.router.Router]
    .addMessage[io.envoyproxy.envoy.extensions.filters.listener.http_inspector.v3.http_inspector.HttpInspector]
    .addMessage[io.envoyproxy.envoy.extensions.filters.listener.original_dst.v3.original_dst.OriginalDst]
    .addMessage[io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3.tls_inspector.TlsInspector]
    .addMessage[io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.http_connection_manager.HttpConnectionManager]
    .addMessage[io.envoyproxy.envoy.extensions.filters.network.tcp_proxy.v3.tcp_proxy.TcpProxy]
    .addMessage[io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.tls.DownstreamTlsContext]
    .addMessage[io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.secret.Secret]
    .addMessage[io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.tls.UpstreamTlsContext]
    .addMessage[com.github.udpa.udpa.`type`.v1.typed_struct.TypedStruct]
    .addMessage[com.google.protobuf.wrappers.StringValue]
    .addMessage[istio.envoy.config.filter.http.alpn.v2alpha1.config.FilterConfig]
    .addMessage[istio.envoy.config.filter.http.authn.v2alpha1.config.FilterConfig]
    .addMessage[io.envoyproxy.envoy.admin.v2alpha.config_dump.BootstrapConfigDump]
    .addMessage[io.envoyproxy.envoy.admin.v2alpha.config_dump.ClustersConfigDump]
    .addMessage[io.envoyproxy.envoy.admin.v2alpha.config_dump.ListenersConfigDump]
    .addMessage[io.envoyproxy.envoy.admin.v2alpha.config_dump.RoutesConfigDump]
    .addMessage[io.envoyproxy.envoy.admin.v2alpha.config_dump.ScopedRoutesConfigDump]
    .addMessage[io.envoyproxy.envoy.admin.v2alpha.config_dump.SecretsConfigDump]
    .addMessage[io.envoyproxy.envoy.api.v2.cluster.Cluster]
    .addMessage[io.envoyproxy.envoy.api.v2.listener.Listener]
    .addMessage[io.envoyproxy.envoy.api.v2.route.RouteConfiguration]
    .addMessage[io.envoyproxy.envoy.config.accesslog.v2.file.FileAccessLog]
    .addMessage[io.envoyproxy.envoy.config.filter.http.cors.v2.cors.Cors]
    .addMessage[io.envoyproxy.envoy.config.filter.http.fault.v2.fault.HTTPFault]
    .addMessage[io.envoyproxy.envoy.config.filter.http.grpc_stats.v2alpha.config.FilterConfig]
    .addMessage[io.envoyproxy.envoy.config.filter.http.router.v2.router.Router]
    .addMessage[io.envoyproxy.envoy.config.filter.listener.http_inspector.v2.http_inspector.HttpInspector]
    .addMessage[io.envoyproxy.envoy.config.filter.listener.original_dst.v2.original_dst.OriginalDst]
    .addMessage[io.envoyproxy.envoy.config.filter.listener.tls_inspector.v2.tls_inspector.TlsInspector]
    .addMessage[io.envoyproxy.envoy.config.filter.network.http_connection_manager.v2.http_connection_manager.HttpConnectionManager]
    .addMessage[io.envoyproxy.envoy.config.filter.network.tcp_proxy.v2.tcp_proxy.TcpProxy]
    .addMessage[io.envoyproxy.envoy.config.trace.v2.zipkin.ZipkinConfig]
    .addMessage[com.github.udpa.udpa.`type`.v1.typed_struct.TypedStruct]
    .addMessage[com.google.protobuf.wrappers.StringValue]
    .addMessage[istio.envoy.config.filter.http.alpn.v2alpha1.config.FilterConfig]
    .addMessage[istio.envoy.config.filter.http.authn.v2alpha1.config.FilterConfig]
}
