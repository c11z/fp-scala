package funsets

object Main extends App {
  import FunSets._
  val s0 = singletonSet(0)
  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)
  val s4 = singletonSet(4)
  val s = union(s1, union(s2, s3))
  def p = (i: Int) => i == 0
  def invert = (i: Int) => !p(i)
  val t = union(s, singletonSet(0))
}
