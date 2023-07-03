import scala.io.StdIn

def main(args: Array[String]):Unit={
    val number=StdIn.readInt()
    println(patternMatching(number))
}

def patternMatching(number:Int):String = number match{
    case x if x<0 => return "Negative"
    case 0 => return "Zero"
    case x if x>0 && x%2==0 => return "Even"
    case x if x>0 && x%2==1 => return "Odd"
}