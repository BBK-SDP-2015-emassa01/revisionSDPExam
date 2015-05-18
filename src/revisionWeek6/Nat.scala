package revisionWeek6

//peano numbers
abstract class Nat {

  def isZero:Boolean
  def predecessor:Nat
  def successor:Nat
  def + (that:Nat):Nat
  def - (that:Nat): Nat
  
  object Zero extends Nat {
    
    def isZero = true
    def predecessor = throw new NoSuchElementException("hit zero predecessor.")
    def successor = new Succ(this) //same for both, can refactor to base class!
    def + (that:Nat) = new Succ(that)
    def - (that:Nat) = if (that.isZero) this else throw new NoSuchElementException("cant minus from zero.")
    
    def assertAllPos[S <: Nat](r:S):Boolean = {
         (r.isZero) 
      }
    
    
    
  }
  
  class Succ (n:Nat) extends Nat{
    
    def isZero = false
    def predecessor = n
    def successor = new Succ(this) //same for both, can refactor to base class!
    def + (that:Nat) = new Succ(that + n)
    def - (that:Nat) = if (that.isZero) this else n - that.predecessor //else throw new NoSuchElementException("reached zero.")
  }
  
  
  
}