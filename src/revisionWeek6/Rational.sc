package revisionWeek6

object Rational {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = new Rational (1,3)                      //> x  : revisionWeek6.Rational = 1/3
  
  val y = new Rational(5,7)                       //> y  : revisionWeek6.Rational = 5/7
 
 	val z = new Rational(3,2)                 //> z  : revisionWeek6.Rational = 3/2
  
  val test = new Rational(1,6)                    //> test  : revisionWeek6.Rational = 1/6
  x.sub(test)                                     //> res0: revisionWeek6.Rational = 3/18
  
  x + y                                           //> res1: revisionWeek6.Rational = 22/21
  
  x.sub(y).sub(z)                                 //> res2: revisionWeek6.Rational = -79/42
  
}

class Rational (x: Int, y:Int){
val numer = x
val denom = y



	def + (that: Rational):Rational = {
	new Rational(
	numer*that.denom + denom*that.numer,
	denom * that.denom)
	
	}
	
	def neg :Rational={
	new Rational(
	(numer * -1),
	denom)
	
	}
	
	def sub(that:Rational) :Rational={
	new Rational(
	((numer*that.denom) - (denom*that.numer)),
	denom * that.denom)
	
	}
	
	override def toString() = {
	numer + "/" + denom
	}
	
	
}