class Rational(val n:Int, val d:Int){
    require(d != 0, "The denominator  musy be non zero")
    val numerator = n
    val denominator = d

    def sub(number:Rational):Rational = new Rational(numerator*number.denominator-number.numerator*denominator, denominator*number.denominator)
}

def main(args: Array[String]):Unit={
    val numberList:List[Rational] = List(new Rational(3, 4), new Rational(5, 8), new Rational(2, 7))
    val result = numberList.reduce((i, j)=>i.sub(j))
    println("Numerator: "+result.numerator+"   Denominator: "+result.denominator)
}