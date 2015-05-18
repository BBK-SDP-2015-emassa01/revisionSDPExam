package revision_050515

object revisionLecture7515 {

((x:Int) => x*x) (3)                              //> res0: Int = 9

//OR
val y = (x:Int) => x*x                            //> y  : Int => Int = <function1>
y(3)                                              //> res1: Int = 9

def add(x:Int)(y:Int):Int = {
x+y
}                                                 //> add: (x: Int)(y: Int)Int

val add3 = add(3)_                                //> add3  : Int => Int = <function1>

add3(5)                                           //> res2: Int = 8


}