import scala.io.StdIn

def main(args: Array[String]):Unit={
    val number=StdIn.readInt()
    println(patternMatch(number))
}

val patternMatch = (x:Int) => x match{
    case y if y<=0 => "Negative/Zero"
    case y if y%2==0 => "Even"
    case _ => "Odd"
}