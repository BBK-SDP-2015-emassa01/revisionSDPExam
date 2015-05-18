

object books {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  case class Book(title: String, authors: List[String])

  val books: List[Book] = List(
    Book(title = "The world", authors = List("Esha, Massand")),
    Book(title = "The earty", authors = List("Mom, Dad")),
    Book(title = "The dog", authors = List("Paju, Manoj")),
    Book(title = "The dog", authors = List("Paju, Manoj")),
    Book(title = "The cat", authors = List("Paju, Manoj")))
                                                  //> books  : List[books.Book] = List(Book(The world,List(Esha, Massand)), Book(T
                                                  //| he earty,List(Mom, Dad)), Book(The dog,List(Paju, Manoj)), Book(The dog,List
                                                  //| (Paju, Manoj)), Book(The cat,List(Paju, Manoj)))

  for {
    b1 <- books
    b2 <- books
    b3 <- books
    if (b1.title != b2.title) && (b3.title != b2.title)
    a1 <- b1.authors
    a2 <- b2.authors
    a3 <- b3.authors
    if (a1 == a2) && (a1 == a3)
  } yield a1 .distinct                            //> res0: List[String] = List(Paju, Mno, Paju, Mno, Paju, Mno, Paju, Mno, Paju, 
                                                  //| Mno, Paju, Mno)
                                                  
   def expr{
   val x = {print("x");1}
   }                                              //> expr: => Unit
   val x = {print("x");1}                         //> xx  : Int = 1
   println(x)                                     //> 1

}