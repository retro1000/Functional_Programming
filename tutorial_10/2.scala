def main(args: Array[String]):Unit={
    println("Total count of letter occurrences: " + countLetterOccurrences(List("apple", "banana", "cherry", "date")))
}

val countLetterOccurrences = (input:List[String])=>input.map(item=>item.length).reduce((x, y)=>x+y)