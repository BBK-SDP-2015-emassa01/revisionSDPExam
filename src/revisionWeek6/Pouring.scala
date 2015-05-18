
class Pouring(capacity: Vector[Int]) { //glass (element of vector) and capacity
  
  //States
  type State = Vector[Int]
  val initialState = capacity map (x=> 0)
  
  //Moves
  trait Move
  case class Empty(glass:Int) extends Move
  case class Fill(glass:Int) extends Move
  case class Pour(from:Int, to: Int) extends Move

  val allGlasses = 0 until capacity.length
  
  val moves = 
    (for (everyItem <- allGlasses) yield Empty(everyItem)) ++ //concatenate all the moves
    (for(everyItem<- allGlasses) yield Fill(everyItem)) ++
    (for(from<- allGlasses; to <-allGlasses if from!=to) yield Pour(from, to))
}