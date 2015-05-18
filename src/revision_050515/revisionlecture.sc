package revision_050515

object revisionlecture {

  class Players { ("Massand", "esha", 28) }
  type Squad = Seq[Players]
  type Division = Seq[Squad]

  /*
  def averageAge[T](div: Seq[T]): Int = div match {
    case _: Seq[Division] =>
  } */
  
  var totalAge = 0                                //> totalAge  : Int = 0
  val arrayOfPlayers = List(("Massand", "esha", 28) , ("Massand", "Manoj", 27), ("Massand", "Raju", 36)  )
                                                  //> arrayOfPlayers  : List[(String, String, Int)] = List((Massand,esha,28), (Mas
                                                  //| sand,Manoj,27), (Massand,Raju,36))
  arrayOfPlayers.map { case (e1: String, e2: String, e3: Int) => totalAge + e3 }
                                                  //> res0: List[Int] = List(28, 27, 36)
  
  println(totalAge)                               //> 0
}