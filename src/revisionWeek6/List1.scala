package revisionWeek6

trait List1[T] {

  def isEmpty:Boolean
  def head: T
  def tail : List1[T]
  
}

class Cons[T](val head:T, val tail: List1[T]) extends List1[T]{
  def isEmpty: Boolean = false
}

class Nil[T] extends List1[T]{
  def isEmpty : Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nill.head")
  def tail: Nothing = throw new NoSuchElementException("Nill.tail")
}

object Stuff extends App{
  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
  
  def nth[T](n:Int, list:List1[T]): T = {
    if (list.isEmpty) throw new IndexOutOfBoundsException
    if (n==0) list.head
    else nth(n-1, list.tail)
  }
  
  override def main (args: Array[String]) {
    println(singleton[Int](2))
    println(singleton[String]("Esha"))
    println(singleton(2)) //inferred
    
    val list = new Cons(2, new Cons(3, new Cons(4, new Cons(5, new Nil))))

    println(nth(3, list))
    println(nth(-1, list))
  }
  
  object List{
    
    def apply[T](x1: T, x2:T) = {
      new Cons(x1, (new Cons(x2, new Nil)))
    }
    
    def apply[T]() = new Nil
    
  }
  
  
}