package revisionWeek6

object lists {
  var xs = List(1, 2, 3, 4, 5)
  var ys = List(6, 7, 8, 9, 10)

  (1 to 5) flatMap (x => (6 to 10) map (y => (x, y)))

  val s = xs map (x => x * x)

  val ls = (xs zip ys)

  def producty(list: List[(Int, Int)]): Int = {
    list match {
      case (List(x: Int, y: Int)) => x * y
    }
  }
  
  producty(ls)

}