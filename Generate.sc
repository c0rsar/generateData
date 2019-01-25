import $file.MyScript
import java.time.LocalDate


def dt(n:Int):LocalDate =  LocalDate.parse("2010-01-01").plusDays(n)


def ff(n:Int):String = {
  val cord = MyScript.c()
  val temp = 0.002 * n + 20 + 15 * MyScript.t(n, cord._2.toInt)
  s"${dt(n)},${round(cord._1)},${round(cord._2)},${round(temp)}"
}

def data = (1 to 500).map(_=>(1 to 365*5).map(n=>ff(n))).flatten.sorted
