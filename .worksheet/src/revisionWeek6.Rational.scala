package revisionWeek6

object Rational {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  println("Welcome to the Scala worksheet");$skip(29); 
  val x = new Rational (1,3);System.out.println("""x  : revisionWeek6.Rational = """ + $show(x ));$skip(31); 
  
  val y = new Rational(5,7);System.out.println("""y  : revisionWeek6.Rational = """ + $show(y ));$skip(30); 
 
 	val z = new Rational(3,2);System.out.println("""z  : revisionWeek6.Rational = """ + $show(z ));$skip(34); 
  
  val test = new Rational(1,6);System.out.println("""test  : revisionWeek6.Rational = """ + $show(test ));$skip(14); val res$0 = 
  x.sub(test);System.out.println("""res0: revisionWeek6.Rational = """ + $show(res$0));$skip(11); val res$1 = 
  
  x + y;System.out.println("""res1: revisionWeek6.Rational = """ + $show(res$1));$skip(21); val res$2 = 
  
  x.sub(y).sub(z);System.out.println("""res2: revisionWeek6.Rational = """ + $show(res$2))}
  
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
