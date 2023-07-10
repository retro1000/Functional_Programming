def evenOrOdd(n:Int):List[(String, Int)]=if(n!=1) evenOrOdd(n-1):+(if(n%2==0) "Even" else "Odd", n) else List(("Odd", 1))

def main(args: Array[String]):Unit={
    println(evenOrOdd(4));
}