package revisionWeek6

object courseraHigherOrder {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(95); 
  println("Welcome to the Scala worksheet");$skip(159); 

  def sum(f: Int => Int, a: Int, b: Int) = {
    def loop(a: Int, acc: Int): Int =
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    loop(a, 0)
  };System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(24); val res$0 = 
  sum(x => x * x, 3, 5);System.out.println("""res0: Int = """ + $show(res$0));$skip(165); 

def mapReduce(f:Int=>Int,combine:(Int,Int)=>Int, noParams:Int)(a:Int, b:Int):Int = {
if(a>b) noParams
else combine(f(a), mapReduce(f, combine, noParams)(a+1, b))
};System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, noParams: Int)(a: Int, b: Int)Int""");$skip(79); 

def product(f:Int=>Int, a:Int, b:Int):Int =  mapReduce(f,(x,y)=>x*y, 1) (a,b);System.out.println("""product: (f: Int => Int, a: Int, b: Int)Int""");$skip(112); val res$1 = 
/*def loop2(a:Int, acc:Int):Int=
if (a>b) acc
else loop2(a+1, f(a) * acc)

loop2(a,1)
*/

product(x=> x*x, 3,4);System.out.println("""res1: Int = """ + $show(res$1));$skip(45); 


def factorial(n:Int) = product(x=> x, 1,n);System.out.println("""factorial: (n: Int)Int""");$skip(13); val res$2 = 
factorial(5);System.out.println("""res2: Int = """ + $show(res$2));$skip(26); 



val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(120); 
def isGoodEnough(guess:Double)(randomGuess:Double):Boolean= {
if ((randomGuess - guess) < tolerance)  true
else false
};System.out.println("""isGoodEnough: (guess: Double)(randomGuess: Double)Boolean""");$skip(208); 

def functiony(f:Double=>Double)(firstGuess:Double): Double={
def helper(nextGuess :Double):Double = {
val next = f(nextGuess)
if (isGoodEnough(nextGuess)(next)) next
else helper(next)
}
helper(firstGuess)
};System.out.println("""functiony: (f: Double => Double)(firstGuess: Double)Double""");$skip(26); val res$3 = 

functiony(x => 1+x/2)(1);System.out.println("""res3: Double = """ + $show(res$3));$skip(73); 

def averageDamp(f: Double=>Double)(value:Double) = (value + f(value))/2;System.out.println("""averageDamp: (f: Double => Double)(value: Double)Double""");$skip(56); 
def sqrt(x:Double) = functiony(averageDamp(y=> x/y))(1);System.out.println("""sqrt: (x: Double)Double""");$skip(19); val res$4 = 
           sqrt(2);System.out.println("""res4: Double = """ + $show(res$4));$skip(39); val res$5 = 


List(10, 5, 8, 1, 7).sortWith(_ > _);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(94); val res$6 = 

List(List(1,2,3), List(5,6,7), List(2), List(1,1), List(1,45)).sortWith(_.length > _.length);System.out.println("""res6: List[List[Int]] = """ + $show(res$6));$skip(29); 
def listSort(list : List[T]);System.out.println("""listSort: (list: List[<error>])Unit""")}
                                                  

}
