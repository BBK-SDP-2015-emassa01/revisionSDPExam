package revisionWeek6

object IntSet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  println("Welcome to the Scala worksheet");$skip(65); 
  
  val tree1 = new NonEmptySet (3, new EmptySet, new EmptySet);System.out.println("""tree1  : revisionWeek6.NonEmptySet = """ + $show(tree1 ));$skip(31); 
  
  val tree2 = tree1.incl(4);System.out.println("""tree2  : revisionWeek6.IntSet = """ + $show(tree2 ))}
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
  
  