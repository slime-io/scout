package scout

/**
 * Created by 张武(zhangwu@corp.netease.com) at 2021/4/8
 */
class Node(val view: String, val children: List[Node] = Nil) {
  val nodeId = Node.totalNodes
  Node.totalNodes += 1
  def isOpen = Node.openNodes.contains(nodeId)
  def open = Node.openNodes.add(nodeId)

  override def toString = s"Node($view, $children)"
}
object Node {
  var totalNodes = 0
  val openNodes = scala.collection.mutable.Set[Int]()
  def switch(id: Int) = {
    if (openNodes.contains(id)) {
      openNodes.remove(id)
    } else {
      openNodes.add(id)
    }
  }

  def split(str: String): String = {
    str.split("\n").map(splitLine).mkString("\n")
  }
  def splitLine(str: String): String = {
    var result = ""
    var lineSize = 0
    str.split("\\.")
      .foreach { part =>
        if (lineSize + part.length > 35) {
          lineSize = 0
          result += "\n"
        }
        result += "." + part
        lineSize += part.length
      }
    result.drop(1)
  }
  def apply(view: String, ch: List[Node] = Nil) = new Node(view, ch)
  def apply(view: String, ch: Node) = new Node(view, List(ch))
}
