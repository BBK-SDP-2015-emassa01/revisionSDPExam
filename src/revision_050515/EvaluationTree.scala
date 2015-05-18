package revision_050515



class MyEvaluationTree extends App{
  
sealed trait EvaluationTree 
final case class Term(i:Int) extends EvaluationTree
final case class Function(str:String, args:Seq[EvaluationTree]) extends EvaluationTree
  
def printATree(et:EvaluationTree): String = et match {
  case Term(i) => i.toString
  case Function(str, args) => "(" + str + (args map printATree) + ")" + ")"
}

Function("+", Seq(Term(5), Term (3)))



}