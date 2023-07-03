def main(args: Array[String]):Unit={
    println(formatNames("Benny", toUpper))
    println(formatNames("Ni", toUpper)+"roshan")
    println(formatNames("Saman", toLower))
    println("Kumar"+formatNames("a", toUpper))
}

def toUpper(name:String):String={return name.map((letter)=>if letter<='z' && letter>='a' then (letter-32).toChar else letter.toChar)}

def toLower(name:String):String={return name.map((letter)=>if letter<='Z' && letter>='A' then (letter+32).toChar else letter.toChar)}

def formatNames(name:String, formatMethod:(String)=>String):String={return formatMethod(name)}