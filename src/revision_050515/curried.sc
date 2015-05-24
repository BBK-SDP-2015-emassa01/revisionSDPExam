package revision_050515

object curried {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  // curry

  def line(a: Int, b: Int, x: Int): Int = a * x + b
                                                  //> line: (a: Int, b: Int, x: Int)Int

  //def curriedLine(a: Int)(b: Int)(x: Int): Int = line(a, b, x)

  def defaultLine(x: Int): Int = curriedLine(1)(0)(x)
                                                  //> defaultLine: (x: Int)Int

  def curriedLine = (line _).curried              //> curriedLine: => Int => (Int => (Int => Int))
  

  //defaultLine(5) // returns `5`

  // partial - essentially the same but freezes the value and works with multiple args

  def partialLine = (b: Int, x: Int) => line(2, b, x)
                                                  //> partialLine: => (Int, Int) => Int

  partialLine(0, 1)                               //> res0: Int = 2

  // def partialLine = line(2, _: Int, _: Int)

}