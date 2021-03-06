package scout

/**
 * Created by 张武(zhangwu@corp.netease.com) at 2021/4/7
 */
object Sample {
  val json = List("""
{
 "configs": [
  {
   "@type": "type.googleapis.com/envoy.admin.v3.BootstrapConfigDump",
   "bootstrap": {
    "node": {
     "id": "sidecar~10.244.2.66~productpage-v1-64794f5db4-blnt8.default~default.svc.cluster.local",
     "cluster": "productpage.default",
     "metadata": {
      "POD_PORTS": "[{\"containerPort\":9080,\"protocol\":\"TCP\"}]",
      "ISTIO_VERSION": "1.9.1",
      "INTERCEPTION_MODE": "REDIRECT",
      "ISTIO_PROXY_SHA": "istio-proxy:8787f0f63f7ba9b7f974ef80dff3259963a61809",
      "NAME": "productpage-v1-64794f5db4-blnt8",
      "SERVICE_ACCOUNT": "bookinfo-productpage",
      "APP_CONTAINERS": "productpage",
      "MESH_ID": "cluster.local",
      "CLUSTER_ID": "Kubernetes",
      "WORKLOAD_NAME": "productpage-v1",
      "PROXY_CONFIG": {
       "proxyAdminPort": 15000,
       "serviceCluster": "productpage.default",
       "drainDuration": "45s",
       "terminationDrainDuration": "5s",
       "discoveryAddress": "istiod.istio-system.svc:15012",
       "controlPlaneAuthPolicy": "MUTUAL_TLS",
       "binaryPath": "/usr/local/bin/envoy",
       "tracing": {
        "zipkin": {
         "address": "zipkin.istio-system:9411"
        }
       },
       "statusPort": 15020,
       "statNameLength": 189,
       "parentShutdownDuration": "60s",
       "configPath": "./etc/istio/proxy",
       "concurrency": 2
      },
      "NAMESPACE": "default",
      "INSTANCE_IPS": "10.244.2.66",
      "OWNER": "kubernetes://apis/apps/v1/namespaces/default/deployments/productpage-v1",
      "LABELS": {
       "version": "v1",
       "security.istio.io/tlsMode": "istio",
       "pod-template-hash": "64794f5db4",
       "app": "productpage",
       "istio.io/rev": "default",
       "service.istio.io/canonical-revision": "v1",
       "service.istio.io/canonical-name": "productpage"
      }
     },
     "locality": {},
     "user_agent_name": "envoy",
     "user_agent_build_version": {
      "version": {
       "major_number": 1,
       "minor_number": 17,
       "patch": 1
      },
      "metadata": {
       "build.type": "RELEASE",
       "ssl.version": "BoringSSL",
       "revision.sha": "8787f0f63f7ba9b7f974ef80dff3259963a61809",
       "revision.status": "Clean"
      }
     },
     "extensions": [
      {
       "name": "envoy.transport_sockets.alts",
       "category": "envoy.transport_sockets.upstream"
      },
      {
       "name": "envoy.transport_sockets.quic",
       "category": "envoy.transport_sockets.upstream"
      },
      {
       "name": "envoy.transport_sockets.raw_buffer",
       "category": "envoy.transport_sockets.upstream"
      },
      {
       "name": "envoy.transport_sockets.tap",
       "category": "envoy.transport_sockets.upstream"
      },
      {
       "name": "envoy.transport_sockets.tls",
       "category": "envoy.transport_sockets.upstream"
      },
      {
       "name": "envoy.transport_sockets.upstream_proxy_protocol",
       "category": "envoy.transport_sockets.upstream"
      },
      {
       "name": "raw_buffer",
       "category": "envoy.transport_sockets.upstream"
      },
      {
       "name": "tls",
       "category": "envoy.transport_sockets.upstream"
      },
      {
       "name": "default",
       "category": "envoy.dubbo_proxy.route_matchers"
      },
      {
       "name": "envoy.bootstrap.wasm",
       "category": "envoy.bootstrap"
      },
      {
       "name": "envoy.extensions.network.socket_interface.default_socket_interface",
       "category": "envoy.bootstrap"
      },
      {
       "name": "envoy.filters.thrift.rate_limit",
       "category": "envoy.thrift_proxy.filters"
      },
      {
       "name": "envoy.filters.thrift.router",
       "category": "envoy.thrift_proxy.filters"
      },
      {
       "name": "quiche_quic_listener",
       "category": "envoy.udp_listeners"
      },
      {
       "name": "raw_udp_listener",
       "category": "envoy.udp_listeners"
      },
      {
       "name": "udp_default_writer",
       "category": "envoy.udp_packet_writers"
      },
      {
       "name": "udp_gso_batch_writer",
       "category": "envoy.udp_packet_writers"
      },
      {
       "name": "envoy.extensions.upstreams.http.v3.HttpProtocolOptions",
       "category": "envoy.upstream_options"
      },
      {
       "name": "envoy.upstreams.http.http_protocol_options",
       "category": "envoy.upstream_options"
      },
      {
       "name": "envoy.filters.dubbo.router",
       "category": "envoy.dubbo_proxy.filters"
      },
      {
       "name": "envoy.compression.gzip.compressor",
       "category": "envoy.compression.compressor"
      },
      {
       "name": "auto",
       "category": "envoy.thrift_proxy.transports"
      },
      {
       "name": "framed",
       "category": "envoy.thrift_proxy.transports"
      },
      {
       "name": "header",
       "category": "envoy.thrift_proxy.transports"
      },
      {
       "name": "unframed",
       "category": "envoy.thrift_proxy.transports"
      },
      {
       "name": "envoy.dog_statsd",
       "category": "envoy.stats_sinks"
      },
      {
       "name": "envoy.metrics_service",
       "category": "envoy.stats_sinks"
      },
      {
       "name": "envoy.stat_sinks.dog_statsd",
       "category": "envoy.stats_sinks"
      },
      {
       "name": "envoy.stat_sinks.hystrix",
       "category": "envoy.stats_sinks"
      },
      {
       "name": "envoy.stat_sinks.metrics_service",
       "category": "envoy.stats_sinks"
      },
      {
       "name": "envoy.stat_sinks.statsd",
       "category": "envoy.stats_sinks"
      },
      {
       "name": "envoy.stat_sinks.wasm",
       "category": "envoy.stats_sinks"
      },
      {
       "name": "envoy.statsd",
       "category": "envoy.stats_sinks"
      },
      {
       "name": "dubbo.hessian2",
       "category": "envoy.dubbo_proxy.serializers"
      },
      {
       "name": "envoy.dynamic.ot",
       "category": "envoy.tracers"
      },
      {
       "name": "envoy.lightstep",
       "category": "envoy.tracers"
      },
      {
       "name": "envoy.tracers.datadog",
       "category": "envoy.tracers"
      },
      {
       "name": "envoy.tracers.dynamic_ot",
       "category": "envoy.tracers"
      },
      {
       "name": "envoy.tracers.lightstep",
       "category": "envoy.tracers"
      },
      {
       "name": "envoy.tracers.opencensus",
       "category": "envoy.tracers"
      },
      {
       "name": "envoy.tracers.skywalking",
       "category": "envoy.tracers"
      },
      {
       "name": "envoy.tracers.xray",
       "category": "envoy.tracers"
      },
      {
       "name": "envoy.tracers.zipkin",
       "category": "envoy.tracers"
      },
      {
       "name": "envoy.zipkin",
       "category": "envoy.tracers"
      },
      {
       "name": "envoy.internal_redirect_predicates.allow_listed_routes",
       "category": "envoy.internal_redirect_predicates"
      },
      {
       "name": "envoy.internal_redirect_predicates.previous_routes",
       "category": "envoy.internal_redirect_predicates"
      },
      {
       "name": "envoy.internal_redirect_predicates.safe_cross_scheme",
       "category": "envoy.internal_redirect_predicates"
      },
      {
       "name": "envoy.ip",
       "category": "envoy.resolvers"
      },
      {
       "name": "envoy.filters.connection_pools.tcp.generic",
       "category": "envoy.upstreams"
      },
      {
       "name": "envoy.wasm.runtime.null",
       "category": "envoy.wasm.runtime"
      },
      {
       "name": "envoy.wasm.runtime.v8",
       "category": "envoy.wasm.runtime"
      },
      {
       "name": "envoy.transport_sockets.alts",
       "category": "envoy.transport_sockets.downstream"
      },
      {
       "name": "envoy.transport_sockets.quic",
       "category": "envoy.transport_sockets.downstream"
      },
      {
       "name": "envoy.transport_sockets.raw_buffer",
       "category": "envoy.transport_sockets.downstream"
      },
      {
       "name": "envoy.transport_sockets.starttls",
       "category": "envoy.transport_sockets.downstream"
      },
      {
       "name": "envoy.transport_sockets.tap",
       "category": "envoy.transport_sockets.downstream"
      },
      {
       "name": "envoy.transport_sockets.tls",
       "category": "envoy.transport_sockets.downstream"
      },
      {
       "name": "raw_buffer",
       "category": "envoy.transport_sockets.downstream"
      },
      {
       "name": "starttls",
       "category": "envoy.transport_sockets.downstream"
      },
      {
       "name": "tls",
       "category": "envoy.transport_sockets.downstream"
      },
      {
       "name": "auto",
       "category": "envoy.thrift_proxy.protocols"
      },
      {
       "name": "binary",
       "category": "envoy.thrift_proxy.protocols"
      },
      {
       "name": "binary/non-strict",
       "category": "envoy.thrift_proxy.protocols"
      },
      {
       "name": "compact",
       "category": "envoy.thrift_proxy.protocols"
      },
      {
       "name": "twitter",
       "category": "envoy.thrift_proxy.protocols"
      },
      {
       "name": "envoy.rate_limit_descriptors.expr",
       "category": "envoy.rate_limit_descriptors"
      },
      {
       "name": "envoy.resource_monitors.fixed_heap",
       "category": "envoy.resource_monitors"
      },
      {
       "name": "envoy.resource_monitors.injected_resource",
       "category": "envoy.resource_monitors"
      },
      {
       "name": "envoy.filters.listener.http_inspector",
       "category": "envoy.filters.listener"
      },
      {
       "name": "envoy.filters.listener.original_dst",
       "category": "envoy.filters.listener"
      },
      {
       "name": "envoy.filters.listener.original_src",
       "category": "envoy.filters.listener"
      },
      {
       "name": "envoy.filters.listener.proxy_protocol",
       "category": "envoy.filters.listener"
      },
      {
       "name": "envoy.filters.listener.tls_inspector",
       "category": "envoy.filters.listener"
      },
      {
       "name": "envoy.listener.http_inspector",
       "category": "envoy.filters.listener"
      },
      {
       "name": "envoy.listener.original_dst",
       "category": "envoy.filters.listener"
      },
      {
       "name": "envoy.listener.original_src",
       "category": "envoy.filters.listener"
      },
      {
       "name": "envoy.listener.proxy_protocol",
       "category": "envoy.filters.listener"
      },
      {
       "name": "envoy.listener.tls_inspector",
       "category": "envoy.filters.listener"
      },
      {
       "name": "envoy.grpc_credentials.aws_iam",
       "category": "envoy.grpc_credentials"
      },
      {
       "name": "envoy.grpc_credentials.default",
       "category": "envoy.grpc_credentials"
      },
      {
       "name": "envoy.grpc_credentials.file_based_metadata",
       "category": "envoy.grpc_credentials"
      },
      {
       "name": "envoy.compression.gzip.decompressor",
       "category": "envoy.compression.decompressor"
      },
      {
       "name": "envoy.access_loggers.file",
       "category": "envoy.access_loggers"
      },
      {
       "name": "envoy.access_loggers.http_grpc",
       "category": "envoy.access_loggers"
      },
      {
       "name": "envoy.access_loggers.tcp_grpc",
       "category": "envoy.access_loggers"
      },
      {
       "name": "envoy.access_loggers.wasm",
       "category": "envoy.access_loggers"
      },
      {
       "name": "envoy.file_access_log",
       "category": "envoy.access_loggers"
      },
      {
       "name": "envoy.http_grpc_access_log",
       "category": "envoy.access_loggers"
      },
      {
       "name": "envoy.tcp_grpc_access_log",
       "category": "envoy.access_loggers"
      },
      {
       "name": "envoy.wasm_access_log",
       "category": "envoy.access_loggers"
      },
      {
       "name": "envoy.client_ssl_auth",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.echo",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.ext_authz",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.client_ssl_auth",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.direct_response",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.dubbo_proxy",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.echo",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.ext_authz",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.http_connection_manager",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.kafka_broker",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.local_ratelimit",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.metadata_exchange",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.mongo_proxy",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.mysql_proxy",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.postgres_proxy",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.ratelimit",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.rbac",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.redis_proxy",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.rocketmq_proxy",
""", """
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.sni_cluster",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.sni_dynamic_forward_proxy",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.tcp_cluster_rewrite",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.tcp_proxy",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.thrift_proxy",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.wasm",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.filters.network.zookeeper_proxy",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.http_connection_manager",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.mongo_proxy",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.ratelimit",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.redis_proxy",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.tcp_proxy",
       "category": "envoy.filters.network"
      },
      {
       "name": "forward_downstream_sni",
       "category": "envoy.filters.network"
      },
      {
       "name": "sni_verifier",
       "category": "envoy.filters.network"
      },
      {
       "name": "envoy.health_checkers.redis",
       "category": "envoy.health_checkers"
      },
      {
       "name": "envoy.buffer",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.cors",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.csrf",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.ext_authz",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.ext_proc",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.fault",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.adaptive_concurrency",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.admission_control",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.aws_lambda",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.aws_request_signing",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.buffer",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.cache",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.cdn_loop",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.compressor",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.cors",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.csrf",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.decompressor",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.dynamic_forward_proxy",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.dynamo",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.ext_authz",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.ext_proc",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.fault",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.grpc_http1_bridge",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.grpc_http1_reverse_bridge",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.grpc_json_transcoder",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.grpc_stats",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.grpc_web",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.gzip",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.header_to_metadata",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.health_check",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.ip_tagging",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.jwt_authn",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.local_ratelimit",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.lua",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.oauth2",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.on_demand",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.original_src",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.ratelimit",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.rbac",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.router",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.squash",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.tap",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.filters.http.wasm",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.grpc_http1_bridge",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.grpc_json_transcoder",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.grpc_web",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.gzip",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.health_check",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.http_dynamo_filter",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.ip_tagging",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.local_rate_limit",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.lua",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.rate_limit",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.router",
       "category": "envoy.filters.http"
      },
      {
       "name": "envoy.squash",
       "category": "envoy.filters.http"
      },
      {
       "name": "istio.alpn",
       "category": "envoy.filters.http"
      },
      {
       "name": "istio_authn",
       "category": "envoy.filters.http"
      },
      {
       "name": "dubbo",
       "category": "envoy.dubbo_proxy.protocols"
      },
      {
       "name": "envoy.filters.udp.dns_filter",
       "category": "envoy.filters.udp_listener"
      },
      {
       "name": "envoy.filters.udp_listener.udp_proxy",
       "category": "envoy.filters.udp_listener"
      },
      {
       "name": "envoy.cluster.eds",
       "category": "envoy.clusters"
      },
      {
       "name": "envoy.cluster.logical_dns",
       "category": "envoy.clusters"
      },
      {
       "name": "envoy.cluster.original_dst",
       "category": "envoy.clusters"
      },
      {
       "name": "envoy.cluster.static",
       "category": "envoy.clusters"
      },
      {
       "name": "envoy.cluster.strict_dns",
       "category": "envoy.clusters"
      },
      {
       "name": "envoy.clusters.aggregate",
       "category": "envoy.clusters"
      },
      {
       "name": "envoy.clusters.dynamic_forward_proxy",
       "category": "envoy.clusters"
      },
      {
       "name": "envoy.clusters.redis",
       "category": "envoy.clusters"
      },
      {
       "name": "quiche",
       "category": "envoy.quic_client_codec"
      },
      {
       "name": "envoy.extensions.http.cache.simple",
       "category": "envoy.http.cache"
      },
      {
       "name": "envoy.retry_host_predicates.omit_canary_hosts",
       "category": "envoy.retry_host_predicates"
      },
      {
       "name": "envoy.retry_host_predicates.omit_host_metadata",
       "category": "envoy.retry_host_predicates"
      },
      {
       "name": "envoy.retry_host_predicates.previous_hosts",
       "category": "envoy.retry_host_predicates"
      },
      {
       "name": "envoy.filters.network.upstream.metadata_exchange",
       "category": "envoy.filters.upstream_network"
      },
      {
       "name": "quiche",
       "category": "envoy.quic_server_codec"
      },
      {
       "name": "envoy.retry_priorities.previous_priorities",
       "category": "envoy.retry_priorities"
      },
      {
       "name": "envoy.watchdog.abort_action",
       "category": "envoy.guarddog_actions"
      },
      {
       "name": "envoy.watchdog.profile_action",
       "category": "envoy.guarddog_actions"
      }
     ]
    },
    "static_resources": {
     "listeners": [
      {
       "address": {
        "socket_address": {
         "address": "0.0.0.0",
         "port_value": 15090
        }
       },
       "filter_chains": [
        {
         "filters": [
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "stats",
            "route_config": {
             "virtual_hosts": [
              {
               "name": "backend",
               "domains": [
                "*"
               ],
               "routes": [
                {
                 "match": {
                  "prefix": "/stats/prometheus"
                 },
                 "route": {
                  "cluster": "prometheus_stats"
                 }
                }
               ]
              }
             ]
            },
            "http_filters": [
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ]
           }
          }
         ]
        }
       ]
      },
      {
       "address": {
        "socket_address": {
         "address": "0.0.0.0",
         "port_value": 15021
        }
       },
       "filter_chains": [
        {
         "filters": [
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "agent",
            "route_config": {
             "virtual_hosts": [
              {
               "name": "backend",
               "domains": [
                "*"
               ],
               "routes": [
                {
                 "match": {
                  "prefix": "/healthz/ready"
                 },
                 "route": {
                  "cluster": "agent"
                 }
                }
               ]
              }
             ]
            },
            "http_filters": [
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ]
           }
          }
         ]
        }
       ]
      }
     ],
     "clusters": [
      {
       "name": "prometheus_stats",
       "type": "STATIC",
       "connect_timeout": "0.250s",
       "load_assignment": {
        "cluster_name": "prometheus_stats",
        "endpoints": [
         {
          "lb_endpoints": [
           {
            "endpoint": {
             "address": {
              "socket_address": {
               "address": "127.0.0.1",
               "port_value": 15000
              }
             }
            }
           }
          ]
         }
        ]
""", """
       }
      },
      {
       "name": "agent",
       "type": "STATIC",
       "connect_timeout": "0.250s",
       "load_assignment": {
        "cluster_name": "prometheus_stats",
        "endpoints": [
         {
          "lb_endpoints": [
           {
            "endpoint": {
             "address": {
              "socket_address": {
               "address": "127.0.0.1",
               "port_value": 15020
              }
             }
            }
           }
          ]
         }
        ]
       }
      },
      {
       "name": "sds-grpc",
       "type": "STATIC",
       "connect_timeout": "1s",
       "http2_protocol_options": {},
       "load_assignment": {
        "cluster_name": "sds-grpc",
        "endpoints": [
         {
          "lb_endpoints": [
           {
            "endpoint": {
             "address": {
              "pipe": {
               "path": "./etc/istio/proxy/SDS"
              }
             }
            }
           }
          ]
         }
        ]
       }
      },
      {
       "name": "xds-grpc",
       "type": "STATIC",
       "connect_timeout": "1s",
       "max_requests_per_connection": 1,
       "circuit_breakers": {
        "thresholds": [
         {
          "max_connections": 100000,
          "max_pending_requests": 100000,
          "max_requests": 100000
         },
         {
          "priority": "HIGH",
          "max_connections": 100000,
          "max_pending_requests": 100000,
          "max_requests": 100000
         }
        ]
       },
       "http2_protocol_options": {},
       "upstream_connection_options": {
        "tcp_keepalive": {
         "keepalive_time": 300
        }
       },
       "load_assignment": {
        "cluster_name": "xds-grpc",
        "endpoints": [
         {
          "lb_endpoints": [
           {
            "endpoint": {
             "address": {
              "pipe": {
               "path": "./etc/istio/proxy/XDS"
              }
             }
            }
           }
          ]
         }
        ]
       }
      },
      {
       "name": "zipkin",
       "type": "STRICT_DNS",
       "connect_timeout": "1s",
       "dns_refresh_rate": "30s",
       "dns_lookup_family": "V4_ONLY",
       "load_assignment": {
        "cluster_name": "zipkin",
        "endpoints": [
         {
          "lb_endpoints": [
           {
            "endpoint": {
             "address": {
              "socket_address": {
               "address": "zipkin.istio-system",
               "port_value": 9411
              }
             }
            }
           }
          ]
         }
        ]
       },
       "respect_dns_ttl": true
      }
     ]
    },
    "dynamic_resources": {
     "lds_config": {
      "ads": {},
      "resource_api_version": "V3"
     },
     "cds_config": {
      "ads": {},
      "resource_api_version": "V3"
     },
     "ads_config": {
      "api_type": "GRPC",
      "grpc_services": [
       {
        "envoy_grpc": {
         "cluster_name": "xds-grpc"
        }
       }
      ],
      "set_node_on_first_message_only": true,
      "transport_api_version": "V3"
     }
    },
    "tracing": {
     "http": {
      "name": "envoy.tracers.zipkin",
      "typed_config": {
       "@type": "type.googleapis.com/envoy.config.trace.v3.ZipkinConfig",
       "collector_cluster": "zipkin",
       "collector_endpoint": "/api/v2/spans",
       "trace_id_128bit": true,
       "shared_span_context": false,
       "collector_endpoint_version": "HTTP_JSON"
      }
     }
    },
    "admin": {
     "access_log_path": "/dev/null",
     "profile_path": "/var/lib/istio/data/envoy.prof",
     "address": {
      "socket_address": {
       "address": "127.0.0.1",
       "port_value": 15000
      }
     }
    },
    "stats_config": {
     "stats_tags": [
      {
       "tag_name": "cluster_name",
       "regex": "^cluster\\.((.+?(\\..+?\\.svc\\.cluster\\.local)?)\\.)"
      },
      {
       "tag_name": "tcp_prefix",
       "regex": "^tcp\\.((.*?)\\.)\\w+?$"
      },
      {
       "tag_name": "response_code",
       "regex": "(response_code=\\.=(.+?);\\.;)|_rq(_(\\.d{3}))$"
      },
      {
       "tag_name": "response_code_class",
       "regex": "_rq(_(\\dxx))$"
      },
      {
       "tag_name": "http_conn_manager_listener_prefix",
       "regex": "^listener(?=\\.).*?\\.http\\.(((?:[_.[:digit:]]*|[_\\[\\]aAbBcCdDeEfF[:digit:]]*))\\.)"
      },
      {
       "tag_name": "http_conn_manager_prefix",
       "regex": "^http\\.(((?:[_.[:digit:]]*|[_\\[\\]aAbBcCdDeEfF[:digit:]]*))\\.)"
      },
      {
       "tag_name": "listener_address",
       "regex": "^listener\\.(((?:[_.[:digit:]]*|[_\\[\\]aAbBcCdDeEfF[:digit:]]*))\\.)"
      },
      {
       "tag_name": "mongo_prefix",
       "regex": "^mongo\\.(.+?)\\.(collection|cmd|cx_|op_|delays_|decoding_)(.*?)$"
      },
      {
       "tag_name": "reporter",
       "regex": "(reporter=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "source_namespace",
       "regex": "(source_namespace=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "source_workload",
       "regex": "(source_workload=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "source_workload_namespace",
       "regex": "(source_workload_namespace=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "source_principal",
       "regex": "(source_principal=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "source_app",
       "regex": "(source_app=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "source_version",
       "regex": "(source_version=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "source_cluster",
       "regex": "(source_cluster=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_namespace",
       "regex": "(destination_namespace=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_workload",
       "regex": "(destination_workload=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_workload_namespace",
       "regex": "(destination_workload_namespace=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_principal",
       "regex": "(destination_principal=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_app",
       "regex": "(destination_app=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_version",
       "regex": "(destination_version=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_service",
       "regex": "(destination_service=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_service_name",
       "regex": "(destination_service_name=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_service_namespace",
       "regex": "(destination_service_namespace=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_port",
       "regex": "(destination_port=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_cluster",
       "regex": "(destination_cluster=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "request_protocol",
       "regex": "(request_protocol=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "request_operation",
       "regex": "(request_operation=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "request_host",
       "regex": "(request_host=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "response_flags",
       "regex": "(response_flags=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "grpc_response_status",
       "regex": "(grpc_response_status=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "connection_security_policy",
       "regex": "(connection_security_policy=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "permissive_response_code",
       "regex": "(permissive_response_code=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "permissive_response_policyid",
       "regex": "(permissive_response_policyid=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "source_canonical_service",
       "regex": "(source_canonical_service=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_canonical_service",
       "regex": "(destination_canonical_service=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "source_canonical_revision",
       "regex": "(source_canonical_revision=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "destination_canonical_revision",
       "regex": "(destination_canonical_revision=\\.=(.*?);\\.;)"
      },
      {
       "tag_name": "cache",
       "regex": "(cache\\.(.+?)\\.)"
      },
      {
       "tag_name": "component",
       "regex": "(component\\.(.+?)\\.)"
      },
      {
       "tag_name": "tag",
       "regex": "(tag\\.(.+?);\\.)"
      },
      {
       "tag_name": "wasm_filter",
       "regex": "(wasm_filter\\.(.+?)\\.)"
      }
     ],
     "use_all_default_tags": false,
     "stats_matcher": {
      "inclusion_list": {
       "patterns": [
        {
         "prefix": "reporter="
        },
        {
         "prefix": "cluster_manager"
        },
        {
         "prefix": "listener_manager"
        },
        {
         "prefix": "server"
        },
        {
         "prefix": "cluster.xds-grpc"
        },
        {
         "prefix": "wasm"
        },
        {
         "prefix": "component"
        }
       ]
      }
     }
    },
    "layered_runtime": {
     "layers": [
      {
       "name": "deprecation",
       "static_layer": {
        "re2.max_program_size.error_level": 1024,
        "envoy.reloadable_features.strict_1xx_and_204_response_headers": false
       }
      },
      {
       "name": "global config",
       "static_layer": {
        "overload.global_downstream_max_connections": 2147483647
       }
      },
      {
       "name": "admin",
       "admin_layer": {}
      }
     ]
    }
   },
   "last_updated": "2021-03-25T08:12:04.858Z"
  },
  {
   "@type": "type.googleapis.com/envoy.admin.v3.ClustersConfigDump",
   "version_info": "2021-03-25T08:16:06Z/16",
   "static_clusters": [
    {
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "agent",
      "type": "STATIC",
      "connect_timeout": "0.250s",
      "load_assignment": {
       "cluster_name": "prometheus_stats",
       "endpoints": [
        {
         "lb_endpoints": [
          {
           "endpoint": {
            "address": {
             "socket_address": {
              "address": "127.0.0.1",
              "port_value": 15020
             }
            }
           }
          }
         ]
        }
       ]
      }
     },
     "last_updated": "2021-03-25T08:12:04.868Z"
    },
    {
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "prometheus_stats",
      "type": "STATIC",
      "connect_timeout": "0.250s",
      "load_assignment": {
       "cluster_name": "prometheus_stats",
       "endpoints": [
        {
         "lb_endpoints": [
          {
           "endpoint": {
            "address": {
             "socket_address": {
              "address": "127.0.0.1",
              "port_value": 15000
             }
            }
           }
          }
         ]
        }
       ]
      }
     },
     "last_updated": "2021-03-25T08:12:04.868Z"
    },
    {
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "sds-grpc",
      "type": "STATIC",
      "connect_timeout": "1s",
      "http2_protocol_options": {},
      "load_assignment": {
       "cluster_name": "sds-grpc",
       "endpoints": [
        {
         "lb_endpoints": [
          {
           "endpoint": {
            "address": {
             "pipe": {
              "path": "./etc/istio/proxy/SDS"
             }
            }
           }
          }
         ]
        }
       ]
      }
     },
     "last_updated": "2021-03-25T08:12:04.868Z"
    },
    {
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "xds-grpc",
      "type": "STATIC",
      "connect_timeout": "1s",
      "max_requests_per_connection": 1,
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 100000,
         "max_pending_requests": 100000,
         "max_requests": 100000
        },
        {
""", """
         "priority": "HIGH",
         "max_connections": 100000,
         "max_pending_requests": 100000,
         "max_requests": 100000
        }
       ]
      },
      "http2_protocol_options": {},
      "upstream_connection_options": {
       "tcp_keepalive": {
        "keepalive_time": 300
       }
      },
      "load_assignment": {
       "cluster_name": "xds-grpc",
       "endpoints": [
        {
         "lb_endpoints": [
          {
           "endpoint": {
            "address": {
             "pipe": {
              "path": "./etc/istio/proxy/XDS"
             }
            }
           }
          }
         ]
        }
       ]
      }
     },
     "last_updated": "2021-03-25T08:12:04.885Z"
    },
    {
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "zipkin",
      "type": "STRICT_DNS",
      "connect_timeout": "1s",
      "dns_refresh_rate": "30s",
      "dns_lookup_family": "V4_ONLY",
      "load_assignment": {
       "cluster_name": "zipkin",
       "endpoints": [
        {
         "lb_endpoints": [
          {
           "endpoint": {
            "address": {
             "socket_address": {
              "address": "zipkin.istio-system",
              "port_value": 9411
             }
            }
           }
          }
         ]
        }
       ]
      },
      "respect_dns_ttl": true
     },
     "last_updated": "2021-03-25T08:12:04.885Z"
    }
   ],
   "dynamic_active_clusters": [
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "BlackHoleCluster",
      "type": "STATIC",
      "connect_timeout": "10s",
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.921Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "InboundPassthroughClusterIpv4",
      "type": "ORIGINAL_DST",
      "connect_timeout": "10s",
      "lb_policy": "CLUSTER_PROVIDED",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "upstream_bind_config": {
       "source_address": {
        "address": "127.0.0.6",
        "port_value": 0
       }
      },
      "protocol_selection": "USE_DOWNSTREAM_PROTOCOL"
     },
     "last_updated": "2021-03-25T08:12:04.921Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "PassthroughCluster",
      "type": "ORIGINAL_DST",
      "connect_timeout": "10s",
      "lb_policy": "CLUSTER_PROVIDED",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "protocol_selection": "USE_DOWNSTREAM_PROTOCOL",
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.921Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "inbound|9080||",
      "type": "STATIC",
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
           "host": "productpage.default.svc.cluster.local",
           "namespace": "default",
           "name": "productpage"
          }
         ]
        }
       }
      },
      "load_assignment": {
       "cluster_name": "inbound|9080||",
       "endpoints": [
        {
         "lb_endpoints": [
          {
           "endpoint": {
            "address": {
             "socket_address": {
              "address": "127.0.0.1",
              "port_value": 9080
             }
            }
           }
          }
         ]
        }
       ]
      }
     },
     "last_updated": "2021-03-25T08:12:04.921Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|15010||istio-pilot.mesh-operator.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|15010||istio-pilot.mesh-operator.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "http2_protocol_options": {
       "max_concurrent_streams": 1073741824
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
           "namespace": "mesh-operator",
           "name": "istio-pilot",
           "host": "istio-pilot.mesh-operator.svc.cluster.local"
          }
         ],
         "default_original_port": 15010
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio",
            "h2"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/mesh-operator/sa/istio-pilot-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.15010_._.istio-pilot.mesh-operator.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.919Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|15010||istiod.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|15010||istiod.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "http2_protocol_options": {
       "max_concurrent_streams": 1073741824
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
           "namespace": "istio-system",
           "host": "istiod.istio-system.svc.cluster.local",
           "name": "istiod"
          }
         ],
         "default_original_port": 15010
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio",
            "h2"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/istiod-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.15010_._.istiod.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.910Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|15011||istio-pilot.mesh-operator.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|15011||istio-pilot.mesh-operator.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
""", """
           "name": "istio-pilot",
           "namespace": "mesh-operator",
           "host": "istio-pilot.mesh-operator.svc.cluster.local"
          }
         ],
         "default_original_port": 15011
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/mesh-operator/sa/istio-pilot-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.15011_._.istio-pilot.mesh-operator.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.919Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|15012||istiod.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|15012||istiod.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 15012,
         "services": [
          {
           "namespace": "istio-system",
           "name": "istiod",
           "host": "istiod.istio-system.svc.cluster.local"
          }
         ]
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/istiod-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.15012_._.istiod.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.911Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|15014||istio-pilot.mesh-operator.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|15014||istio-pilot.mesh-operator.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
           "host": "istio-pilot.mesh-operator.svc.cluster.local",
           "name": "istio-pilot",
           "namespace": "mesh-operator"
          }
         ],
         "default_original_port": 15014
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/mesh-operator/sa/istio-pilot-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.15014_._.istio-pilot.mesh-operator.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.920Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|15014||istiod.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|15014||istiod.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
           "name": "istiod",
           "namespace": "istio-system",
           "host": "istiod.istio-system.svc.cluster.local"
          }
         ],
         "default_original_port": 15014
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/istiod-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.15014_._.istiod.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.911Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|15021||istio-ingressgateway.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
""", """
        "resource_api_version": "V3"
       },
       "service_name": "outbound|15021||istio-ingressgateway.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "http2_protocol_options": {
       "max_concurrent_streams": 1073741824
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 15021,
         "services": [
          {
           "namespace": "istio-system",
           "host": "istio-ingressgateway.istio-system.svc.cluster.local",
           "name": "istio-ingressgateway"
          }
         ]
        }
       }
      },
      "protocol_selection": "USE_DOWNSTREAM_PROTOCOL",
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio",
            "h2"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/istio-ingressgateway-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.15021_._.istio-ingressgateway.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.913Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|15443||istio-egressgateway.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|15443||istio-egressgateway.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 15443,
         "services": [
          {
           "name": "istio-egressgateway",
           "namespace": "istio-system",
           "host": "istio-egressgateway.istio-system.svc.cluster.local"
          }
         ]
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/istio-egressgateway-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.15443_._.istio-egressgateway.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.913Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|15443||istio-ingressgateway.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|15443||istio-ingressgateway.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 15443,
         "services": [
          {
           "namespace": "istio-system",
           "host": "istio-ingressgateway.istio-system.svc.cluster.local",
           "name": "istio-ingressgateway"
          }
         ]
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/istio-ingressgateway-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.15443_._.istio-ingressgateway.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.915Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|31400||istio-ingressgateway.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|31400||istio-ingressgateway.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 31400,
         "services": [
          {
           "host": "istio-ingressgateway.istio-system.svc.cluster.local",
           "namespace": "istio-system",
           "name": "istio-ingressgateway"
          }
         ]
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/istio-ingressgateway-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
""", """
          },
          "sni": "outbound_.31400_._.istio-ingressgateway.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.915Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|443||istio-egressgateway.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|443||istio-egressgateway.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
           "namespace": "istio-system",
           "name": "istio-egressgateway",
           "host": "istio-egressgateway.istio-system.svc.cluster.local"
          }
         ],
         "default_original_port": 443
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/istio-egressgateway-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.443_._.istio-egressgateway.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.912Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|443||istio-ingressgateway.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|443||istio-ingressgateway.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
           "namespace": "istio-system",
           "name": "istio-ingressgateway",
           "host": "istio-ingressgateway.istio-system.svc.cluster.local"
          }
         ],
         "default_original_port": 443
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/istio-ingressgateway-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.443_._.istio-ingressgateway.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.914Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|443||istiod.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|443||istiod.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
           "host": "istiod.istio-system.svc.cluster.local",
           "name": "istiod",
           "namespace": "istio-system"
          }
         ],
         "default_original_port": 443
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/istiod-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.443_._.istiod.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.911Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|8080||istio-pilot.mesh-operator.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|8080||istio-pilot.mesh-operator.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 8080,
         "services": [
          {
           "host": "istio-pilot.mesh-operator.svc.cluster.local",
           "name": "istio-pilot",
           "namespace": "mesh-operator"
          }
         ]
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/mesh-operator/sa/istio-pilot-service-account"
              }
             ]
            },
""", """
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.8080_._.istio-pilot.mesh-operator.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.920Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|80||istio-egressgateway.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|80||istio-egressgateway.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "http2_protocol_options": {
       "max_concurrent_streams": 1073741824
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
           "name": "istio-egressgateway",
           "namespace": "istio-system",
           "host": "istio-egressgateway.istio-system.svc.cluster.local"
          }
         ],
         "default_original_port": 80
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio",
            "h2"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/istio-egressgateway-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.80_._.istio-egressgateway.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.912Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|80||istio-ingressgateway.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|80||istio-ingressgateway.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "http2_protocol_options": {
       "max_concurrent_streams": 1073741824
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 80,
         "services": [
          {
           "host": "istio-ingressgateway.istio-system.svc.cluster.local",
           "name": "istio-ingressgateway",
           "namespace": "istio-system"
          }
         ]
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio",
            "h2"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/istio-ingressgateway-service-account"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.80_._.istio-ingressgateway.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.914Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|80||lazyload.mesh-operator.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|80||lazyload.mesh-operator.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 80,
         "services": [
          {
           "host": "lazyload.mesh-operator.svc.cluster.local",
           "namespace": "mesh-operator",
           "name": "lazyload"
          }
         ]
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/mesh-operator/sa/lazyload"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.80_._.lazyload.mesh-operator.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.921Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|80||limiter.mesh-operator.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|80||limiter.mesh-operator.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 80,
         "services": [
          {
           "host": "limiter.mesh-operator.svc.cluster.local",
           "name": "limiter",
           "namespace": "mesh-operator"
          }
         ]
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
""", """
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/mesh-operator/sa/limiter"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.80_._.limiter.mesh-operator.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.917Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|8383||slime-boot-metrics.mesh-operator.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|8383||slime-boot-metrics.mesh-operator.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 8383,
         "services": [
          {
           "host": "slime-boot-metrics.mesh-operator.svc.cluster.local",
           "name": "slime-boot-metrics",
           "namespace": "mesh-operator"
          }
         ]
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/mesh-operator/sa/slime-boot"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.8383_._.slime-boot-metrics.mesh-operator.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.917Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|8383||slime-metrics.mesh-operator.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|8383||slime-metrics.mesh-operator.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 8383,
         "services": [
          {
           "namespace": "mesh-operator",
           "host": "slime-metrics.mesh-operator.svc.cluster.local",
           "name": "slime-metrics"
          }
         ]
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {},
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.8383_._.slime-metrics.mesh-operator.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.917Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|8686||slime-boot-metrics.mesh-operator.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|8686||slime-boot-metrics.mesh-operator.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "http2_protocol_options": {
       "max_concurrent_streams": 1073741824
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 8686,
         "services": [
          {
           "name": "slime-boot-metrics",
           "namespace": "mesh-operator",
           "host": "slime-boot-metrics.mesh-operator.svc.cluster.local"
          }
         ]
        }
       }
      },
      "protocol_selection": "USE_DOWNSTREAM_PROTOCOL",
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio",
            "h2"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/mesh-operator/sa/slime-boot"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.8686_._.slime-boot-metrics.mesh-operator.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.916Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|8686||slime-metrics.mesh-operator.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|8686||slime-metrics.mesh-operator.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "http2_protocol_options": {
       "max_concurrent_streams": 1073741824
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
           "name": "slime-metrics",
           "host": "slime-metrics.mesh-operator.svc.cluster.local",
           "namespace": "mesh-operator"
          }
         ],
         "default_original_port": 8686
        }
       }
      },
      "protocol_selection": "USE_DOWNSTREAM_PROTOCOL",
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
""", """
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio",
            "h2"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {},
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.8686_._.slime-metrics.mesh-operator.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.918Z"
    },
    {
     "version_info": "2021-03-25T08:15:36Z/15",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|9080|v1|details.default.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|9080|v1|details.default.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "config": "/apis/networking.istio.io/v1alpha3/namespaces/default/destination-rule/details",
         "subset": "v1",
         "default_original_port": 9080,
         "services": [
          {
           "namespace": "default",
           "host": "details.default.svc.cluster.local",
           "name": "details"
          }
         ]
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/default/sa/bookinfo-details"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.9080_.v1_.details.default.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:15:36.238Z"
    },
    {
     "version_info": "2021-03-25T08:15:36Z/15",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|9080|v2|details.default.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|9080|v2|details.default.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "subset": "v2",
         "services": [
          {
           "namespace": "default",
           "host": "details.default.svc.cluster.local",
           "name": "details"
          }
         ],
         "config": "/apis/networking.istio.io/v1alpha3/namespaces/default/destination-rule/details",
         "default_original_port": 9080
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/default/sa/bookinfo-details"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.9080_.v2_.details.default.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:15:36.242Z"
    },
    {
     "version_info": "2021-03-25T08:15:36Z/15",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|9080||details.default.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|9080||details.default.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "config": "/apis/networking.istio.io/v1alpha3/namespaces/default/destination-rule/details",
         "services": [
          {
           "namespace": "default",
           "host": "details.default.svc.cluster.local",
           "name": "details"
          }
         ],
         "default_original_port": 9080
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/default/sa/bookinfo-details"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.9080_._.details.default.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:15:36.220Z"
    },
    {
     "version_info": "2021-03-25T08:13:13Z/14",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|9080||global-sidecar.default.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|9080||global-sidecar.default.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
""", """
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "default_original_port": 9080,
         "services": [
          {
           "namespace": "default",
           "name": "global-sidecar",
           "host": "global-sidecar.default.svc.cluster.local"
          }
         ]
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/default/sa/global-sidecar"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.9080_._.global-sidecar.default.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:13:13.516Z"
    },
    {
     "version_info": "2021-03-25T08:16:06Z/16",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|9080||reviews.default.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|9080||reviews.default.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
           "namespace": "default",
           "host": "reviews.default.svc.cluster.local",
           "name": "reviews"
          }
         ],
         "default_original_port": 9080
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/default/sa/bookinfo-reviews"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.9080_._.reviews.default.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:16:06.137Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "cluster": {
      "@type": "type.googleapis.com/envoy.config.cluster.v3.Cluster",
      "name": "outbound|9090||prometheus.istio-system.svc.cluster.local",
      "type": "EDS",
      "eds_cluster_config": {
       "eds_config": {
        "ads": {},
        "resource_api_version": "V3"
       },
       "service_name": "outbound|9090||prometheus.istio-system.svc.cluster.local"
      },
      "connect_timeout": "10s",
      "circuit_breakers": {
       "thresholds": [
        {
         "max_connections": 4294967295,
         "max_pending_requests": 4294967295,
         "max_requests": 4294967295,
         "max_retries": 4294967295
        }
       ]
      },
      "metadata": {
       "filter_metadata": {
        "istio": {
         "services": [
          {
           "name": "prometheus",
           "namespace": "istio-system",
           "host": "prometheus.istio-system.svc.cluster.local"
          }
         ],
         "default_original_port": 9090
        }
       }
      },
      "filters": [
       {
        "name": "istio.metadata_exchange",
        "typed_config": {
         "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
         "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
         "value": {
          "protocol": "istio-peer-exchange"
         }
        }
       }
      ],
      "transport_socket_matches": [
       {
        "name": "tlsMode-istio",
        "match": {
         "tlsMode": "istio"
        },
        "transport_socket": {
         "name": "envoy.transport_sockets.tls",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.UpstreamTlsContext",
          "common_tls_context": {
           "alpn_protocols": [
            "istio-peer-exchange",
            "istio"
           ],
           "tls_certificate_sds_secret_configs": [
            {
             "name": "default",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           ],
           "combined_validation_context": {
            "default_validation_context": {
             "match_subject_alt_names": [
              {
               "exact": "spiffe://cluster.local/ns/istio-system/sa/prometheus"
              }
             ]
            },
            "validation_context_sds_secret_config": {
             "name": "ROOTCA",
             "sds_config": {
              "api_config_source": {
               "api_type": "GRPC",
               "grpc_services": [
                {
                 "envoy_grpc": {
                  "cluster_name": "sds-grpc"
                 }
                }
               ],
               "set_node_on_first_message_only": true,
               "transport_api_version": "V3"
              },
              "initial_fetch_timeout": "0s",
              "resource_api_version": "V3"
             }
            }
           }
          },
          "sni": "outbound_.9090_._.prometheus.istio-system.svc.cluster.local"
         }
        }
       },
       {
        "name": "tlsMode-disabled",
        "match": {},
        "transport_socket": {
         "name": "envoy.transport_sockets.raw_buffer"
        }
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.916Z"
    }
   ]
  },
  {
   "@type": "type.googleapis.com/envoy.admin.v3.ListenersConfigDump",
   "version_info": "2021-03-25T08:05:35Z/13",
   "static_listeners": [
    {
     "listener": {
      "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
      "address": {
       "socket_address": {
        "address": "0.0.0.0",
        "port_value": 15090
       }
      },
      "filter_chains": [
       {
        "filters": [
         {
          "name": "envoy.filters.network.http_connection_manager",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
           "stat_prefix": "stats",
           "route_config": {
            "virtual_hosts": [
             {
              "name": "backend",
              "domains": [
               "*"
              ],
              "routes": [
               {
                "match": {
                 "prefix": "/stats/prometheus"
                },
                "route": {
                 "cluster": "prometheus_stats"
                }
               }
              ]
             }
            ]
           },
           "http_filters": [
            {
             "name": "envoy.filters.http.router",
             "typed_config": {
              "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
             }
            }
           ]
          }
         }
        ]
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.895Z"
    },
    {
     "listener": {
      "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
      "address": {
       "socket_address": {
        "address": "0.0.0.0",
        "port_value": 15021
       }
      },
      "filter_chains": [
       {
        "filters": [
         {
          "name": "envoy.filters.network.http_connection_manager",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
           "stat_prefix": "agent",
           "route_config": {
            "virtual_hosts": [
             {
              "name": "backend",
              "domains": [
               "*"
              ],
              "routes": [
               {
                "match": {
                 "prefix": "/healthz/ready"
                },
                "route": {
                 "cluster": "agent"
                }
               }
              ]
             }
            ]
           },
           "http_filters": [
            {
             "name": "envoy.filters.http.router",
             "typed_config": {
              "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
             }
            }
           ]
          }
         }
        ]
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.895Z"
    }
   ],
   "dynamic_listeners": [
    {
     "name": "10.104.193.173_443",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "10.104.193.173_443",
       "address": {
        "socket_address": {
         "address": "10.104.193.173",
         "port_value": 443
        }
       },
       "filter_chains": [
        {
         "filters": [
          {
           "name": "istio.stats",
           "typed_config": {
""", """
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
             "config": {
              "root_id": "stats_outbound",
              "vm_config": {
               "vm_id": "tcp_stats_outbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "outbound|443||istio-ingressgateway.istio-system.svc.cluster.local",
            "cluster": "outbound|443||istio-ingressgateway.istio-system.svc.cluster.local",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ]
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "traffic_direction": "OUTBOUND",
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ]
      },
      "last_updated": "2021-03-25T08:12:04.950Z"
     }
    },
    {
     "name": "10.104.193.173_31400",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "10.104.193.173_31400",
       "address": {
        "socket_address": {
         "address": "10.104.193.173",
         "port_value": 31400
        }
       },
       "filter_chains": [
        {
         "filters": [
          {
           "name": "istio.stats",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
             "config": {
              "root_id": "stats_outbound",
              "vm_config": {
               "vm_id": "tcp_stats_outbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "outbound|31400||istio-ingressgateway.istio-system.svc.cluster.local",
            "cluster": "outbound|31400||istio-ingressgateway.istio-system.svc.cluster.local",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ]
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "traffic_direction": "OUTBOUND",
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ]
      },
      "last_updated": "2021-03-25T08:12:04.951Z"
     }
    },
    {
     "name": "10.105.109.31_443",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "10.105.109.31_443",
       "address": {
        "socket_address": {
         "address": "10.105.109.31",
         "port_value": 443
        }
       },
       "filter_chains": [
        {
         "filters": [
          {
           "name": "istio.stats",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
             "config": {
              "root_id": "stats_outbound",
              "vm_config": {
               "vm_id": "tcp_stats_outbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "outbound|443||istiod.istio-system.svc.cluster.local",
            "cluster": "outbound|443||istiod.istio-system.svc.cluster.local",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ]
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "traffic_direction": "OUTBOUND",
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ]
      },
      "last_updated": "2021-03-25T08:12:04.951Z"
     }
    },
    {
     "name": "10.98.141.28_15011",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "10.98.141.28_15011",
       "address": {
        "socket_address": {
         "address": "10.98.141.28",
         "port_value": 15011
        }
       },
       "filter_chains": [
        {
         "filters": [
          {
           "name": "istio.stats",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
             "config": {
              "root_id": "stats_outbound",
              "vm_config": {
               "vm_id": "tcp_stats_outbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "outbound|15011||istio-pilot.mesh-operator.svc.cluster.local",
            "cluster": "outbound|15011||istio-pilot.mesh-operator.svc.cluster.local",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ]
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "traffic_direction": "OUTBOUND",
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ]
      },
      "last_updated": "2021-03-25T08:12:04.952Z"
     }
    },
    {
     "name": "10.105.109.31_15012",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "10.105.109.31_15012",
       "address": {
        "socket_address": {
         "address": "10.105.109.31",
         "port_value": 15012
        }
       },
       "filter_chains": [
        {
         "filters": [
          {
           "name": "istio.stats",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
             "config": {
              "root_id": "stats_outbound",
              "vm_config": {
               "vm_id": "tcp_stats_outbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "outbound|15012||istiod.istio-system.svc.cluster.local",
            "cluster": "outbound|15012||istiod.istio-system.svc.cluster.local",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ]
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "traffic_direction": "OUTBOUND",
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ]
      },
      "last_updated": "2021-03-25T08:12:04.953Z"
     }
    },
    {
     "name": "10.104.255.22_15443",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "10.104.255.22_15443",
       "address": {
        "socket_address": {
         "address": "10.104.255.22",
         "port_value": 15443
        }
       },
       "filter_chains": [
        {
         "filters": [
          {
           "name": "istio.stats",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
             "config": {
              "root_id": "stats_outbound",
              "vm_config": {
               "vm_id": "tcp_stats_outbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "outbound|15443||istio-egressgateway.istio-system.svc.cluster.local",
            "cluster": "outbound|15443||istio-egressgateway.istio-system.svc.cluster.local",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ]
           }
          }
         ]
        }
       ],
""", """
       "deprecated_v1": {
        "bind_to_port": false
       },
       "traffic_direction": "OUTBOUND",
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ]
      },
      "last_updated": "2021-03-25T08:12:04.954Z"
     }
    },
    {
     "name": "10.104.255.22_443",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "10.104.255.22_443",
       "address": {
        "socket_address": {
         "address": "10.104.255.22",
         "port_value": 443
        }
       },
       "filter_chains": [
        {
         "filters": [
          {
           "name": "istio.stats",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
             "config": {
              "root_id": "stats_outbound",
              "vm_config": {
               "vm_id": "tcp_stats_outbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "outbound|443||istio-egressgateway.istio-system.svc.cluster.local",
            "cluster": "outbound|443||istio-egressgateway.istio-system.svc.cluster.local",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ]
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "traffic_direction": "OUTBOUND",
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ]
      },
      "last_updated": "2021-03-25T08:12:04.954Z"
     }
    },
    {
     "name": "10.104.193.173_15443",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "10.104.193.173_15443",
       "address": {
        "socket_address": {
         "address": "10.104.193.173",
         "port_value": 15443
        }
       },
       "filter_chains": [
        {
         "filters": [
          {
           "name": "istio.stats",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
             "config": {
              "root_id": "stats_outbound",
              "vm_config": {
               "vm_id": "tcp_stats_outbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "outbound|15443||istio-ingressgateway.istio-system.svc.cluster.local",
            "cluster": "outbound|15443||istio-ingressgateway.istio-system.svc.cluster.local",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ]
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "traffic_direction": "OUTBOUND",
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ]
      },
      "last_updated": "2021-03-25T08:12:04.955Z"
     }
    },
    {
     "name": "0.0.0.0_9090",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "0.0.0.0_9090",
       "address": {
        "socket_address": {
         "address": "0.0.0.0",
         "port_value": 9090
        }
       },
       "filter_chains": [
        {
         "filter_chain_match": {
          "transport_protocol": "raw_buffer",
          "application_protocols": [
           "http/1.0",
           "http/1.1",
           "h2c"
          ]
         },
         "filters": [
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "outbound_0.0.0.0_9090",
            "rds": {
             "config_source": {
              "ads": {},
              "resource_api_version": "V3"
             },
             "route_config_name": "9090"
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_outbound",
                 "vm_config": {
                  "vm_id": "stats_outbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "listener_filters": [
        {
         "name": "envoy.filters.listener.tls_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector"
         }
        },
        {
         "name": "envoy.filters.listener.http_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.http_inspector.v3.HttpInspector"
         }
        }
       ],
       "listener_filters_timeout": "0s",
       "traffic_direction": "OUTBOUND",
       "continue_on_listener_filters_timeout": true,
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ],
       "default_filter_chain": {
        "filter_chain_match": {},
        "filters": [
         {
          "name": "istio.stats",
          "typed_config": {
           "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
           "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
           "value": {
            "config": {
             "root_id": "stats_outbound",
             "vm_config": {
              "vm_id": "tcp_stats_outbound",
              "runtime": "envoy.wasm.runtime.null",
              "code": {
               "local": {
                "inline_string": "envoy.wasm.stats"
               }
              }
             },
             "configuration": {
              "@type": "type.googleapis.com/google.protobuf.StringValue",
              "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
             }
            }
           }
          }
         },
         {
          "name": "envoy.filters.network.tcp_proxy",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
           "stat_prefix": "PassthroughCluster",
           "cluster": "PassthroughCluster",
           "access_log": [
            {
             "name": "envoy.access_loggers.file",
             "typed_config": {
              "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
              "path": "/dev/stdout",
              "log_format": {
               "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
              }
             }
            }
           ]
          }
         }
        ],
        "name": "PassthroughFilterChain"
       }
      },
      "last_updated": "2021-03-25T08:12:04.959Z"
     }
    },
    {
     "name": "10.96.138.223_8686",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "10.96.138.223_8686",
       "address": {
        "socket_address": {
         "address": "10.96.138.223",
         "port_value": 8686
        }
       },
       "filter_chains": [
        {
         "filter_chain_match": {
          "transport_protocol": "raw_buffer",
          "application_protocols": [
           "http/1.0",
           "http/1.1",
           "h2c"
          ]
         },
         "filters": [
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
""", """
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "outbound_10.96.138.223_8686",
            "rds": {
             "config_source": {
              "ads": {},
              "resource_api_version": "V3"
             },
             "route_config_name": "slime-metrics.mesh-operator.svc.cluster.local:8686"
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "istio.alpn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.alpn.v2alpha1.FilterConfig",
               "alpn_override": [
                {
                 "alpn_override": [
                  "istio-http/1.0",
                  "istio",
                  "http/1.0"
                 ]
                },
                {
                 "upstream_protocol": "HTTP11",
                 "alpn_override": [
                  "istio-http/1.1",
                  "istio",
                  "http/1.1"
                 ]
                },
                {
                 "upstream_protocol": "HTTP2",
                 "alpn_override": [
                  "istio-h2",
                  "istio",
                  "h2"
                 ]
                }
               ]
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_outbound",
                 "vm_config": {
                  "vm_id": "stats_outbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "listener_filters": [
        {
         "name": "envoy.filters.listener.tls_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector"
         }
        },
        {
         "name": "envoy.filters.listener.http_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.http_inspector.v3.HttpInspector"
         }
        }
       ],
       "listener_filters_timeout": "0s",
       "traffic_direction": "OUTBOUND",
       "continue_on_listener_filters_timeout": true,
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ],
       "default_filter_chain": {
        "filters": [
         {
          "name": "istio.stats",
          "typed_config": {
           "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
           "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
           "value": {
            "config": {
             "root_id": "stats_outbound",
             "vm_config": {
              "vm_id": "tcp_stats_outbound",
              "runtime": "envoy.wasm.runtime.null",
              "code": {
               "local": {
                "inline_string": "envoy.wasm.stats"
               }
              }
             },
             "configuration": {
              "@type": "type.googleapis.com/google.protobuf.StringValue",
              "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
             }
            }
           }
          }
         },
         {
          "name": "envoy.filters.network.tcp_proxy",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
           "stat_prefix": "outbound|8686||slime-metrics.mesh-operator.svc.cluster.local",
           "cluster": "outbound|8686||slime-metrics.mesh-operator.svc.cluster.local",
           "access_log": [
            {
             "name": "envoy.access_loggers.file",
             "typed_config": {
              "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
              "path": "/dev/stdout",
              "log_format": {
               "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
              }
             }
            }
           ]
          }
         }
        ]
       }
      },
      "last_updated": "2021-03-25T08:12:04.961Z"
     }
    },
    {
     "name": "0.0.0.0_9080",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "0.0.0.0_9080",
       "address": {
        "socket_address": {
         "address": "0.0.0.0",
         "port_value": 9080
        }
       },
       "filter_chains": [
        {
         "filter_chain_match": {
          "transport_protocol": "raw_buffer",
          "application_protocols": [
           "http/1.0",
           "http/1.1",
           "h2c"
          ]
         },
         "filters": [
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "outbound_0.0.0.0_9080",
            "rds": {
             "config_source": {
              "ads": {},
              "resource_api_version": "V3"
             },
             "route_config_name": "9080"
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "istio.alpn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.alpn.v2alpha1.FilterConfig",
               "alpn_override": [
                {
                 "alpn_override": [
                  "istio-http/1.0",
                  "istio",
                  "http/1.0"
                 ]
                },
                {
                 "upstream_protocol": "HTTP11",
                 "alpn_override": [
                  "istio-http/1.1",
                  "istio",
                  "http/1.1"
                 ]
                },
                {
                 "upstream_protocol": "HTTP2",
                 "alpn_override": [
                  "istio-h2",
                  "istio",
                  "h2"
                 ]
                }
               ]
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_outbound",
                 "vm_config": {
                  "vm_id": "stats_outbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "listener_filters": [
        {
         "name": "envoy.filters.listener.tls_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector"
         }
        },
        {
         "name": "envoy.filters.listener.http_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.http_inspector.v3.HttpInspector"
         }
        }
       ],
       "listener_filters_timeout": "0s",
       "traffic_direction": "OUTBOUND",
       "continue_on_listener_filters_timeout": true,
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
""", """
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ],
       "default_filter_chain": {
        "filter_chain_match": {},
        "filters": [
         {
          "name": "istio.stats",
          "typed_config": {
           "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
           "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
           "value": {
            "config": {
             "root_id": "stats_outbound",
             "vm_config": {
              "vm_id": "tcp_stats_outbound",
              "runtime": "envoy.wasm.runtime.null",
              "code": {
               "local": {
                "inline_string": "envoy.wasm.stats"
               }
              }
             },
             "configuration": {
              "@type": "type.googleapis.com/google.protobuf.StringValue",
              "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
             }
            }
           }
          }
         },
         {
          "name": "envoy.filters.network.tcp_proxy",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
           "stat_prefix": "PassthroughCluster",
           "cluster": "PassthroughCluster",
           "access_log": [
            {
             "name": "envoy.access_loggers.file",
             "typed_config": {
              "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
              "path": "/dev/stdout",
              "log_format": {
               "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
              }
             }
            }
           ]
          }
         }
        ],
        "name": "PassthroughFilterChain"
       }
      },
      "last_updated": "2021-03-25T08:12:04.963Z"
     }
    },
    {
     "name": "0.0.0.0_15010",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "0.0.0.0_15010",
       "address": {
        "socket_address": {
         "address": "0.0.0.0",
         "port_value": 15010
        }
       },
       "filter_chains": [
        {
         "filter_chain_match": {
          "transport_protocol": "raw_buffer",
          "application_protocols": [
           "http/1.0",
           "http/1.1",
           "h2c"
          ]
         },
         "filters": [
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "outbound_0.0.0.0_15010",
            "rds": {
             "config_source": {
              "ads": {},
              "resource_api_version": "V3"
             },
             "route_config_name": "15010"
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.grpc_stats",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.grpc_stats.v3.FilterConfig",
               "emit_filter_state": true,
               "stats_for_all_methods": false
              }
             },
             {
              "name": "istio.alpn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.alpn.v2alpha1.FilterConfig",
               "alpn_override": [
                {
                 "alpn_override": [
                  "istio-http/1.0",
                  "istio",
                  "http/1.0"
                 ]
                },
                {
                 "upstream_protocol": "HTTP11",
                 "alpn_override": [
                  "istio-http/1.1",
                  "istio",
                  "http/1.1"
                 ]
                },
                {
                 "upstream_protocol": "HTTP2",
                 "alpn_override": [
                  "istio-h2",
                  "istio",
                  "h2"
                 ]
                }
               ]
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_outbound",
                 "vm_config": {
                  "vm_id": "stats_outbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "listener_filters": [
        {
         "name": "envoy.filters.listener.tls_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector"
         }
        },
        {
         "name": "envoy.filters.listener.http_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.http_inspector.v3.HttpInspector"
         }
        }
       ],
       "listener_filters_timeout": "0s",
       "traffic_direction": "OUTBOUND",
       "continue_on_listener_filters_timeout": true,
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ],
       "default_filter_chain": {
        "filter_chain_match": {},
        "filters": [
         {
          "name": "istio.stats",
          "typed_config": {
           "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
           "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
           "value": {
            "config": {
             "root_id": "stats_outbound",
             "vm_config": {
              "vm_id": "tcp_stats_outbound",
              "runtime": "envoy.wasm.runtime.null",
              "code": {
               "local": {
                "inline_string": "envoy.wasm.stats"
               }
              }
             },
             "configuration": {
              "@type": "type.googleapis.com/google.protobuf.StringValue",
              "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
             }
            }
           }
          }
         },
         {
          "name": "envoy.filters.network.tcp_proxy",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
           "stat_prefix": "PassthroughCluster",
           "cluster": "PassthroughCluster",
           "access_log": [
            {
             "name": "envoy.access_loggers.file",
             "typed_config": {
              "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
              "path": "/dev/stdout",
              "log_format": {
               "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
              }
             }
            }
           ]
          }
         }
        ],
        "name": "PassthroughFilterChain"
       }
      },
      "last_updated": "2021-03-25T08:12:04.965Z"
     }
    },
    {
     "name": "0.0.0.0_80",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "0.0.0.0_80",
       "address": {
        "socket_address": {
         "address": "0.0.0.0",
         "port_value": 80
        }
       },
       "filter_chains": [
        {
         "filter_chain_match": {
          "transport_protocol": "raw_buffer",
          "application_protocols": [
           "http/1.0",
           "http/1.1",
           "h2c"
          ]
         },
         "filters": [
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "outbound_0.0.0.0_80",
            "rds": {
             "config_source": {
              "ads": {},
              "resource_api_version": "V3"
             },
             "route_config_name": "80"
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "istio.alpn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.alpn.v2alpha1.FilterConfig",
               "alpn_override": [
                {
                 "alpn_override": [
                  "istio-http/1.0",
                  "istio",
                  "http/1.0"
                 ]
                },
                {
                 "upstream_protocol": "HTTP11",
                 "alpn_override": [
                  "istio-http/1.1",
                  "istio",
                  "http/1.1"
                 ]
                },
                {
                 "upstream_protocol": "HTTP2",
                 "alpn_override": [
                  "istio-h2",
                  "istio",
                  "h2"
                 ]
                }
               ]
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_outbound",
                 "vm_config": {
                  "vm_id": "stats_outbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
""", """
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "listener_filters": [
        {
         "name": "envoy.filters.listener.tls_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector"
         }
        },
        {
         "name": "envoy.filters.listener.http_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.http_inspector.v3.HttpInspector"
         }
        }
       ],
       "listener_filters_timeout": "0s",
       "traffic_direction": "OUTBOUND",
       "continue_on_listener_filters_timeout": true,
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ],
       "default_filter_chain": {
        "filter_chain_match": {},
        "filters": [
         {
          "name": "istio.stats",
          "typed_config": {
           "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
           "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
           "value": {
            "config": {
             "root_id": "stats_outbound",
             "vm_config": {
              "vm_id": "tcp_stats_outbound",
              "runtime": "envoy.wasm.runtime.null",
              "code": {
               "local": {
                "inline_string": "envoy.wasm.stats"
               }
              }
             },
             "configuration": {
              "@type": "type.googleapis.com/google.protobuf.StringValue",
              "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
             }
            }
           }
          }
         },
         {
          "name": "envoy.filters.network.tcp_proxy",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
           "stat_prefix": "PassthroughCluster",
           "cluster": "PassthroughCluster",
           "access_log": [
            {
             "name": "envoy.access_loggers.file",
             "typed_config": {
              "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
              "path": "/dev/stdout",
              "log_format": {
               "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
              }
             }
            }
           ]
          }
         }
        ],
        "name": "PassthroughFilterChain"
       }
      },
      "last_updated": "2021-03-25T08:12:04.967Z"
     }
    },
    {
     "name": "10.104.193.173_15021",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "10.104.193.173_15021",
       "address": {
        "socket_address": {
         "address": "10.104.193.173",
         "port_value": 15021
        }
       },
       "filter_chains": [
        {
         "filter_chain_match": {
          "transport_protocol": "raw_buffer",
          "application_protocols": [
           "http/1.0",
           "http/1.1",
           "h2c"
          ]
         },
         "filters": [
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "outbound_10.104.193.173_15021",
            "rds": {
             "config_source": {
              "ads": {},
              "resource_api_version": "V3"
             },
             "route_config_name": "istio-ingressgateway.istio-system.svc.cluster.local:15021"
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "istio.alpn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.alpn.v2alpha1.FilterConfig",
               "alpn_override": [
                {
                 "alpn_override": [
                  "istio-http/1.0",
                  "istio",
                  "http/1.0"
                 ]
                },
                {
                 "upstream_protocol": "HTTP11",
                 "alpn_override": [
                  "istio-http/1.1",
                  "istio",
                  "http/1.1"
                 ]
                },
                {
                 "upstream_protocol": "HTTP2",
                 "alpn_override": [
                  "istio-h2",
                  "istio",
                  "h2"
                 ]
                }
               ]
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_outbound",
                 "vm_config": {
                  "vm_id": "stats_outbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "listener_filters": [
        {
         "name": "envoy.filters.listener.tls_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector"
         }
        },
        {
         "name": "envoy.filters.listener.http_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.http_inspector.v3.HttpInspector"
         }
        }
       ],
       "listener_filters_timeout": "0s",
       "traffic_direction": "OUTBOUND",
       "continue_on_listener_filters_timeout": true,
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ],
       "default_filter_chain": {
        "filters": [
         {
          "name": "istio.stats",
          "typed_config": {
           "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
           "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
           "value": {
            "config": {
             "root_id": "stats_outbound",
             "vm_config": {
              "vm_id": "tcp_stats_outbound",
              "runtime": "envoy.wasm.runtime.null",
              "code": {
               "local": {
                "inline_string": "envoy.wasm.stats"
               }
              }
             },
             "configuration": {
              "@type": "type.googleapis.com/google.protobuf.StringValue",
              "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
             }
            }
           }
          }
         },
         {
          "name": "envoy.filters.network.tcp_proxy",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
           "stat_prefix": "outbound|15021||istio-ingressgateway.istio-system.svc.cluster.local",
           "cluster": "outbound|15021||istio-ingressgateway.istio-system.svc.cluster.local",
           "access_log": [
            {
             "name": "envoy.access_loggers.file",
             "typed_config": {
              "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
              "path": "/dev/stdout",
              "log_format": {
               "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
              }
             }
            }
           ]
          }
         }
        ]
       }
      },
      "last_updated": "2021-03-25T08:12:04.968Z"
     }
    },
    {
     "name": "0.0.0.0_8383",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "0.0.0.0_8383",
       "address": {
        "socket_address": {
         "address": "0.0.0.0",
         "port_value": 8383
        }
       },
       "filter_chains": [
        {
         "filter_chain_match": {
          "transport_protocol": "raw_buffer",
          "application_protocols": [
           "http/1.0",
           "http/1.1",
           "h2c"
          ]
         },
         "filters": [
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "outbound_0.0.0.0_8383",
            "rds": {
             "config_source": {
              "ads": {},
              "resource_api_version": "V3"
             },
             "route_config_name": "8383"
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
""", """
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "istio.alpn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.alpn.v2alpha1.FilterConfig",
               "alpn_override": [
                {
                 "alpn_override": [
                  "istio-http/1.0",
                  "istio",
                  "http/1.0"
                 ]
                },
                {
                 "upstream_protocol": "HTTP11",
                 "alpn_override": [
                  "istio-http/1.1",
                  "istio",
                  "http/1.1"
                 ]
                },
                {
                 "upstream_protocol": "HTTP2",
                 "alpn_override": [
                  "istio-h2",
                  "istio",
                  "h2"
                 ]
                }
               ]
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_outbound",
                 "vm_config": {
                  "vm_id": "stats_outbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "listener_filters": [
        {
         "name": "envoy.filters.listener.tls_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector"
         }
        },
        {
         "name": "envoy.filters.listener.http_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.http_inspector.v3.HttpInspector"
         }
        }
       ],
       "listener_filters_timeout": "0s",
       "traffic_direction": "OUTBOUND",
       "continue_on_listener_filters_timeout": true,
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ],
       "default_filter_chain": {
        "filter_chain_match": {},
        "filters": [
         {
          "name": "istio.stats",
          "typed_config": {
           "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
           "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
           "value": {
            "config": {
             "root_id": "stats_outbound",
             "vm_config": {
              "vm_id": "tcp_stats_outbound",
              "runtime": "envoy.wasm.runtime.null",
              "code": {
               "local": {
                "inline_string": "envoy.wasm.stats"
               }
              }
             },
             "configuration": {
              "@type": "type.googleapis.com/google.protobuf.StringValue",
              "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
             }
            }
           }
          }
         },
         {
          "name": "envoy.filters.network.tcp_proxy",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
           "stat_prefix": "PassthroughCluster",
           "cluster": "PassthroughCluster",
           "access_log": [
            {
             "name": "envoy.access_loggers.file",
             "typed_config": {
              "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
              "path": "/dev/stdout",
              "log_format": {
               "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
              }
             }
            }
           ]
          }
         }
        ],
        "name": "PassthroughFilterChain"
       }
      },
      "last_updated": "2021-03-25T08:12:04.970Z"
     }
    },
    {
     "name": "0.0.0.0_15014",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "0.0.0.0_15014",
       "address": {
        "socket_address": {
         "address": "0.0.0.0",
         "port_value": 15014
        }
       },
       "filter_chains": [
        {
         "filter_chain_match": {
          "transport_protocol": "raw_buffer",
          "application_protocols": [
           "http/1.0",
           "http/1.1",
           "h2c"
          ]
         },
         "filters": [
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "outbound_0.0.0.0_15014",
            "rds": {
             "config_source": {
              "ads": {},
              "resource_api_version": "V3"
             },
             "route_config_name": "15014"
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "istio.alpn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.alpn.v2alpha1.FilterConfig",
               "alpn_override": [
                {
                 "alpn_override": [
                  "istio-http/1.0",
                  "istio",
                  "http/1.0"
                 ]
                },
                {
                 "upstream_protocol": "HTTP11",
                 "alpn_override": [
                  "istio-http/1.1",
                  "istio",
                  "http/1.1"
                 ]
                },
                {
                 "upstream_protocol": "HTTP2",
                 "alpn_override": [
                  "istio-h2",
                  "istio",
                  "h2"
                 ]
                }
               ]
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_outbound",
                 "vm_config": {
                  "vm_id": "stats_outbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "listener_filters": [
        {
         "name": "envoy.filters.listener.tls_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector"
         }
        },
        {
         "name": "envoy.filters.listener.http_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.http_inspector.v3.HttpInspector"
         }
        }
       ],
       "listener_filters_timeout": "0s",
       "traffic_direction": "OUTBOUND",
       "continue_on_listener_filters_timeout": true,
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ],
       "default_filter_chain": {
        "filter_chain_match": {},
        "filters": [
         {
          "name": "istio.stats",
          "typed_config": {
           "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
           "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
           "value": {
            "config": {
             "root_id": "stats_outbound",
             "vm_config": {
              "vm_id": "tcp_stats_outbound",
""", """
              "runtime": "envoy.wasm.runtime.null",
              "code": {
               "local": {
                "inline_string": "envoy.wasm.stats"
               }
              }
             },
             "configuration": {
              "@type": "type.googleapis.com/google.protobuf.StringValue",
              "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
             }
            }
           }
          }
         },
         {
          "name": "envoy.filters.network.tcp_proxy",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
           "stat_prefix": "PassthroughCluster",
           "cluster": "PassthroughCluster",
           "access_log": [
            {
             "name": "envoy.access_loggers.file",
             "typed_config": {
              "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
              "path": "/dev/stdout",
              "log_format": {
               "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
              }
             }
            }
           ]
          }
         }
        ],
        "name": "PassthroughFilterChain"
       }
      },
      "last_updated": "2021-03-25T08:12:04.972Z"
     }
    },
    {
     "name": "10.97.53.237_8686",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "10.97.53.237_8686",
       "address": {
        "socket_address": {
         "address": "10.97.53.237",
         "port_value": 8686
        }
       },
       "filter_chains": [
        {
         "filter_chain_match": {
          "transport_protocol": "raw_buffer",
          "application_protocols": [
           "http/1.0",
           "http/1.1",
           "h2c"
          ]
         },
         "filters": [
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "outbound_10.97.53.237_8686",
            "rds": {
             "config_source": {
              "ads": {},
              "resource_api_version": "V3"
             },
             "route_config_name": "slime-boot-metrics.mesh-operator.svc.cluster.local:8686"
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "istio.alpn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.alpn.v2alpha1.FilterConfig",
               "alpn_override": [
                {
                 "alpn_override": [
                  "istio-http/1.0",
                  "istio",
                  "http/1.0"
                 ]
                },
                {
                 "upstream_protocol": "HTTP11",
                 "alpn_override": [
                  "istio-http/1.1",
                  "istio",
                  "http/1.1"
                 ]
                },
                {
                 "upstream_protocol": "HTTP2",
                 "alpn_override": [
                  "istio-h2",
                  "istio",
                  "h2"
                 ]
                }
               ]
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_outbound",
                 "vm_config": {
                  "vm_id": "stats_outbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "listener_filters": [
        {
         "name": "envoy.filters.listener.tls_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector"
         }
        },
        {
         "name": "envoy.filters.listener.http_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.http_inspector.v3.HttpInspector"
         }
        }
       ],
       "listener_filters_timeout": "0s",
       "traffic_direction": "OUTBOUND",
       "continue_on_listener_filters_timeout": true,
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ],
       "default_filter_chain": {
        "filters": [
         {
          "name": "istio.stats",
          "typed_config": {
           "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
           "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
           "value": {
            "config": {
             "root_id": "stats_outbound",
             "vm_config": {
              "vm_id": "tcp_stats_outbound",
              "runtime": "envoy.wasm.runtime.null",
              "code": {
               "local": {
                "inline_string": "envoy.wasm.stats"
               }
              }
             },
             "configuration": {
              "@type": "type.googleapis.com/google.protobuf.StringValue",
              "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
             }
            }
           }
          }
         },
         {
          "name": "envoy.filters.network.tcp_proxy",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
           "stat_prefix": "outbound|8686||slime-boot-metrics.mesh-operator.svc.cluster.local",
           "cluster": "outbound|8686||slime-boot-metrics.mesh-operator.svc.cluster.local",
           "access_log": [
            {
             "name": "envoy.access_loggers.file",
             "typed_config": {
              "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
              "path": "/dev/stdout",
              "log_format": {
               "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
              }
             }
            }
           ]
          }
         }
        ]
       }
      },
      "last_updated": "2021-03-25T08:12:04.974Z"
     }
    },
    {
     "name": "0.0.0.0_8080",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "0.0.0.0_8080",
       "address": {
        "socket_address": {
         "address": "0.0.0.0",
         "port_value": 8080
        }
       },
       "filter_chains": [
        {
         "filter_chain_match": {
          "transport_protocol": "raw_buffer",
          "application_protocols": [
           "http/1.0",
           "http/1.1",
           "h2c"
          ]
         },
         "filters": [
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "outbound_0.0.0.0_8080",
            "rds": {
             "config_source": {
              "ads": {},
              "resource_api_version": "V3"
             },
             "route_config_name": "8080"
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "istio.alpn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.alpn.v2alpha1.FilterConfig",
               "alpn_override": [
                {
                 "alpn_override": [
                  "istio-http/1.0",
                  "istio",
                  "http/1.0"
                 ]
                },
                {
                 "upstream_protocol": "HTTP11",
                 "alpn_override": [
                  "istio-http/1.1",
                  "istio",
                  "http/1.1"
                 ]
                },
                {
                 "upstream_protocol": "HTTP2",
                 "alpn_override": [
                  "istio-h2",
                  "istio",
                  "h2"
                 ]
                }
               ]
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_outbound",
                 "vm_config": {
                  "vm_id": "stats_outbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
""", """
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ]
        }
       ],
       "deprecated_v1": {
        "bind_to_port": false
       },
       "listener_filters": [
        {
         "name": "envoy.filters.listener.tls_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector"
         }
        },
        {
         "name": "envoy.filters.listener.http_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.http_inspector.v3.HttpInspector"
         }
        }
       ],
       "listener_filters_timeout": "0s",
       "traffic_direction": "OUTBOUND",
       "continue_on_listener_filters_timeout": true,
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ],
       "default_filter_chain": {
        "filter_chain_match": {},
        "filters": [
         {
          "name": "istio.stats",
          "typed_config": {
           "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
           "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
           "value": {
            "config": {
             "root_id": "stats_outbound",
             "vm_config": {
              "vm_id": "tcp_stats_outbound",
              "runtime": "envoy.wasm.runtime.null",
              "code": {
               "local": {
                "inline_string": "envoy.wasm.stats"
               }
              }
             },
             "configuration": {
              "@type": "type.googleapis.com/google.protobuf.StringValue",
              "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
             }
            }
           }
          }
         },
         {
          "name": "envoy.filters.network.tcp_proxy",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
           "stat_prefix": "PassthroughCluster",
           "cluster": "PassthroughCluster",
           "access_log": [
            {
             "name": "envoy.access_loggers.file",
             "typed_config": {
              "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
              "path": "/dev/stdout",
              "log_format": {
               "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
              }
             }
            }
           ]
          }
         }
        ],
        "name": "PassthroughFilterChain"
       }
      },
      "last_updated": "2021-03-25T08:12:04.975Z"
     }
    },
    {
     "name": "virtualOutbound",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "virtualOutbound",
       "address": {
        "socket_address": {
         "address": "0.0.0.0",
         "port_value": 15001
        }
       },
       "filter_chains": [
        {
         "filter_chain_match": {
          "destination_port": 15001
         },
         "filters": [
          {
           "name": "istio.stats",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
             "config": {
              "root_id": "stats_outbound",
              "vm_config": {
               "vm_id": "tcp_stats_outbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "BlackHoleCluster",
            "cluster": "BlackHoleCluster"
           }
          }
         ],
         "name": "virtualOutbound-blackhole"
        },
        {
         "filters": [
          {
           "name": "istio.stats",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
             "config": {
              "root_id": "stats_outbound",
              "vm_config": {
               "vm_id": "tcp_stats_outbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"source_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"destination_cluster\": \"upstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "PassthroughCluster",
            "cluster": "PassthroughCluster",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ]
           }
          }
         ],
         "name": "virtualOutbound-catchall-tcp"
        }
       ],
       "use_original_dst": true,
       "traffic_direction": "OUTBOUND",
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ]
      },
      "last_updated": "2021-03-25T08:12:04.976Z"
     }
    },
    {
     "name": "virtualInbound",
     "active_state": {
      "version_info": "2021-03-25T08:05:35Z/13",
      "listener": {
       "@type": "type.googleapis.com/envoy.config.listener.v3.Listener",
       "name": "virtualInbound",
       "address": {
        "socket_address": {
         "address": "0.0.0.0",
         "port_value": 15006
        }
       },
       "filter_chains": [
        {
         "filter_chain_match": {
          "destination_port": 15006
         },
         "filters": [
          {
           "name": "istio.metadata_exchange",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
            "value": {
             "protocol": "istio-peer-exchange"
            }
           }
          },
          {
           "name": "istio.stats",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
             "config": {
              "root_id": "stats_inbound",
              "vm_config": {
               "vm_id": "tcp_stats_inbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"destination_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"source_cluster\": \"downstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "BlackHoleCluster",
            "cluster": "BlackHoleCluster"
           }
          }
         ],
         "name": "virtualInbound-blackhole"
        },
        {
         "filter_chain_match": {
          "prefix_ranges": [
           {
            "address_prefix": "0.0.0.0",
            "prefix_len": 0
           }
          ],
          "transport_protocol": "tls",
          "application_protocols": [
           "istio-peer-exchange",
           "istio"
          ]
         },
         "filters": [
          {
           "name": "istio.metadata_exchange",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
            "value": {
             "protocol": "istio-peer-exchange"
            }
           }
          },
          {
           "name": "istio.stats",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
             "config": {
              "root_id": "stats_inbound",
              "vm_config": {
               "vm_id": "tcp_stats_inbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"destination_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"source_cluster\": \"downstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "InboundPassthroughClusterIpv4",
            "cluster": "InboundPassthroughClusterIpv4",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ]
           }
          }
         ],
         "transport_socket": {
          "name": "envoy.transport_sockets.tls",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext",
           "common_tls_context": {
            "tls_params": {
             "tls_minimum_protocol_version": "TLSv1_2",
             "cipher_suites": [
              "ECDHE-ECDSA-AES256-GCM-SHA384",
              "ECDHE-RSA-AES256-GCM-SHA384",
              "ECDHE-ECDSA-AES128-GCM-SHA256",
              "ECDHE-RSA-AES128-GCM-SHA256",
              "AES256-GCM-SHA384",
              "AES128-GCM-SHA256"
             ]
            },
            "alpn_protocols": [
             "istio-peer-exchange",
             "h2",
             "http/1.1"
            ],
            "tls_certificate_sds_secret_configs": [
             {
              "name": "default",
              "sds_config": {
               "api_config_source": {
                "api_type": "GRPC",
                "grpc_services": [
                 {
                  "envoy_grpc": {
                   "cluster_name": "sds-grpc"
                  }
                 }
                ],
                "set_node_on_first_message_only": true,
                "transport_api_version": "V3"
               },
               "initial_fetch_timeout": "0s",
               "resource_api_version": "V3"
              }
             }
            ],
            "combined_validation_context": {
             "default_validation_context": {
              "match_subject_alt_names": [
               {
                "prefix": "spiffe://cluster.local/"
               }
              ]
             },
             "validation_context_sds_secret_config": {
              "name": "ROOTCA",
              "sds_config": {
               "api_config_source": {
                "api_type": "GRPC",
                "grpc_services": [
                 {
                  "envoy_grpc": {
                   "cluster_name": "sds-grpc"
                  }
                 }
                ],
                "set_node_on_first_message_only": true,
                "transport_api_version": "V3"
               },
               "initial_fetch_timeout": "0s",
               "resource_api_version": "V3"
              }
             }
            }
           },
           "require_client_certificate": true
          }
         },
         "name": "virtualInbound"
        },
        {
         "filter_chain_match": {
          "prefix_ranges": [
           {
            "address_prefix": "0.0.0.0",
            "prefix_len": 0
           }
          ],
          "transport_protocol": "raw_buffer"
         },
         "filters": [
          {
           "name": "istio.metadata_exchange",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
            "value": {
             "protocol": "istio-peer-exchange"
            }
           }
          },
          {
           "name": "istio.stats",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.extensions.filters.network.wasm.v3.Wasm",
            "value": {
""", """
             "config": {
              "root_id": "stats_inbound",
              "vm_config": {
               "vm_id": "tcp_stats_inbound",
               "runtime": "envoy.wasm.runtime.null",
               "code": {
                "local": {
                 "inline_string": "envoy.wasm.stats"
                }
               }
              },
              "configuration": {
               "@type": "type.googleapis.com/google.protobuf.StringValue",
               "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"destination_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"source_cluster\": \"downstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
              }
             }
            }
           }
          },
          {
           "name": "envoy.filters.network.tcp_proxy",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy",
            "stat_prefix": "InboundPassthroughClusterIpv4",
            "cluster": "InboundPassthroughClusterIpv4",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ]
           }
          }
         ],
         "name": "virtualInbound"
        },
        {
         "filter_chain_match": {
          "prefix_ranges": [
           {
            "address_prefix": "0.0.0.0",
            "prefix_len": 0
           }
          ],
          "transport_protocol": "tls",
          "application_protocols": [
           "http/1.0",
           "http/1.1",
           "h2c",
           "istio-http/1.0",
           "istio-http/1.1",
           "istio-h2"
          ]
         },
         "filters": [
          {
           "name": "istio.metadata_exchange",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
            "value": {
             "protocol": "istio-peer-exchange"
            }
           }
          },
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "InboundPassthroughClusterIpv4",
            "route_config": {
             "name": "InboundPassthroughClusterIpv4",
             "virtual_hosts": [
              {
               "name": "inbound|http|0",
               "domains": [
                "*"
               ],
               "routes": [
                {
                 "match": {
                  "prefix": "/"
                 },
                 "route": {
                  "cluster": "InboundPassthroughClusterIpv4",
                  "timeout": "0s",
                  "max_stream_duration": {
                   "max_stream_duration": "0s"
                  }
                 },
                 "decorator": {
                  "operation": ":0/*"
                 },
                 "name": "default"
                }
               ]
              }
             ],
             "validate_clusters": false
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "istio_authn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.authn.v2alpha1.FilterConfig",
               "policy": {
                "peers": [
                 {
                  "mtls": {
                   "mode": "PERMISSIVE"
                  }
                 }
                ]
               },
               "skip_validate_trust_domain": true
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_inbound",
                 "vm_config": {
                  "vm_id": "stats_inbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"destination_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"source_cluster\": \"downstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "server_name": "istio-envoy",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "forward_client_cert_details": "APPEND_FORWARD",
            "set_current_client_cert_details": {
             "subject": true,
             "dns": true,
             "uri": true
            },
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ],
         "transport_socket": {
          "name": "envoy.transport_sockets.tls",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext",
           "common_tls_context": {
            "tls_params": {
             "tls_minimum_protocol_version": "TLSv1_2",
             "cipher_suites": [
              "ECDHE-ECDSA-AES256-GCM-SHA384",
              "ECDHE-RSA-AES256-GCM-SHA384",
              "ECDHE-ECDSA-AES128-GCM-SHA256",
              "ECDHE-RSA-AES128-GCM-SHA256",
              "AES256-GCM-SHA384",
              "AES128-GCM-SHA256"
             ]
            },
            "alpn_protocols": [
             "h2",
             "http/1.1"
            ],
            "tls_certificate_sds_secret_configs": [
             {
              "name": "default",
              "sds_config": {
               "api_config_source": {
                "api_type": "GRPC",
                "grpc_services": [
                 {
                  "envoy_grpc": {
                   "cluster_name": "sds-grpc"
                  }
                 }
                ],
                "set_node_on_first_message_only": true,
                "transport_api_version": "V3"
               },
               "initial_fetch_timeout": "0s",
               "resource_api_version": "V3"
              }
             }
            ],
            "combined_validation_context": {
             "default_validation_context": {
              "match_subject_alt_names": [
               {
                "prefix": "spiffe://cluster.local/"
               }
              ]
             },
             "validation_context_sds_secret_config": {
              "name": "ROOTCA",
              "sds_config": {
               "api_config_source": {
                "api_type": "GRPC",
                "grpc_services": [
                 {
                  "envoy_grpc": {
                   "cluster_name": "sds-grpc"
                  }
                 }
                ],
                "set_node_on_first_message_only": true,
                "transport_api_version": "V3"
               },
               "initial_fetch_timeout": "0s",
               "resource_api_version": "V3"
              }
             }
            }
           },
           "require_client_certificate": true
          }
         },
         "name": "virtualInbound-catchall-http"
        },
        {
         "filter_chain_match": {
          "prefix_ranges": [
           {
            "address_prefix": "0.0.0.0",
            "prefix_len": 0
           }
          ],
          "transport_protocol": "raw_buffer",
          "application_protocols": [
           "http/1.0",
           "http/1.1",
           "h2c"
          ]
         },
         "filters": [
          {
           "name": "istio.metadata_exchange",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
            "value": {
             "protocol": "istio-peer-exchange"
            }
           }
          },
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "InboundPassthroughClusterIpv4",
            "route_config": {
             "name": "InboundPassthroughClusterIpv4",
             "virtual_hosts": [
              {
               "name": "inbound|http|0",
               "domains": [
                "*"
               ],
               "routes": [
                {
                 "match": {
                  "prefix": "/"
                 },
                 "route": {
                  "cluster": "InboundPassthroughClusterIpv4",
                  "timeout": "0s",
                  "max_stream_duration": {
                   "max_stream_duration": "0s"
                  }
                 },
                 "decorator": {
                  "operation": ":0/*"
                 },
                 "name": "default"
                }
               ]
              }
             ],
             "validate_clusters": false
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "istio_authn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.authn.v2alpha1.FilterConfig",
               "policy": {
                "peers": [
                 {
                  "mtls": {
                   "mode": "PERMISSIVE"
                  }
                 }
                ]
               },
               "skip_validate_trust_domain": true
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_inbound",
                 "vm_config": {
                  "vm_id": "stats_inbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"destination_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"source_cluster\": \"downstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
""", """
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "server_name": "istio-envoy",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "forward_client_cert_details": "APPEND_FORWARD",
            "set_current_client_cert_details": {
             "subject": true,
             "dns": true,
             "uri": true
            },
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ],
         "name": "virtualInbound-catchall-http"
        },
        {
         "filter_chain_match": {
          "destination_port": 9080,
          "transport_protocol": "tls",
          "application_protocols": [
           "istio",
           "istio-http/1.0",
           "istio-http/1.1",
           "istio-h2"
          ]
         },
         "filters": [
          {
           "name": "istio.metadata_exchange",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
            "value": {
             "protocol": "istio-peer-exchange"
            }
           }
          },
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "inbound_0.0.0.0_9080",
            "route_config": {
             "name": "inbound|9080||",
             "virtual_hosts": [
              {
               "name": "inbound|http|9080",
               "domains": [
                "*"
               ],
               "routes": [
                {
                 "match": {
                  "prefix": "/"
                 },
                 "route": {
                  "cluster": "inbound|9080||",
                  "timeout": "0s",
                  "max_stream_duration": {
                   "max_stream_duration": "0s"
                  }
                 },
                 "decorator": {
                  "operation": "productpage.default.svc.cluster.local:9080/*"
                 },
                 "name": "default"
                }
               ]
              }
             ],
             "validate_clusters": false
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "istio_authn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.authn.v2alpha1.FilterConfig",
               "policy": {
                "peers": [
                 {
                  "mtls": {
                   "mode": "PERMISSIVE"
                  }
                 }
                ]
               },
               "skip_validate_trust_domain": true
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_inbound",
                 "vm_config": {
                  "vm_id": "stats_inbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"destination_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"source_cluster\": \"downstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "server_name": "istio-envoy",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "forward_client_cert_details": "APPEND_FORWARD",
            "set_current_client_cert_details": {
             "subject": true,
             "dns": true,
             "uri": true
            },
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ],
         "transport_socket": {
          "name": "envoy.transport_sockets.tls",
          "typed_config": {
           "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext",
           "common_tls_context": {
            "tls_params": {
             "tls_minimum_protocol_version": "TLSv1_2",
             "cipher_suites": [
              "ECDHE-ECDSA-AES256-GCM-SHA384",
              "ECDHE-RSA-AES256-GCM-SHA384",
              "ECDHE-ECDSA-AES128-GCM-SHA256",
              "ECDHE-RSA-AES128-GCM-SHA256",
              "AES256-GCM-SHA384",
              "AES128-GCM-SHA256"
             ]
            },
            "alpn_protocols": [
             "h2",
             "http/1.1"
            ],
            "tls_certificate_sds_secret_configs": [
             {
              "name": "default",
              "sds_config": {
               "api_config_source": {
                "api_type": "GRPC",
                "grpc_services": [
                 {
                  "envoy_grpc": {
                   "cluster_name": "sds-grpc"
                  }
                 }
                ],
                "set_node_on_first_message_only": true,
                "transport_api_version": "V3"
               },
               "initial_fetch_timeout": "0s",
               "resource_api_version": "V3"
              }
             }
            ],
            "combined_validation_context": {
             "default_validation_context": {
              "match_subject_alt_names": [
               {
                "prefix": "spiffe://cluster.local/"
               }
              ]
             },
             "validation_context_sds_secret_config": {
              "name": "ROOTCA",
              "sds_config": {
               "api_config_source": {
                "api_type": "GRPC",
                "grpc_services": [
                 {
                  "envoy_grpc": {
                   "cluster_name": "sds-grpc"
                  }
                 }
                ],
                "set_node_on_first_message_only": true,
                "transport_api_version": "V3"
               },
               "initial_fetch_timeout": "0s",
               "resource_api_version": "V3"
              }
             }
            }
           },
           "require_client_certificate": true
          }
         },
         "name": "0.0.0.0_9080"
        },
        {
         "filter_chain_match": {
          "destination_port": 9080,
          "transport_protocol": "raw_buffer"
         },
         "filters": [
          {
           "name": "istio.metadata_exchange",
           "typed_config": {
            "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
            "type_url": "type.googleapis.com/envoy.tcp.metadataexchange.config.MetadataExchange",
            "value": {
             "protocol": "istio-peer-exchange"
            }
           }
          },
          {
           "name": "envoy.filters.network.http_connection_manager",
           "typed_config": {
            "@type": "type.googleapis.com/envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManager",
            "stat_prefix": "inbound_0.0.0.0_9080",
            "route_config": {
             "name": "inbound|9080||",
             "virtual_hosts": [
              {
               "name": "inbound|http|9080",
               "domains": [
                "*"
               ],
               "routes": [
                {
                 "match": {
                  "prefix": "/"
                 },
                 "route": {
                  "cluster": "inbound|9080||",
                  "timeout": "0s",
                  "max_stream_duration": {
                   "max_stream_duration": "0s"
                  }
                 },
                 "decorator": {
                  "operation": "productpage.default.svc.cluster.local:9080/*"
                 },
                 "name": "default"
                }
               ]
              }
             ],
             "validate_clusters": false
            },
            "http_filters": [
             {
              "name": "istio.metadata_exchange",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "vm_config": {
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.metadata_exchange"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{}\n"
                 }
                }
               }
              }
             },
             {
              "name": "istio_authn",
              "typed_config": {
               "@type": "type.googleapis.com/istio.envoy.config.filter.http.authn.v2alpha1.FilterConfig",
               "policy": {
                "peers": [
                 {
                  "mtls": {
                   "mode": "PERMISSIVE"
                  }
                 }
                ]
               },
               "skip_validate_trust_domain": true
              }
             },
             {
              "name": "envoy.filters.http.cors",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.cors.v3.Cors"
              }
             },
             {
              "name": "envoy.filters.http.fault",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.fault.v3.HTTPFault"
              }
             },
             {
              "name": "istio.stats",
              "typed_config": {
               "@type": "type.googleapis.com/udpa.type.v1.TypedStruct",
               "type_url": "type.googleapis.com/envoy.extensions.filters.http.wasm.v3.Wasm",
               "value": {
                "config": {
                 "root_id": "stats_inbound",
                 "vm_config": {
                  "vm_id": "stats_inbound",
                  "runtime": "envoy.wasm.runtime.null",
                  "code": {
                   "local": {
                    "inline_string": "envoy.wasm.stats"
                   }
                  }
                 },
                 "configuration": {
                  "@type": "type.googleapis.com/google.protobuf.StringValue",
                  "value": "{\n  \"debug\": \"false\",\n  \"stat_prefix\": \"istio\",\n  \"metrics\": [\n    {\n      \"dimensions\": {\n        \"destination_cluster\": \"node.metadata['CLUSTER_ID']\",\n        \"source_cluster\": \"downstream_peer.cluster_id\"\n      }\n    }\n  ]\n}\n"
                 }
                }
               }
              }
             },
             {
              "name": "envoy.filters.http.router",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.filters.http.router.v3.Router"
              }
             }
            ],
            "tracing": {
             "client_sampling": {
              "value": 100
             },
             "random_sampling": {
              "value": 100
             },
             "overall_sampling": {
              "value": 100
             },
             "custom_tags": [
              {
               "tag": "istio.canonical_revision",
               "environment": {
                "name": "CANONICAL_REVISION",
                "default_value": "latest"
               }
              },
              {
               "tag": "istio.canonical_service",
               "environment": {
                "name": "CANONICAL_SERVICE",
                "default_value": "unknown"
               }
""", """
              },
              {
               "tag": "istio.mesh_id",
               "environment": {
                "name": "ISTIO_META_MESH_ID",
                "default_value": "unknown"
               }
              },
              {
               "tag": "istio.namespace",
               "environment": {
                "name": "POD_NAMESPACE",
                "default_value": "default"
               }
              }
             ]
            },
            "server_name": "istio-envoy",
            "access_log": [
             {
              "name": "envoy.access_loggers.file",
              "typed_config": {
               "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
               "path": "/dev/stdout",
               "log_format": {
                "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
               }
              }
             }
            ],
            "use_remote_address": false,
            "forward_client_cert_details": "APPEND_FORWARD",
            "set_current_client_cert_details": {
             "subject": true,
             "dns": true,
             "uri": true
            },
            "upgrade_configs": [
             {
              "upgrade_type": "websocket"
             }
            ],
            "stream_idle_timeout": "0s",
            "normalize_path": true
           }
          }
         ],
         "name": "0.0.0.0_9080"
        }
       ],
       "listener_filters": [
        {
         "name": "envoy.filters.listener.original_dst",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.original_dst.v3.OriginalDst"
         }
        },
        {
         "name": "envoy.filters.listener.tls_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.tls_inspector.v3.TlsInspector"
         }
        },
        {
         "name": "envoy.filters.listener.http_inspector",
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.filters.listener.http_inspector.v3.HttpInspector"
         },
         "filter_disabled": {
          "destination_port_range": {
           "start": 9080,
           "end": 9081
          }
         }
        }
       ],
       "listener_filters_timeout": "0s",
       "traffic_direction": "INBOUND",
       "continue_on_listener_filters_timeout": true,
       "access_log": [
        {
         "name": "envoy.access_loggers.file",
         "filter": {
          "response_flag_filter": {
           "flags": [
            "NR"
           ]
          }
         },
         "typed_config": {
          "@type": "type.googleapis.com/envoy.extensions.access_loggers.file.v3.FileAccessLog",
          "path": "/dev/stdout",
          "log_format": {
           "text_format": "[%START_TIME%] \"%REQ(:METHOD)% %REQ(X-ENVOY-ORIGINAL-PATH?:PATH)% %PROTOCOL%\" %RESPONSE_CODE% %RESPONSE_FLAGS% %RESPONSE_CODE_DETAILS% %CONNECTION_TERMINATION_DETAILS% \"%UPSTREAM_TRANSPORT_FAILURE_REASON%\" %BYTES_RECEIVED% %BYTES_SENT% %DURATION% %RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)% \"%REQ(X-FORWARDED-FOR)%\" \"%REQ(USER-AGENT)%\" \"%REQ(X-REQUEST-ID)%\" \"%REQ(:AUTHORITY)%\" \"%UPSTREAM_HOST%\" %UPSTREAM_CLUSTER% %UPSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_LOCAL_ADDRESS% %DOWNSTREAM_REMOTE_ADDRESS% %REQUESTED_SERVER_NAME% %ROUTE_NAME%\n"
          }
         }
        }
       ]
      },
      "last_updated": "2021-03-25T08:12:04.993Z"
     }
    }
   ]
  },
  {
   "@type": "type.googleapis.com/envoy.admin.v3.ScopedRoutesConfigDump"
  },
  {
   "@type": "type.googleapis.com/envoy.admin.v3.RoutesConfigDump",
   "static_route_configs": [
    {
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "virtual_hosts": [
       {
        "name": "backend",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/healthz/ready"
          },
          "route": {
           "cluster": "agent"
          }
         }
        ]
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.895Z"
    },
    {
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "InboundPassthroughClusterIpv4",
      "virtual_hosts": [
       {
        "name": "inbound|http|0",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "InboundPassthroughClusterIpv4",
           "timeout": "0s",
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": ":0/*"
          },
          "name": "default"
         }
        ]
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.988Z"
    },
    {
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "InboundPassthroughClusterIpv4",
      "virtual_hosts": [
       {
        "name": "inbound|http|0",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "InboundPassthroughClusterIpv4",
           "timeout": "0s",
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": ":0/*"
          },
          "name": "default"
         }
        ]
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.985Z"
    },
    {
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "virtual_hosts": [
       {
        "name": "backend",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/stats/prometheus"
          },
          "route": {
           "cluster": "prometheus_stats"
          }
         }
        ]
       }
      ]
     },
     "last_updated": "2021-03-25T08:12:04.892Z"
    },
    {
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "inbound|9080||",
      "virtual_hosts": [
       {
        "name": "inbound|http|9080",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "inbound|9080||",
           "timeout": "0s",
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "productpage.default.svc.cluster.local:9080/*"
          },
          "name": "default"
         }
        ]
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.992Z"
    },
    {
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "inbound|9080||",
      "virtual_hosts": [
       {
        "name": "inbound|http|9080",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "inbound|9080||",
           "timeout": "0s",
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "productpage.default.svc.cluster.local:9080/*"
          },
          "name": "default"
         }
        ]
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.991Z"
    }
   ],
   "dynamic_route_configs": [
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "slime-metrics.mesh-operator.svc.cluster.local:8686",
      "virtual_hosts": [
       {
        "name": "slime-metrics.mesh-operator.svc.cluster.local:8686",
        "domains": [
         "slime-metrics.mesh-operator.svc.cluster.local",
         "slime-metrics.mesh-operator.svc.cluster.local:8686",
         "slime-metrics.mesh-operator",
         "slime-metrics.mesh-operator:8686",
         "slime-metrics.mesh-operator.svc.cluster",
         "slime-metrics.mesh-operator.svc.cluster:8686",
         "slime-metrics.mesh-operator.svc",
         "slime-metrics.mesh-operator.svc:8686",
         "10.96.138.223",
         "10.96.138.223:8686"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|8686||slime-metrics.mesh-operator.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "slime-metrics.mesh-operator.svc.cluster.local:8686/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.996Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "9090",
      "virtual_hosts": [
       {
        "name": "allow_any",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "PassthroughCluster",
           "timeout": "0s",
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "name": "allow_any"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "prometheus.istio-system.svc.cluster.local:9090",
        "domains": [
         "prometheus.istio-system.svc.cluster.local",
         "prometheus.istio-system.svc.cluster.local:9090",
         "prometheus.istio-system",
         "prometheus.istio-system:9090",
         "prometheus.istio-system.svc.cluster",
         "prometheus.istio-system.svc.cluster:9090",
         "prometheus.istio-system.svc",
         "prometheus.istio-system.svc:9090",
         "10.96.121.226",
         "10.96.121.226:9090"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|9090||prometheus.istio-system.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "prometheus.istio-system.svc.cluster.local:9090/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.996Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "80",
      "virtual_hosts": [
       {
        "name": "allow_any",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "PassthroughCluster",
           "timeout": "0s",
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "name": "allow_any"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "istio-egressgateway.istio-system.svc.cluster.local:80",
        "domains": [
         "istio-egressgateway.istio-system.svc.cluster.local",
         "istio-egressgateway.istio-system.svc.cluster.local:80",
         "istio-egressgateway.istio-system",
         "istio-egressgateway.istio-system:80",
         "istio-egressgateway.istio-system.svc.cluster",
         "istio-egressgateway.istio-system.svc.cluster:80",
         "istio-egressgateway.istio-system.svc",
         "istio-egressgateway.istio-system.svc:80",
         "10.104.255.22",
         "10.104.255.22:80"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|80||istio-egressgateway.istio-system.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
""", """
          },
          "decorator": {
           "operation": "istio-egressgateway.istio-system.svc.cluster.local:80/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "istio-ingressgateway.istio-system.svc.cluster.local:80",
        "domains": [
         "istio-ingressgateway.istio-system.svc.cluster.local",
         "istio-ingressgateway.istio-system.svc.cluster.local:80",
         "istio-ingressgateway.istio-system",
         "istio-ingressgateway.istio-system:80",
         "istio-ingressgateway.istio-system.svc.cluster",
         "istio-ingressgateway.istio-system.svc.cluster:80",
         "istio-ingressgateway.istio-system.svc",
         "istio-ingressgateway.istio-system.svc:80",
         "10.104.193.173",
         "10.104.193.173:80"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|80||istio-ingressgateway.istio-system.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "istio-ingressgateway.istio-system.svc.cluster.local:80/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "lazyload.mesh-operator.svc.cluster.local:80",
        "domains": [
         "lazyload.mesh-operator.svc.cluster.local",
         "lazyload.mesh-operator.svc.cluster.local:80",
         "lazyload.mesh-operator",
         "lazyload.mesh-operator:80",
         "lazyload.mesh-operator.svc.cluster",
         "lazyload.mesh-operator.svc.cluster:80",
         "lazyload.mesh-operator.svc",
         "lazyload.mesh-operator.svc:80",
         "10.97.30.151",
         "10.97.30.151:80"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|80||lazyload.mesh-operator.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "lazyload.mesh-operator.svc.cluster.local:80/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "limiter.mesh-operator.svc.cluster.local:80",
        "domains": [
         "limiter.mesh-operator.svc.cluster.local",
         "limiter.mesh-operator.svc.cluster.local:80",
         "limiter.mesh-operator",
         "limiter.mesh-operator:80",
         "limiter.mesh-operator.svc.cluster",
         "limiter.mesh-operator.svc.cluster:80",
         "limiter.mesh-operator.svc",
         "limiter.mesh-operator.svc:80",
         "10.110.37.5",
         "10.110.37.5:80"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|80||limiter.mesh-operator.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "limiter.mesh-operator.svc.cluster.local:80/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.996Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "8080",
      "virtual_hosts": [
       {
        "name": "allow_any",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "PassthroughCluster",
           "timeout": "0s",
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "name": "allow_any"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "istio-pilot.mesh-operator.svc.cluster.local:8080",
        "domains": [
         "istio-pilot.mesh-operator.svc.cluster.local",
         "istio-pilot.mesh-operator.svc.cluster.local:8080",
         "istio-pilot.mesh-operator",
         "istio-pilot.mesh-operator:8080",
         "istio-pilot.mesh-operator.svc.cluster",
         "istio-pilot.mesh-operator.svc.cluster:8080",
         "istio-pilot.mesh-operator.svc",
         "istio-pilot.mesh-operator.svc:8080",
         "10.98.141.28",
         "10.98.141.28:8080"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|8080||istio-pilot.mesh-operator.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "istio-pilot.mesh-operator.svc.cluster.local:8080/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.995Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "istio-ingressgateway.istio-system.svc.cluster.local:15021",
      "virtual_hosts": [
       {
        "name": "istio-ingressgateway.istio-system.svc.cluster.local:15021",
        "domains": [
         "istio-ingressgateway.istio-system.svc.cluster.local",
         "istio-ingressgateway.istio-system.svc.cluster.local:15021",
         "istio-ingressgateway.istio-system",
         "istio-ingressgateway.istio-system:15021",
         "istio-ingressgateway.istio-system.svc.cluster",
         "istio-ingressgateway.istio-system.svc.cluster:15021",
         "istio-ingressgateway.istio-system.svc",
         "istio-ingressgateway.istio-system.svc:15021",
         "10.104.193.173",
         "10.104.193.173:15021"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|15021||istio-ingressgateway.istio-system.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "istio-ingressgateway.istio-system.svc.cluster.local:15021/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.996Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "15010",
      "virtual_hosts": [
       {
        "name": "allow_any",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "PassthroughCluster",
           "timeout": "0s",
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "name": "allow_any"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "istio-pilot.mesh-operator.svc.cluster.local:15010",
        "domains": [
         "istio-pilot.mesh-operator.svc.cluster.local",
         "istio-pilot.mesh-operator.svc.cluster.local:15010",
         "istio-pilot.mesh-operator",
         "istio-pilot.mesh-operator:15010",
         "istio-pilot.mesh-operator.svc.cluster",
         "istio-pilot.mesh-operator.svc.cluster:15010",
         "istio-pilot.mesh-operator.svc",
         "istio-pilot.mesh-operator.svc:15010",
         "10.98.141.28",
         "10.98.141.28:15010"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|15010||istio-pilot.mesh-operator.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "istio-pilot.mesh-operator.svc.cluster.local:15010/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "istiod.istio-system.svc.cluster.local:15010",
        "domains": [
         "istiod.istio-system.svc.cluster.local",
         "istiod.istio-system.svc.cluster.local:15010",
         "istiod.istio-system",
         "istiod.istio-system:15010",
         "istiod.istio-system.svc.cluster",
         "istiod.istio-system.svc.cluster:15010",
         "istiod.istio-system.svc",
         "istiod.istio-system.svc:15010",
         "10.105.109.31",
         "10.105.109.31:15010"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|15010||istiod.istio-system.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "istiod.istio-system.svc.cluster.local:15010/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.996Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "8383",
      "virtual_hosts": [
       {
        "name": "allow_any",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "PassthroughCluster",
           "timeout": "0s",
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "name": "allow_any"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "slime-boot-metrics.mesh-operator.svc.cluster.local:8383",
        "domains": [
         "slime-boot-metrics.mesh-operator.svc.cluster.local",
         "slime-boot-metrics.mesh-operator.svc.cluster.local:8383",
         "slime-boot-metrics.mesh-operator",
         "slime-boot-metrics.mesh-operator:8383",
         "slime-boot-metrics.mesh-operator.svc.cluster",
         "slime-boot-metrics.mesh-operator.svc.cluster:8383",
         "slime-boot-metrics.mesh-operator.svc",
         "slime-boot-metrics.mesh-operator.svc:8383",
         "10.97.53.237",
         "10.97.53.237:8383"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|8383||slime-boot-metrics.mesh-operator.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "slime-boot-metrics.mesh-operator.svc.cluster.local:8383/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "slime-metrics.mesh-operator.svc.cluster.local:8383",
        "domains": [
         "slime-metrics.mesh-operator.svc.cluster.local",
         "slime-metrics.mesh-operator.svc.cluster.local:8383",
""", """
         "slime-metrics.mesh-operator",
         "slime-metrics.mesh-operator:8383",
         "slime-metrics.mesh-operator.svc.cluster",
         "slime-metrics.mesh-operator.svc.cluster:8383",
         "slime-metrics.mesh-operator.svc",
         "slime-metrics.mesh-operator.svc:8383",
         "10.96.138.223",
         "10.96.138.223:8383"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|8383||slime-metrics.mesh-operator.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "slime-metrics.mesh-operator.svc.cluster.local:8383/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.996Z"
    },
    {
     "version_info": "2021-03-25T08:16:06Z/16",
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "9080",
      "virtual_hosts": [
       {
        "name": "details.default.svc.cluster.local:9080",
        "domains": [
         "details.default.svc.cluster.local",
         "details.default.svc.cluster.local:9080",
         "details",
         "details:9080",
         "details.default.svc.cluster",
         "details.default.svc.cluster:9080",
         "details.default.svc",
         "details.default.svc:9080",
         "details.default",
         "details.default:9080",
         "10.97.33.96",
         "10.97.33.96:9080"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|9080||details.default.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "details.default.svc.cluster.local:9080/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "global-sidecar.default.svc.cluster.local:9080",
        "domains": [
         "global-sidecar.default.svc.cluster.local",
         "global-sidecar.default.svc.cluster.local:9080",
         "global-sidecar",
         "global-sidecar:9080",
         "global-sidecar.default.svc.cluster",
         "global-sidecar.default.svc.cluster:9080",
         "global-sidecar.default.svc",
         "global-sidecar.default.svc:9080",
         "global-sidecar.default",
         "global-sidecar.default:9080",
         "10.97.208.69",
         "10.97.208.69:9080"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|9080||global-sidecar.default.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "global-sidecar.default.svc.cluster.local:9080/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "reviews.default.svc.cluster.local:9080",
        "domains": [
         "reviews.default.svc.cluster.local",
         "reviews.default.svc.cluster.local:9080",
         "reviews",
         "reviews:9080",
         "reviews.default.svc.cluster",
         "reviews.default.svc.cluster:9080",
         "reviews.default.svc",
         "reviews.default.svc:9080",
         "reviews.default",
         "reviews.default:9080",
         "10.99.230.151",
         "10.99.230.151:9080"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|9080||reviews.default.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "reviews.default.svc.cluster.local:9080/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "to_global_sidecar",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|9080||global-sidecar.default.svc.cluster.local"
          }
         }
        ]
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:16:06.147Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "15014",
      "virtual_hosts": [
       {
        "name": "allow_any",
        "domains": [
         "*"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "PassthroughCluster",
           "timeout": "0s",
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "name": "allow_any"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "istio-pilot.mesh-operator.svc.cluster.local:15014",
        "domains": [
         "istio-pilot.mesh-operator.svc.cluster.local",
         "istio-pilot.mesh-operator.svc.cluster.local:15014",
         "istio-pilot.mesh-operator",
         "istio-pilot.mesh-operator:15014",
         "istio-pilot.mesh-operator.svc.cluster",
         "istio-pilot.mesh-operator.svc.cluster:15014",
         "istio-pilot.mesh-operator.svc",
         "istio-pilot.mesh-operator.svc:15014",
         "10.98.141.28",
         "10.98.141.28:15014"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|15014||istio-pilot.mesh-operator.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "istio-pilot.mesh-operator.svc.cluster.local:15014/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       },
       {
        "name": "istiod.istio-system.svc.cluster.local:15014",
        "domains": [
         "istiod.istio-system.svc.cluster.local",
         "istiod.istio-system.svc.cluster.local:15014",
         "istiod.istio-system",
         "istiod.istio-system:15014",
         "istiod.istio-system.svc.cluster",
         "istiod.istio-system.svc.cluster:15014",
         "istiod.istio-system.svc",
         "istiod.istio-system.svc:15014",
         "10.105.109.31",
         "10.105.109.31:15014"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|15014||istiod.istio-system.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "istiod.istio-system.svc.cluster.local:15014/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.995Z"
    },
    {
     "version_info": "2021-03-25T08:05:35Z/13",
     "route_config": {
      "@type": "type.googleapis.com/envoy.config.route.v3.RouteConfiguration",
      "name": "slime-boot-metrics.mesh-operator.svc.cluster.local:8686",
      "virtual_hosts": [
       {
        "name": "slime-boot-metrics.mesh-operator.svc.cluster.local:8686",
        "domains": [
         "slime-boot-metrics.mesh-operator.svc.cluster.local",
         "slime-boot-metrics.mesh-operator.svc.cluster.local:8686",
         "slime-boot-metrics.mesh-operator",
         "slime-boot-metrics.mesh-operator:8686",
         "slime-boot-metrics.mesh-operator.svc.cluster",
         "slime-boot-metrics.mesh-operator.svc.cluster:8686",
         "slime-boot-metrics.mesh-operator.svc",
         "slime-boot-metrics.mesh-operator.svc:8686",
         "10.97.53.237",
         "10.97.53.237:8686"
        ],
        "routes": [
         {
          "match": {
           "prefix": "/"
          },
          "route": {
           "cluster": "outbound|8686||slime-boot-metrics.mesh-operator.svc.cluster.local",
           "timeout": "0s",
           "retry_policy": {
            "retry_on": "connect-failure,refused-stream,unavailable,cancelled,retriable-status-codes",
            "num_retries": 2,
            "retry_host_predicate": [
             {
              "name": "envoy.retry_host_predicates.previous_hosts"
             }
            ],
            "host_selection_retry_max_attempts": "5",
            "retriable_status_codes": [
             503
            ]
           },
           "max_stream_duration": {
            "max_stream_duration": "0s"
           }
          },
          "decorator": {
           "operation": "slime-boot-metrics.mesh-operator.svc.cluster.local:8686/*"
          },
          "name": "default"
         }
        ],
        "include_request_attempt_count": true
       }
      ],
      "validate_clusters": false
     },
     "last_updated": "2021-03-25T08:12:04.995Z"
    }
   ]
  },
  {
   "@type": "type.googleapis.com/envoy.admin.v3.SecretsConfigDump",
   "dynamic_active_secrets": [
    {
     "name": "default",
     "version_info": "0",
     "last_updated": "2021-03-28T20:12:04.571Z",
     "secret": {
      "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.Secret",
      "name": "default",
      "tls_certificate": {
       "certificate_chain": {
        "inline_bytes": "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSURUakNDQWphZ0F3SUJBZ0lSQU54NDF2blY1QVlWa1pTd2VXYU5mUGd3RFFZSktvWklodmNOQVFFTEJRQXcKR0RFV01CUUdBMVVFQ2hNTlkyeDFjM1JsY2k1c2IyTmhiREFlRncweU1UQXpNamd5TURFeU1EUmFGdzB5TVRBegpNamt5TURFeU1EUmFNQUF3Z2dFaU1BMEdDU3FHU0liM0RRRUJBUVVBQTRJQkR3QXdnZ0VLQW9JQkFRQzNjS3FOCmZINVIyakQ5Wm5RMkVJSDM1am1NcU9lUENmbXZxT1hwQm9KTk83RVBVaUFaSWdaODZ5dXdqd0hXQlZONmtVaGMKQTZCS05NTFpZOGp1My9oR1NWdzlwcDRUTmxUSDZyREl4RkcySkxwWGRGVzZGU0xpcmdZc2Fra015blRjTm85dAprMEVRWVVScktFUnZNbWY1VFduemIwSnVxNGltSEZkdlAwV0ppZXhQTC9ndERJc1NpVFh6dDRIaTJyS0x6MWY1CnRWRlhrNmhDUnNmSUhPbWIvR1VxdDVoaSs4OXpNVmxnUUlWc3ZEOXJUZ21MbjgrVXFkejFFUVM2Si9PS2tMelAKOG1RbjR6TEVUZWx0dnpQNFRaTVQrbU13dVFuSGFsZlFFS05MeVpxdFhmRkl3dFkyTHFOYW9leHY3Vmd0bU1TZworTnIvZXRQR1Jxck96ZTZiQWdNQkFBR2pnYW93Z2Fjd0RnWURWUjBQQVFIL0JBUURBZ1dnTUIwR0ExVWRKUVFXCk1CUUdDQ3NHQVFVRkJ3TUJCZ2dyQmdFRkJRY0RBakFNQmdOVkhSTUJBZjhFQWpBQU1COEdBMVVkSXdRWU1CYUEKRkJpWFpiMFlRdU03bm9Xd2o2VXZqWk1INjRDdE1FY0dBMVVkRVFFQi93UTlNRHVHT1hOd2FXWm1aVG92TDJOcwpkWE4wWlhJdWJHOWpZV3d2Ym5NdlpHVm1ZWFZzZEM5ellTOWliMjlyYVc1bWJ5MXdjbTlrZFdOMGNHRm5aVEFOCkJna3Foa2lHOXcwQkFRc0ZBQU9DQVFFQWtrOFNNRHAvL1BYNUIvVXpZY0N6OWdvM0hWdGRXanJ1TXYwc0xSd2wKMGxRNFlkVzVON2tQSENPWlVvZVQvV2IydWZYREJWbSt2cEREU3oyYks3Y1NoNGtBUFRNMjMxdUtTSE1KSmN4YgpXSFhQVjNheEZBeUwwa2dWdjVhdEs5MG54YlRva1lEdGx6dnUybG9oV0lER21VVlJlemFyTGpJUWpwYW9CTUFKClR6bWRGRGpRYU5nbTVXZGFzVUtSa1QwTEJKc3ZIVXM1eHhoS1ZBUElBL2VFQVdlYTN2RjJQUmxEWklUNUNHenAKU0ZvbnpKbG0yVUl0dWx1VE5sOExmTTBGZXIzbEJkQW14UWRHQkYyeGI2ZEc0NDRycEFhcWNoTWUxaU1CRm1OeQpGRm1DMTVIc1B6QUMxaWVpbWZuZ01SRSthUEhBcnZhL0hzUGlIN2h4STBDV2tnPT0KLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQotLS0tLUJFR0lOIENFUlRJRklDQVRFLS0tLS0KTUlJQy9UQ0NBZVdnQXdJQkFnSVJBT2I1ekRPTlo2Mlpmb3BYVHpOMERSSXdEUVlKS29aSWh2Y05BUUVMQlFBdwpHREVXTUJRR0ExVUVDaE1OWTJ4MWMzUmxjaTVzYjJOaGJEQWVGdzB5TVRBek1qSXdOek0xTXpOYUZ3MHpNVEF6Ck1qQXdOek0xTXpOYU1CZ3hGakFVQmdOVkJBb1REV05zZFhOMFpYSXViRzlqWVd3d2dnRWlNQTBHQ1NxR1NJYjMKRFFFQkFRVUFBNElCRHdBd2dnRUtBb0lCQVFDMzJRb0trRUZPVU9UdlFBN0gwU3hlNC9aaTdNMUNkTnJqdjd6Ugpxb3g2NlUrWUJ0WnBVTFh1a1ZxMWdTWmFkU1pQR2ZGOW5hUURkZFVUQmRxRWhhSFNuUlpBZHlWdVJLQy96MzZHCmVWOVFZZy9PR2dZV1Y2Q1RTSlVnTG1lckhlc0lKbjFJUmtIeDRQVi9FeVJPUkUzS1UrMFFqYnprT2NGbE9yNGMKTmZUYkNVRUdQejVmaXh4RlpVbFNzbVVETWhzK0NRMFNxczBXUVEyb00yaU94T0pwcldMOXFPdGNoN2FsQ0x0aApFNFVPaEtPdVpNRklDL0lzY1QrWHRMejlpMDUvWVNhNUs2ditDMVFnRlA0MHo2algyekN4K2Q3T1ozbjliRFRrCkhHWjZUc1k5TDNSVXBvVmhROWhnV3FSU1FkVjNuR2xBM0EvcmJWWWVYbndKblZTcEFnTUJBQUdqUWpCQU1BNEcKQTFVZER3RUIvd1FFQXdJQ0JEQVBCZ05WSFJNQkFmOEVCVEFEQVFIL01CMEdBMVVkRGdRV0JCUVlsMlc5R0VMagpPNTZGc0krbEw0MlRCK3VBclRBTkJna3Foa2lHOXcwQkFRc0ZBQU9DQVFFQWNia29FeUQ2Q2x1UEJXSUdxU3VaCnE3L3hQZy9OZk1DZHgwRWJJRTY3d085U2JIcmpkQWJsUEhBeWRqb01OVVpPYnZJdlUwWnpkQlhGNytTVkpJVjYKUmxwWVJXMklXVEFLdjh1M2hRL1hJOVpFaXpQL1kzdmZPZndyOTJJMFRGRTFqblozSmFHR1ZDUWJmU3JRa3M4OApvQzY5UFNkK2xlQm1SRXpYUkZ1b2NUaHMzWktja0NOQ1crZDFHKzg1b0NZSzJQZDUvdWc1cE9Cb1Y2NHdXNjFJCjhpdm0yYlpmMTJHWTA3ZEFyWUFKc0NuZWM3VmhnekZtazU3NTQ4OUpSVUhkZ1FTbWdWaVBRKzQza0hpV0ZLeWIKdUxDMDRTYVdyWHh2ZGJZTCsycFg4L3lkd0w5QkRKMkQ4c3JuQ3FWV0tKRmF1U0pob3ViL0hFZzVUL0lDZ3pSdwp0Zz09Ci0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K"
       },
       "private_key": {
        "inline_bytes": "W3JlZGFjdGVkXQ=="
       }
      }
     }
    },
    {
     "name": "ROOTCA",
     "version_info": "0",
     "last_updated": "2021-03-25T08:12:04.926Z",
     "secret": {
      "@type": "type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.Secret",
      "name": "ROOTCA",
      "validation_context": {
       "trusted_ca": {
        "inline_bytes": "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSUMvVENDQWVXZ0F3SUJBZ0lSQU9iNXpET05aNjJaZm9wWFR6TjBEUkl3RFFZSktvWklodmNOQVFFTEJRQXcKR0RFV01CUUdBMVVFQ2hNTlkyeDFjM1JsY2k1c2IyTmhiREFlRncweU1UQXpNakl3TnpNMU16TmFGdzB6TVRBegpNakF3TnpNMU16TmFNQmd4RmpBVUJnTlZCQW9URFdOc2RYTjBaWEl1Ykc5allXd3dnZ0VpTUEwR0NTcUdTSWIzCkRRRUJBUVVBQTRJQkR3QXdnZ0VLQW9JQkFRQzMyUW9La0VGT1VPVHZRQTdIMFN4ZTQvWmk3TTFDZE5yanY3elIKcW94NjZVK1lCdFpwVUxYdWtWcTFnU1phZFNaUEdmRjluYVFEZGRVVEJkcUVoYUhTblJaQWR5VnVSS0MvejM2RwplVjlRWWcvT0dnWVdWNkNUU0pVZ0xtZXJIZXNJSm4xSVJrSHg0UFYvRXlST1JFM0tVKzBRamJ6a09jRmxPcjRjCk5mVGJDVUVHUHo1Zml4eEZaVWxTc21VRE1ocytDUTBTcXMwV1FRMm9NMmlPeE9KcHJXTDlxT3RjaDdhbENMdGgKRTRVT2hLT3VaTUZJQy9Jc2NUK1h0THo5aTA1L1lTYTVLNnYrQzFRZ0ZQNDB6NmpYMnpDeCtkN09aM245YkRUawpIR1o2VHNZOUwzUlVwb1ZoUTloZ1dxUlNRZFYzbkdsQTNBL3JiVlllWG53Sm5WU3BBZ01CQUFHalFqQkFNQTRHCkExVWREd0VCL3dRRUF3SUNCREFQQmdOVkhSTUJBZjhFQlRBREFRSC9NQjBHQTFVZERnUVdCQlFZbDJXOUdFTGoKTzU2RnNJK2xMNDJUQit1QXJUQU5CZ2txaGtpRzl3MEJBUXNGQUFPQ0FRRUFjYmtvRXlENkNsdVBCV0lHcVN1WgpxNy94UGcvTmZNQ2R4MEViSUU2N3dPOVNiSHJqZEFibFBIQXlkam9NTlVaT2J2SXZVMFp6ZEJYRjcrU1ZKSVY2ClJscFlSVzJJV1RBS3Y4dTNoUS9YSTlaRWl6UC9ZM3ZmT2Z3cjkySTBURkUxam5aM0phR0dWQ1FiZlNyUWtzODgKb0M2OVBTZCtsZUJtUkV6WFJGdW9jVGhzM1pLY2tDTkNXK2QxRys4NW9DWUsyUGQ1L3VnNXBPQm9WNjR3VzYxSQo4aXZtMmJaZjEyR1kwN2RBcllBSnNDbmVjN1ZoZ3pGbWs1NzU0ODlKUlVIZGdRU21nVmlQUSs0M2tIaVdGS3liCnVMQzA0U2FXclh4dmRiWUwrMnBYOC95ZHdMOUJESjJEOHNybkNxVldLSkZhdVNKaG91Yi9IRWc1VC9JQ2d6UncKdGc9PQotLS0tLUVORCBDRVJUSUZJQ0FURS0tLS0tCg=="
       }
      }
     }
    }
   ]
  }
 ]
}
""").mkString("")
}
