def main(args: Array[String]):Unit={
    val interestAmount:Double=interest(-1)
    println(if interestAmount == -1.0 then "Wrong amount entered!!!" else interestAmount)
}

def interest(amount:Int):Double=amount match{
    case x if 0<x && x<20000 => return amount*0.02
    case x if 20000<x && x<200000 => return amount*0.035
    case x if 200000<x && x<2000000 => return amount*0.04
    case x if 2000000<x => return amount*0.065
    case _ => return -1.0
}