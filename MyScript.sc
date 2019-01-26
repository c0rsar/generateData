def t(y:Int,d:Int):Double = {
  import Math._
  def i2r(i:Int):Double = i/360.0*2*Math.PI
  -1 * sin(i2r(y)) * cos((d/365.0*360).toInt)
}

def c():(Double,Double) = {
  import scala.util.Random
  (Random.nextDouble * 180 - 90, Random.nextDouble * 360 - 180)
}

import java.time.LocalDate

def dt(n:Int):LocalDate =  LocalDate.parse("2010-01-01").plusDays(n)

def round(d:Double):Double = Math.round(d * 100)/100.0 

def ff(n:Int):String = {
  val cord = c()
  val temp = 0.002 * n + 10 + 20 * t(n, cord._1.toInt)
  s"${dt(n)},${round(cord._1)},${round(cord._2)},${round(temp)}"
}

def data = (1 to 500).map(_=>(1 to 365*5).map(n=>ff(n))).flatten.sorted

val wr = new java.io.PrintWriter("data2")
data.foreach(ln=>wr.println(ln))
wr.close

