package revision_050515

sealed trait EvaluationList
final case class Term(n: Int) extends EvaluationList
final case class Sum(e1: EvaluationList, e2: EvaluationList) extends EvaluationList
final case class Minus(n1: EvaluationList, n2: EvaluationList) extends EvaluationList
final case class Func(str: String, args: List[EvaluationList]) extends EvaluationList

object MyEvaluationTreeList extends App {

  def eval(el: EvaluationList): Int = el match {
    case Term(n) => n
    case Sum(n1, n2) => eval(n1) + eval(n2)
    case Minus(n1, n2) => eval(n1) - eval(n2)
    case Func(str, args) => 1
  }

  def printList(el: EvaluationList): String = el match {
    case Term(n) => n.toString
    case Func(str, args) => "(" + mkString(str, args) + ")"
    case Sum(_, _) => " "
    case Minus(_, _) => " "
  }

  def mkString(str: String, args: List[EvaluationList]): String = args match {
    case Nil => " "
    case s :: Nil => printList(s)
    case s :: ss => printList(s) + mkString(str, ss)
  }

  def listReduce(list: List[Int], fn: Int => Boolean): List[Int] = list match {
    case Nil => Nil
    case s :: ss => if (fn(s)) s :: listReduce(ss, fn) else listReduce(ss, fn)
  }

  val listy = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  listReduce(listy, x => x % 2 == 0)

}