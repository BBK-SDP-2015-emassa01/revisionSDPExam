package revisionWeek6

object revision010415 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  println("Welcome to the Scala worksheet");$skip(78); 

def part[A, B, C](a:A, fn:(A,B) => C): (B => C) = {
    (b:B) => fn(a,b)
  };System.out.println("""part: [A, B, C](a: A, fn: (A, B) => C)B => C""");$skip(48); 
  

  val add3 = part(3, (a:Int, b:Int) => a+b);System.out.println("""add3  : Int => Int = """ + $show(add3 ));$skip(153); 
  /*theres a function above, and this example we've
   * frozen some arguments, which could be useful!
   */
  val add6 = part(6, (a:Int, b:Int) => a+b);System.out.println("""add6  : Int => Int = """ + $show(add6 ));$skip(22); 
  
  println(add3(6));$skip(19); 
  println(add6(6))}


}
