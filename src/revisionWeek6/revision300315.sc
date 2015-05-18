package revisionWeek6

object revision300315 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //CONSING
  
  val fruitList1 = List("apple", "pear", "banana")//> fruitList1  : List[String] = List(apple, pear, banana)
  val fruitList2 = List("plum", "peach", "coconut")
                                                  //> fruitList2  : List[String] = List(plum, peach, coconut)
 
  "an item" +: fruitList1                         //> res0: List[String] = List(an item, apple, pear, banana)

	fruitList1:::fruitList2                   //> res1: List[String] = List(apple, pear, banana, plum, peach, coconut)
	
	fruitList1.isEmpty                        //> res2: Boolean = false
	Nil.isEmpty                               //> res3: Boolean = true
	fruitList1.head                           //> res4: String = apple
	fruitList1.tail.head                      //> res5: String = pear
	
	fruitList1 match{
	case(h::t) => {println(h + " is the head")}
	//this just pulls off the head and the tail is assigned the rest
	}                                         //> apple is the head


	//ZIPPING!
	
	val left = Vector ("a", "b", "c", "d")    //> left  : scala.collection.immutable.Vector[String] = Vector(a, b, c, d)
	val right = Vector ("q", "r", "s", "t")   //> right  : scala.collection.immutable.Vector[String] = Vector(q, r, s, t)
	val left2 = Vector("u", "v")              //> left2  : scala.collection.immutable.Vector[String] = Vector(u, v)
	
	left2 zip right                           //> res6: scala.collection.immutable.Vector[(String, String)] = Vector((u,q), (v
                                                  //| ,r))

	val leftList = List(1,2,3)                //> leftList  : List[Int] = List(1, 2, 3)
	val rightList = List(4,5,6)               //> rightList  : List[Int] = List(4, 5, 6)
	leftList zip rightList                    //> res7: List[(Int, Int)] = List((1,4), (2,5), (3,6))
	
	
	//FOLDING! -- Fold by Group, Fold on Pivot
	leftList.foldRight(100)(_+_)              //> res8: Int = 106
	//just folds up the list.
	//it could be the first value on the list.
	
	val characterList = List("a", "b", "c", "d")
                                                  //> characterList  : List[String] = List(a, b, c, d)
	characterList.foldLeft("a")(_ + _)        //> res9: String = aabcd
	
	leftList.foldLeft(0)(_ + _)/leftList.foldLeft(0)((x,y) => x+1)
                                                  //> res10: Int = 2
	//iterate over the list and sum...then iterate over a list and add 1 each time, to create an average.
	//Note:IN A LAMBDA EXPRESSION, THE FOLDLEFT AND FOLDRIGHT APPEAR TO WORK THE OPPOSITE TO WHAT THEY SUGGEST - IN LAMBDA
	
	
	
	//MAPPING!
	leftList.map(n=> n+1)                     //> res11: List[Int] = List(2, 3, 4)
	//Adds 1 to each element in the list
	leftList.map(n=> n * n)                   //> res12: List[Int] = List(1, 4, 9)
	
	//REDUCE!
	leftList.reduce((x,y) => x+y)             //> res13: Int = 6
	//x is the head so it takes x and then feed it (reduce it) back in.
	//we want to be able to parallelise this, so we create immutable structures.
	
	//REDUCE IS JUST syntactical sugar for FOLD of just the HEAD of the list
	leftList.reduce(_ + _)                    //> res14: Int = 6
	//



	//FILTERING
	leftList.filter(_ < 4)                    //> res15: List[Int] = List(1, 2, 3)
	leftList.filter(_ < 4).reduce(_+_)        //> res16: Int = 6
	
	//TUPLES
	//CAN BE MIXED TYPE
	var (d, n, s) = (1.1, 12, "hi")           //> d  : Double = 1.1
                                                  //| n  : Int = 12
                                                  //| s  : String = hi
	var x = (1.1, 12, "hi")                   //> x  : (Double, Int, String) = (1.1,12,hi)
	println(x._1)                             //> 1.1
	//INDEXED from one! 1
	
	
	//FOR COMPREHENSION
	for {item <- leftList if item % 2 == 0
	} yield item                              //> res17: List[Int] = List(2)
  //can use map filter reduce fold in this, in a procedural way. Does it all.
	
	//NOT FOR COMPREHENSION
	for (item <- leftList) {
	if (item % 2 == 0)
	println(item)                             //> 2
	}
	
	//NOT FOR COMPREHENSION
	leftList.foreach(x => if(x % 2 ==0) println(x))
                                                  //> 2

}