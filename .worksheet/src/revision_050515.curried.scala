package revision_050515

object curried {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  println("Welcome to the Scala worksheet");$skip(65); 

  // curry

  def line(a: Int, b: Int, x: Int): Int = a * x + b;System.out.println("""line: (a: Int, b: Int, x: Int)Int""");$skip(121); 

  //def curriedLine(a: Int)(b: Int)(x: Int): Int = line(a, b, x)

  def defaultLine(x: Int): Int = curriedLine(1)(0)(x);System.out.println("""defaultLine: (x: Int)Int""");$skip(38); 

  def curriedLine = (line _).curried;System.out.println("""curriedLine: => Int => (Int => (Int => Int))""");$skip(181); 
  

  //defaultLine(5) // returns `5`

  // partial - essentially the same but freezes the value and works with multiple args

  def partialLine = (b: Int, x: Int) => line(2, b, x);System.out.println("""partialLine: => (Int, Int) => Int""");$skip(21); val res$0 = 

  partialLine(0, 1);System.out.println("""res0: Int = """ + $show(res$0))}

  // def partialLine = line(2, _: Int, _: Int)

}
