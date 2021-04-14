package scout.cmd

import scout.Node

trait Command {
  def exec(): Node = doExec().getOrElse(Node(""))
  def doExec(): Option[Node]
}

object Command {
  def apply(cmd: String) = cmd.split(" ").toList match {
    case "curl" :: tail => Curl(tail)
    case _ => None
  }
}
