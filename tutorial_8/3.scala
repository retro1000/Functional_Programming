def main(args: Array[String]):Unit={
    println(formatNames("Benny", toUpper))
    println(formatNames("Ni", toUpper)+"roshan")
    println(formatNames("Saman", toLower))
    println("Kumar"+formatNames("a", toUpper)) 
}

val toUpper = (name:String) => name.map((letter)=>if letter<='z' && letter>='a' then (letter-32).toChar else letter.toChar)

val toLower = (name:String) => name.map((letter)=>if letter<='Z' && letter>='A' then (letter+32).toChar else letter.toChar)

val formatNames = (name:String, formatMethod:(String)=>String) => formatMethod(name)