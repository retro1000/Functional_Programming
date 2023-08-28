def main(args: Array[String]):Unit={
    println(calculateAverage(List(0, 10, 20, 30))+" Fahrenheit")
}

val calculateAverage = (input:List[Int])=>input.map(cel=>(9.0/5.0*cel)+32).reduce((x, y)=>x+y)/input.length