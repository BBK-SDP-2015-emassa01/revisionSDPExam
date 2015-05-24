package revision_050515



object MyEvaluationTree extends App{
  
sealed trait EvaluationTree 
final case class Term(i:Int) extends EvaluationTree
final case class Function(str:String, args:Seq[EvaluationTree]) extends EvaluationTree
final case class Sum (n1: EvaluationTree, n2: EvaluationTree) extends EvaluationTree
final case class Sub(n1: EvaluationTree, n2: EvaluationTree) extends EvaluationTree

def evaluate(et:EvaluationTree): Int = et match {
  case Term(n) => n
  case Sum(n1, n2) => evaluate(n1) + evaluate(n2)
  case Sub(n1, n2) => evaluate (n1) - evaluate(n2)
}

def PrintIt(et:EvaluationTree): String = et match {
  case Term(n) => n.toString
  case Function(str, args) => "(" + mkString(str, args) + ")"
  
}

def mkString(str:String, args: Seq[EvaluationTree]): String = args match {
  case Nil => " "
  case func::Nil => PrintIt (func)
  case func::funcs => PrintIt (func)  + str +  mkString(str, funcs)
}
  
def printATree(et:EvaluationTree): String = et match {
  case Term(i) => i.toString
  case Function(str, args) => "(" + str + (args map printATree) + ")" + ")"
}

println(MyEvaluationTree.PrintIt(Function("+", Seq(Term(5), Term (3)))))
println(PrintIt(Function("+", Seq(Term(2), Function("*", Seq(Term(3), Term(5), Term(6)))))))



}