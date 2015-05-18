package revisionWeek6

object lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  var xs = List(1, 2, 3, 4, 5);System.out.println("""xs  : List[Int] = """ + $show(xs ));$skip(32); 
  var ys = List(6, 7, 8, 9, 10);System.out.println("""ys  : List[Int] = """ + $show(ys ));$skip(55); val res$0 = 

  (1 to 5) flatMap (x => (6 to 10) map (y => (x, y)));System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(31); 

  val s = xs map (x => x * x);System.out.println("""s  : List[Int] = """ + $show(s ));$skip(24); 

  val ls = (xs zip ys);System.out.println("""ls  : List[(Int, Int)] = """ + $show(ls ));$skip(119); 

  def producty(list: List[(Int, Int)]): Int = {
    list match {
      case (List(x: Int, y: Int)) => x * y
    }
  };System.out.println("""producty: (list: revisionWeek6.List[(Int, Int)])Int""");$skip(18); val res$1 = 
  
  producty(ls);System.out.println("""res1: <error> = """ + $show(res$1))}

}
