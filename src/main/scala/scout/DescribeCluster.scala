package scout

case class DescribeEndpoint(ip: String, healthFlag: String) extends Node(
  s"[Endpoint] $ip($healthFlag)"
)

case class DescribeCluster(name: String, describeEndpoint: List[DescribeEndpoint]) extends Node(
  s"[Cluster] $name", describeEndpoint
)

case class LinkDestination(describeDestination: DescribeDestination, describeCluster: DescribeCluster) extends Node(
  s"[Cluster]" + describeDestination.cluster + "\n[Weight]" + describeDestination.weight, List(describeCluster)
)

case class LinkRDS(describeRoute: DescribeRoute, linkDestination: List[LinkDestination]) extends Node(
  "s\"[Route]" + describeRoute.name, describeRoute.`match` :: linkDestination
)