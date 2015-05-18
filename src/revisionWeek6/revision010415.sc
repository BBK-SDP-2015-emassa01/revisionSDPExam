package revisionWeek6

object revision010415 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

def part[A, B, C](a:A, fn:(A,B) => C): (B => C) = {
    (b:B) => fn(a,b)
  }                                               //> part: [A, B, C](a: A, fn: (A, B) => C)B => C
  

  val add3 = part(3, (a:Int, b:Int) => a+b)       //> add3  : Int => Int = <function1>
  /*theres a function above, and this example we've
   * frozen some arguments, which could be useful!
   */
  val add6 = part(6, (a:Int, b:Int) => a+b)       //> add6  : Int => Int = <function1>
  
  println(add3(6))                                //> 9
  println(add6(6))                                //> 12


}