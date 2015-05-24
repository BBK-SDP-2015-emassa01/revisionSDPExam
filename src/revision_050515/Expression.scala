package revision_050515



sealed trait Exp
final case class Num(n: Int) extends Exp
final case class Plus(n1: Exp, n2: Exp) extends Exp
final case class Mul(n1: Exp, n2: Exp) extends Exp
final case class Sub(n1: Exp, n2: Exp) extends Exp
final case class Div(n1:Exp, n2:Exp) extends Exp
final case class Function(seperator:String, args: Seq[Exp]) extends Exp

object Expr extends App{

  def evaluate(e: Exp): Int = e match {
    case Num(n) => n
    case Plus(n1, n2) => evaluate(n1) + evaluate(n2)
    case Mul(n1, n2) => evaluate(n1) * evaluate(n2)
    case Sub(n1, n2) => evaluate(n1) - evaluate(n2)
    case Div(n1, n2) => evaluate (n1)  / evaluate(n2)
  }
  
  def printTree(expression:Exp):String = expression match {
    case Num(n) => n.toString
    case Function(string,args) => "(" + mkString(string, args) + ")"
  }
  
  def mkString (string: String, args: Seq[Exp]) : String = args match{
    case Nil => " "
    case s:: Nil => printTree(s)
    case s::ss => printTree(s) +string + mkString(string, ss)
    
  }
  
  //println(Plus(Num(10),Sub(Num(2),Num(4)))) Just prints out the actual code!
  
  
  println("This is the Expression: "+ Expr.evaluate(Plus(Mul(Num(3), Num(4)), Sub(Num(3), Num(4)))))
  println("This is the Expression: "+  Expr.evaluate(Plus(Num(10),Sub(Num(2),Num(4)))))
  
  println("This is the Function" + Expr.printTree(Function("+", Seq(Num(10), Function("-",Seq(Num(2), Num(4), Num(5) ))))))

}