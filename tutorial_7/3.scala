def filterPrime(numbers: List[Int]): List[Int] = {
  numbers.filter(n => (2 until n).forall(i => n % i != 0) && n > 1)
}

def main(args: Array[String]): Unit = {
  val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(filterPrime(input))
}
