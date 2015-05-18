package revisionWeek6

object books {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  println("Welcome to the Scala worksheet")
  
  case class Book(title:String, authors:List[String]);$skip(120); 
  
  val books =
   Book("The world", List("Esha", "Massand"));System.out.println("""books  : <error> = """ + $show(books ))}
  
  
}
