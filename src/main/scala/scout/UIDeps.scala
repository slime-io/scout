package scout

import org.scalajs.jquery.JQueryStatic

import scala.scalajs.js
import scala.scalajs.js._
import scala.scalajs.js.annotation.JSImport

/**
 * Created by 张武(zhangwu@corp.netease.com) at 2021/4/14
 */
object UIDeps {
  @js.native
  @JSImport("jquery", JSImport.Namespace)
  object $ extends JQueryStatic

  @js.native
  @JSImport("d3", JSImport.Namespace)
  object _d3 extends Any
  val d3 = _d3.asInstanceOf[Dynamic]
}
