package revisionWeek6

object Func extends App { //partial application!
  
  //Write a function to take a argument to take a type 
  //... partial application of a function.
  //function that returns a function
  //function gotta have a return type that returns C.
  def part[A, B, C](a:A, fn:(A,B) => C): (B => C) = {
    (b:B) => fn(a,b)
  }
/* this is a common pattern that has a name, so it's called currying. 
 * given this type system, we can figure out how to do it.
 */
  
  //this is somethng else that composes two functions.
  def compose[A <% Comparable[A], B<% Comparable[B], C<% Comparable[C]] 
  /*can compile without the comparable as we took away the less than and the compare.
   * :)
   */
  (f:B => C, g: A=>B): A => C =
    (a:A) => f(g(a)) 
  /*
   * because g(a) gives us a b, and f(b) gives us a c
   */
  

  val add3 = part(3, (a:Int, b:Int) => a+b)
  /*theres a function above, and this example we've 
   * frozen some arguments, which could be useful!
   */
  val add6 = part(6, (a:Int, b:Int) => a+b)
  
  println(add3(6))
  println(add6(6))
  
  
  
  val f = (x:Double) => math.Pi /2-x
  val cos = f andThen math.sin 
  /*andThen relys on the first bit being successful, if it isnt then it wont
   * succeed, so we compose.
   */
  
  val double = (x:Double) => 2.0*x
  val squared = (x: Double) => x*x
  
  val y = (compose(double, squared)) 
  println(y(3)) //gonna take a squared and apply a double
  val x = double compose squared
  
  
  //if you take the comparator away above, then you can also write
//  println(compose(double, squared)(3))
}