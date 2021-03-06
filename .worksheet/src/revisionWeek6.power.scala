package revisionWeek6

object power {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  println("Welcome to the Scala worksheet")}
  import scala.io.StdIn.{readDouble, readInt}

object Raise extends App {

  def raiseToPower(base: Double, power: Integer): Option[Double] = {
    def raiseToPowerWork(base: Double, power: Integer, accum: Double): Option[Double] = {
      if (power == 0)
        Some(accum)
      else
        raiseToPowerWork(base, power - 1, accum * base)
    }

    if (power <= 0)
      None
    else
      raiseToPowerWork(base, power, 1.0)
  }

  print("Enter b: ")
  val b = readDouble()
  print("Enter k: ")
  val k = readInt()

  println(raiseToPower(b, k).getOrElse(s"Invalid value $k"))


}
  
  
  }

/**Write a Scala program that reads a double value b and an integer value k as input, and them computes the value b raised to the power k and prints it. If the value of k is less than or equal to zero then that is considered an error.
Requirements: You must write a recursive function to compute the power Your solution must be tail-recursive
Example run:
/*Enter b: 2.0
Enter k: 3
8.0
You can use the following code to get the user input:
print("Enter b: ")
val b = readLine().toDouble
print("Enter k: ")
val k = readLine().toInt
*/
