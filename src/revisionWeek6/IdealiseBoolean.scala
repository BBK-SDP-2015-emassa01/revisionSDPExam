package revisionWeek6

abstract class Boolean1 {
  def ifThenElse[T](t: T, e:T): T

  def &&[T](x: =>Boolean):Boolean = ifThenElse(x,false)
  def ||[T](x: =>Boolean):Boolean = ifThenElse(true, x)
  def unary_! :Boolean = ifThenElse(false, true )


  def ==[T](x: =>Boolean):Boolean = ifThenElse(x, x.unary_!)
  def !=[T](x: =>Boolean):Boolean = ifThenElse(x.unary_!, x)
   
  //assume false<true
  def < [T](x: =>Boolean) :Boolean = ifThenElse(false,x)


}