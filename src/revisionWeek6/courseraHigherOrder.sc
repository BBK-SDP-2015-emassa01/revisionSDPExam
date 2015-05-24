package revisionWeek6

object courseraHigherOrder {
  println("Welcome to the Scala worksheet")

  def sum(f: Int => Int, a: Int, b: Int) = {
    def loop(a: Int, acc: Int): Int =
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    loop(a, 0)
  }
  sum(x => x * x, 3, 5)

def mapReduce(f:Int=>Int,combine:(Int,Int)=>Int, noParams:Int)(a:Int, b:Int):Int = {
if(a>b) noParams
else combine(f(a), mapReduce(f, combine, noParams)(a+1, b))
}

def product(f:Int=>Int, a:Int, b:Int):Int =  mapReduce(f,(x,y)=>x*y, 1) (a,b)
/*def loop2(a:Int, acc:Int):Int=
if (a>b) acc
else loop2(a+1, f(a) * acc)

loop2(a,1)
*/

product(x=> x*x, 3,4)


def factorial(n:Int) = product(x=> x, 1,n)
factorial(5)



val tolerance = 0.0001
def isGoodEnough(guess:Double)(randomGuess:Double):Boolean= {
if ((randomGuess - guess) < tolerance)  true
else false
}

def functiony(f:Double=>Double)(firstGuess:Double): Double={
def helper(nextGuess :Double):Double = {
val next = f(nextGuess)
if (isGoodEnough(nextGuess)(next)) next
else helper(next)
}
helper(firstGuess)
}

functiony(x => 1+x/2)(1)

def averageDamp(f: Double=>Double)(value:Double) = (value + f(value))/2
def sqrt(x:Double) = functiony(averageDamp(y=> x/y))(1)
           sqrt(2)


List(10, 5, 8, 1, 7).sortWith(_ > _)

List(List(1,2,3), List(5,6,7), List(2), List(1,1), List(1,45)).sortWith(_.length > _.length)
def listSort(list : List[T])
                                                  

}