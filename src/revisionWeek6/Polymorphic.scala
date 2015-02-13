package revisionWeek6

//NOTATION IN SCALA
//T extends xxxx
//T extends ?
//<:  what is this
//>: or this
//
//<% view bound!

//import scala.annoatation.tailrec

//object Polymorphic extends App{
//  
//  def findFirst(as:Array[String], value:String):Int = {
//  //as = arrayOfString
//  /* we are dealing with an immutable structure so we can cut it up.
//   * we are looking for the first value in the array of string.
//   * we can spawn a process, and call parallel to break a large process up into smaller
//   * chunks, and therefore take advantage of the multiple cores of a computer.
//   */
//   @tailrec
//   def helper(n:Int):Int = 
//     if (n>= as.length) -1
//     else if (as(n) == value) n
//     else helper(n+1)
//     
//     helper(0)
//  }
//  
//  println(findFirst(Array("1","23", "4", "5", "6"), "6"))
//}

//from the above, lets create it polymorphic!

object Polymorphic extends App{
  
  def findFirst[T](as:Array[T], value:T):Int = {
  //as = arrayOfString
  /* we are dealing with an immutable structure so we can cut it up.
   * we are looking for the first value in the array of string.
   * we can spawn a process, and call parallel to break a large process up into smaller
   * chunks, and therefore take advantage of the multiple cores of a computer.
   */
   def helper(n:Int): Int = 
     if (n>= as.length) -1
     else if (as(n) == value) n
     else helper(n+1)
     
     helper(0)
  }
  
//  def isSorted[T](as:Array[T], ordered :(T,T) => Boolean): Boolean = {
//    /*
//     * the array is not sorted if you encounter 2 elements for which 
//     * ordered(first, second) returns false.
//     */
//    def helper(n:Int): Boolean = 
//      if (n >= as.length-1) true //got to the end so it works!
//      else if (ordered(as(n), as(n+1))) false 
//    else helper(n+1)
//    
//      helper(0) //starts the helper, calls it!
//  } 
  
  //CHECK THIS OUT!
  //work more with the above to make it implement comparable! IMPLICIT!!! SHOULD WOORK WITH EVERYTHING
  //THAT HAS A COMPARABLE. TYPE SYSTEM IS TIGHT IN SCALA
  def isSorted[T<% Comparable[T]](as:Array[T], ordered :(T,T) => Boolean): Boolean = {
    /*
     * the array is not sorted if you encounter 2 elements for which 
     * ordered(first, second) returns false.
     */
    def helper(n:Int): Boolean = 
      if (n >= as.length-1) true //got to the end so it works!
      else if (ordered(as(n), as(n+1))) false 
    else helper(n+1)
    
      helper(0) //starts the helper, calls it!
  } 
  
  def ordered (x:Int, y:Int):Boolean = {
    x>y //still need to do stuff to generisize this!
  }
  
  println(isSorted(Array(1,23,4,5,6), ordered))
  println(isSorted(Array(1,23,4,5,6), (a:Int, b:Int) => a>b)) //in line as a function literal

  //downside of generics, at runtime only! not at compile time.
  println("Answer: "+findFirst(Array(1,23,4,5,6), 5))
}
