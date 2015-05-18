package revision_050515

object revisionlecture {

  class Players { ("Massand", "esha", 28) }
  type Squad = Seq[Players]
  type Division = Seq[Squad];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(267); 

  /*
  def averageAge[T](div: Seq[T]): Int = div match {
    case _: Seq[Division] =>
  } */
  
  var totalAge = 0;System.out.println("""totalAge  : Int = """ + $show(totalAge ));$skip(107); 
  val arrayOfPlayers = List(("Massand", "esha", 28) , ("Massand", "Manoj", 27), ("Massand", "Raju", 36)  );System.out.println("""arrayOfPlayers  : List[(String, String, Int)] = """ + $show(arrayOfPlayers ));$skip(81); val res$0 = 
  arrayOfPlayers.map { case (e1: String, e2: String, e3: Int) => totalAge + e3 };System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(23); 
  
  println(totalAge)}
}
