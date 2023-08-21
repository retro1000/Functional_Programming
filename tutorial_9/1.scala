class Rational(var n:Int, var d:Int){
    var numerator = n
    var denominator = d

    def neg():Unit = numerator=numerator * -1
}

def main(args: Array[String]):Unit={
    var r = new Rational(3, 7)
    r.neg()
    println("Numerator: "+r.numerator+"   Denominator: "+r.denominator)
}