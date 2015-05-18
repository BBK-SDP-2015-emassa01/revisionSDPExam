package revisionWeek6

object revision300315 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  println("Welcome to the Scala worksheet");$skip(69); 
  
  //CONSING
  
  val fruitList1 = List("apple", "pear", "banana");System.out.println("""fruitList1  : List[String] = """ + $show(fruitList1 ));$skip(52); 
  val fruitList2 = List("plum", "peach", "coconut");System.out.println("""fruitList2  : List[String] = """ + $show(fruitList2 ));$skip(28); val res$0 = 
 
  "an item" +: fruitList1;System.out.println("""res0: List[String] = """ + $show(res$0));$skip(26); val res$1 = 

	fruitList1:::fruitList2;System.out.println("""res1: List[String] = """ + $show(res$1));$skip(22); val res$2 = 
	
	fruitList1.isEmpty;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(13); val res$3 = 
	Nil.isEmpty;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(17); val res$4 = 
	fruitList1.head;System.out.println("""res4: String = """ + $show(res$4));$skip(22); val res$5 = 
	fruitList1.tail.head;System.out.println("""res5: String = """ + $show(res$5));$skip(135); 
	
	fruitList1 match{
	case(h::t) => {println(h + " is the head")}
	//this just pulls off the head and the tail is assigned the rest
	};$skip(56); 


	//ZIPPING!
	
	val left = Vector ("a", "b", "c", "d");System.out.println("""left  : scala.collection.immutable.Vector[String] = """ + $show(left ));$skip(41); 
	val right = Vector ("q", "r", "s", "t");System.out.println("""right  : scala.collection.immutable.Vector[String] = """ + $show(right ));$skip(30); 
	val left2 = Vector("u", "v");System.out.println("""left2  : scala.collection.immutable.Vector[String] = """ + $show(left2 ));$skip(19); val res$6 = 
	
	left2 zip right;System.out.println("""res6: scala.collection.immutable.Vector[(String, String)] = """ + $show(res$6));$skip(29); 

	val leftList = List(1,2,3);System.out.println("""leftList  : List[Int] = """ + $show(leftList ));$skip(29); 
	val rightList = List(4,5,6);System.out.println("""rightList  : List[Int] = """ + $show(rightList ));$skip(24); val res$7 = 
	leftList zip rightList;System.out.println("""res7: List[(Int, Int)] = """ + $show(res$7));$skip(78); val res$8 = 
	
	
	//FOLDING! -- Fold by Group, Fold on Pivot
	leftList.foldRight(100)(_+_);System.out.println("""res8: Int = """ + $show(res$8));$skip(119); 
	//just folds up the list.
	//it could be the first value on the list.
	
	val characterList = List("a", "b", "c", "d");System.out.println("""characterList  : List[String] = """ + $show(characterList ));$skip(36); val res$9 = 
	characterList.foldLeft("a")(_ + _);System.out.println("""res9: String = """ + $show(res$9));$skip(66); val res$10 = 
	
	leftList.foldLeft(0)(_ + _)/leftList.foldLeft(0)((x,y) => x+1);System.out.println("""res10: Int = """ + $show(res$10));$skip(264); val res$11 = 
	//iterate over the list and sum...then iterate over a list and add 1 each time, to create an average.
	//Note:IN A LAMBDA EXPRESSION, THE FOLDLEFT AND FOLDRIGHT APPEAR TO WORK THE OPPOSITE TO WHAT THEY SUGGEST - IN LAMBDA
	
	
	
	//MAPPING!
	leftList.map(n=> n+1);System.out.println("""res11: List[Int] = """ + $show(res$11));$skip(63); val res$12 = 
	//Adds 1 to each element in the list
	leftList.map(n=> n * n);System.out.println("""res12: List[Int] = """ + $show(res$12));$skip(44); val res$13 = 
	
	//REDUCE!
	leftList.reduce((x,y) => x+y);System.out.println("""res13: Int = """ + $show(res$13));$skip(247); val res$14 = 
	//x is the head so it takes x and then feed it (reduce it) back in.
	//we want to be able to parallelise this, so we create immutable structures.
	
	//REDUCE IS JUST syntactical sugar for FOLD of just the HEAD of the list
	leftList.reduce(_ + _);System.out.println("""res14: Int = """ + $show(res$14));$skip(44); val res$15 = 
	//



	//FILTERING
	leftList.filter(_ < 4);System.out.println("""res15: List[Int] = """ + $show(res$15));$skip(36); val res$16 = 
	leftList.filter(_ < 4).reduce(_+_);System.out.println("""res16: Int = """ + $show(res$16));$skip(66); 
	
	//TUPLES
	//CAN BE MIXED TYPE
	var (d, n, s) = (1.1, 12, "hi");System.out.println("""d  : Double = """ + $show(d ));System.out.println("""n  : Int = """ + $show(n ));System.out.println("""s  : String = """ + $show(s ));$skip(25); 
	var x = (1.1, 12, "hi");System.out.println("""x  : (Double, Int, String) = """ + $show(x ));$skip(15); 
	println(x._1);$skip(102); val res$17 = 
	//INDEXED from one! 1
	
	
	//FOR COMPREHENSION
	for {item <- leftList if item % 2 == 0
	} yield item;System.out.println("""res17: List[Int] = """ + $show(res$17));$skip(166); 
  //can use map filter reduce fold in this, in a procedural way. Does it all.
	
	//NOT FOR COMPREHENSION
	for (item <- leftList) {
	if (item % 2 == 0)
	println(item)
	};$skip(79); 
	
	//NOT FOR COMPREHENSION
	leftList.foreach(x => if(x % 2 ==0) println(x))}

}
