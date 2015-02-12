package revisionWeek6 //revise this!!!!

object Revision extends App {
  
  def factorial(n:Int):Int = {
    def helper (n:Int, acc:Int):Int =
      if (n<=0) acc
      else helper(n-1, n*acc)
      
      helper(n,1)
  }
  //we need a helper if we do a tail recursive
  
  def abs(n:Int):Int = { //takes an int in, and returns an int
    if(n<0)-n
    else n
  }
  
  private def prettyFactorialMsg(x:Int):String = {
    s"The factorial value of $x is ${factorial(x)}"
  }
  
  private def prettyAbsMsg(x:Int):String = {
    s"The absolute value of $x is ${abs(x)}"
  }
  
  println(prettyFactorialMsg(5))
  println(prettyAbsMsg(-1))
  
  
    //functional abstraction may be useful for repetition!
  private def prettyMsg(msg:String, x:Int, f: Int => Int):String = { //f here is  a function
    s"$msg $x is ${f(x)}"
  }
  
  //then our calls can become...
  println(prettyMsg("Factorial of ", 5, factorial))
  println(prettyMsg("Absolute of ", -1, abs))
}