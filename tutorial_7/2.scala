def calculateSquare ( li: List[Int]): List[Int]={
  val sqe = li.map((x:Int) => x*x)
}
def main(args:Array[String]): Unit ={
  val num = List(1,2,3,4,5,6,7,8,9)
  println(calculateSquare(num))
}
