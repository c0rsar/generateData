def t(y:Int,d:Int):Double = {
  import Math._
  def i2r(i:Int):Double = i/360.0*2*Math.PI
  -1 * sin(i2r(y)) * cos((d/365.0*360).toInt)
}
def c():(Double,Double) = {
  import scala.util.Random
  (Random.nextDouble * 180 - 90, Random.nextDouble * 360 - 180)
}
