def main(args:Array[String]):Unit={
    val deposit = 19902039
    println(calc(deposit))
}

val calc = (deposit:Int) => deposit*(if (interest(deposit) != -1.00) interest(deposit) else 0)

val interest = (deposit:Int) => deposit match{
    case x if x>0 && x<20000 => 0.02
    case x if x>=20000 && x<200000 => 0.04
    case x if x>=200000 && x<2000000 => 0.035
    case x if x>=2000000 => 0.065
    case _ => -1.00
}