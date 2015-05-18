package revisionWeek6

object IntSet {
  println("Welcome to the Scala worksheet")
  
  val tree1 = new NonEmptySet (3, new EmptySet, new EmptySet)
  
  val tree2 = tree1.incl(4)
  }
  
  abstract class IntSet{
  def incl(x:Int):IntSet
  def contains(x:Int):Boolean
  def union(other:IntSet):IntSet
  }
  
  //want to maintain a binary tree in this implementation
  class EmptySet extends IntSet{
  def incl(x:Int): IntSet= new NonEmptySet(x, new EmptySet, new EmptySet);
  def contains(x:Int):Boolean = false
  def union(other:IntSet):IntSet = other
  
  override def toString = "."
  }
  
  class NonEmptySet(elem:Int, left:IntSet, right:IntSet) extends IntSet{
  
  def incl(x:Int):IntSet =
  if (x<elem) new NonEmptySet(elem, left.incl(x), right)
  else if (x> elem) new NonEmptySet(elem, left, right.incl(x)) //this means include the element in the left subtree (a NEW subtree)
  else this
  
  def contains(x:Int):Boolean =
  if (x<elem) left.contains(x)
  else if (x > elem) right.contains(x)
  else true
  
  def union(other:IntSet):IntSet = {
  if (this.contains(other))
  
  }
  
  override def toString = "{" + left + elem + right + "}"
  }
  
  