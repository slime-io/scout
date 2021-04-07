package scout

/**
 * Created by 张武(zhangwu@corp.netease.com) at 2021/4/8
 */
object UI {

  import org.querki.jquery._
  import scala.scalajs.js._
  def init(data: Node): Unit = {
    $("#size").on("input propertychange", () => render(data))
    UI.render(data)
  }

  def nodeForJS(node: Node): Dynamic = {
    val ch = if (node.isOpen) Array(node.chch: _*).map(nodeForJS) else Array()
    Dynamic.literal(
      name = Node.split(node.view),
      children = ch,
      nodeId = node.nodeId
    )
  }

  def render(json: Node): Unit = {
    val d3 = Dynamic.global.d3

    $("#msgBox").text("")
    //    val src = $("#expr").`val`().asInstanceOf[String]
    //    $("#scanner").text(json.toString)

    val rawSize = Integer.parseInt($("#size").`val`.asInstanceOf[String])
    val size = rawSize * rawSize / 3

    val tree = d3.layout.tree()
      .size(Array(size, size - 300))
      .separation((a: Dynamic, b: Dynamic) ⇒ (if (a.parent == b.parent) 1 else 2))

    val diagonal = d3.svg.diagonal().projection((d: Dynamic, _: Dynamic) ⇒ Array(d.y, d.x))
    d3.select("#graph svg").remove()

    val svg = d3.select("#graph").append("svg")
      .attr("width", size)
      .attr("height", size)
      .append("g")
      .attr("transform", "translate(40,0)")
    def hasChildren(d: Dynamic) = scala.util.Try(d.children.asInstanceOf[Array[_]].nonEmpty).getOrElse(false)
    val nodes = tree.nodes(nodeForJS(json))
    svg.selectAll(".link")
      .data(tree.links(nodes))
      .enter()
      .append("path")
      .attr("class", "link")
      .attr("d", diagonal)
    val node = svg.selectAll(".node")
      .data(nodes)
      .enter()
      .append("g")
      .attr("class", "node")
      .attr("transform", (d: Dynamic) ⇒ "translate(" + d.y + "," + d.x + ") rotate(-8)")
    node.append("circle").attr("r", 7)
    node.append("text")
      .style("text-anchor", (d: Dynamic) ⇒ if (hasChildren(d)) "start" else "start")
      .selectAll("tspan")
      .data((d: Dynamic, i: Dynamic) ⇒ {
        d.name.split("\n")
      })
      .enter()
      .append("tspan")
      .attr("x", 8)
      .attr("dy", (d: Dynamic, i: Int) ⇒ if (i == 0) "0" else "1em")
      .text((d: Dynamic) ⇒ d)
    node
      .on("click", (v1: Any, v2: Any) => {
        val nodeId = v1.asInstanceOf[Dynamic].nodeId.asInstanceOf[Int]
        Node.switch(nodeId)
        render(json)
      })
  }

}
