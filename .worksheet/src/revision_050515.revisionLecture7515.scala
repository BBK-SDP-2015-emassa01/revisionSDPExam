package revision_050515

object revisionLecture7515 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); val res$0 = 

((x:Int) => x*x) (3);System.out.println("""res0: Int = """ + $show(res$0));$skip(29); 

//OR
val y = (x:Int) => x*x;System.out.println("""y  : Int => Int = """ + $show(y ));$skip(5); val res$1 = 
y(3);System.out.println("""res1: Int = """ + $show(res$1));$skip(37); 

def add(x:Int)(y:Int):Int = {
x+y
};System.out.println("""add: (x: Int)(y: Int)Int""");$skip(20); 

val add3 = add(3)_;System.out.println("""add3  : Int => Int = """ + $show(add3 ));$skip(9); val res$2 = 

add3(5);System.out.println("""res2: Int = """ + $show(res$2))}


}
