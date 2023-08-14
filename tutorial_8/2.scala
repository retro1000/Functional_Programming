def main(args:Array[String]):Unit={
    println(patternMatch(-1))
}

val patternMatch = (x:Int) => x match{
    case y if y<=0 => "Negative/Zero"
    case y if y%2==0 => "Even"
    case _ => "Odd"
}