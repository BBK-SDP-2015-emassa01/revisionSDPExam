

object books {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet")

  case class Book(title: String, authors: List[String]);$skip(393); 

  val books: List[Book] = List(
    Book(title = "The world", authors = List("Esha, Massand")),
    Book(title = "The earty", authors = List("Mom, Dad")),
    Book(title = "The dog", authors = List("Paju, Manoj")),
    Book(title = "The dog", authors = List("Paju, Manoj")),
    Book(title = "The cat", authors = List("Paju, Manoj")));System.out.println("""books  : List[books.Book] = """ + $show(books ));$skip(231); val res$0 = 

  for {
    b1 <- books
    b2 <- books
    b3 <- books
    if (b1.title != b2.title) && (b3.title != b2.title)
    a1 <- b1.authors
    a2 <- b2.authors
    a3 <- b3.authors
    if (a1 == a2) && (a1 == a3)
  } yield a1 .distinct;System.out.println("""res0: List[String] = """ + $show(res$0));$skip(95); 
                                                  
   def expr{
   val x = {print("x");1}
   };System.out.println("""expr: => Unit""");$skip(26); 
   val x = {print("x");1};System.out.println("""x  : Int = """ + $show(x ));$skip(14); 
   println(x)}

}
