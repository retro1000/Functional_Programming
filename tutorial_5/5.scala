def additionOfAllEvenNum(n:Int):Int=if(n>1) additionOfAllEvenNum(n-1)+(if((n-1)%2==0) n-1 else 0) else 0 

def main(args: Array[String]):Unit={
    println(additionOfAllEvenNum(2));
}