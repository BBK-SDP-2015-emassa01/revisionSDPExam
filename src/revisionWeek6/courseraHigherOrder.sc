package revisionWeek6

object courseraHigherOrder {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def sum(f: Int => Int, a: Int, b: Int) = {
    def loop(a: Int, acc: Int): Int =
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    loop(a, 0)
  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int
  sum(x => x * x, 3, 5)                           //> res0: Int = 50

def mapReduce(f:Int=>Int,combine:(Int,Int)=>Int, noParams:Int)(a:Int, b:Int):Int = {
if(a>b) noParams
else combine(f(a), mapReduce(f, combine, noParams)(a+1, b))
}                                                 //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, noParams: Int)(a: Int
                                                  //| , b: Int)Int

def product(f:Int=>Int, a:Int, b:Int):Int =  mapReduce(f,(x,y)=>x*y, 1) (a,b)
                                                  //> product: (f: Int => Int, a: Int, b: Int)Int
/*def loop2(a:Int, acc:Int):Int=
if (a>b) acc
else loop2(a+1, f(a) * acc)

loop2(a,1)
*/

product(x=> x*x, 3,4)                             //> res1: Int = 144


def factorial(n:Int) = product(x=> x, 1,n)        //> factorial: (n: Int)Int
factorial(5)                                      //> res2: Int = 120



val tolerance = 0.0001                            //> tolerance  : Double = 1.0E-4
def isGoodEnough(guess:Double)(randomGuess:Double):Boolean= {
if ((randomGuess - guess) < tolerance)  true
else false
}                                                 //> isGoodEnough: (guess: Double)(randomGuess: Double)Boolean

def functiony(f:Double=>Double)(firstGuess:Double): Double={
def helper(nextGuess :Double):Double = {
val next = f(nextGuess)
if (isGoodEnough(nextGuess)(next)) next
else helper(next)
}
helper(firstGuess)
}                                                 //> functiony: (f: Double => Double)(firstGuess: Double)Double

functiony(x => 1+x/2)(1)                          //> res3: Double = 1.99993896484375

def averageDamp(f: Double=>Double)(value:Double) = (value + f(value))/2
                                                  //> averageDamp: (f: Double => Double)(value: Double)Double
def sqrt(x:Double) = functiony(averageDamp(y=> x/y))(1)
                                                  //> sqrt: (x: Double)Double
           sqrt(2)                                //> res4: Double = 1.4166666666666665


List(10, 5, 8, 1, 7).sortWith(_ > _)              //> res5: List[Int] = List(10, 8, 7, 5, 1)

List(List(1,2,3), List(5,6,7), List(2), List(1,1), List(1,45)).sortWith(_.length > _.length)
                                                  //> res6: List[List[Int]] = List(List(1, 2, 3), List(5, 6, 7), List(1, 1), List
                                                  //| (1, 45), List(2))

}