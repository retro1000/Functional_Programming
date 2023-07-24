def main(args:Array[String]):Unit={
    println(cipher("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", -3, encryption, checkLetterCaseEn))
    println(cipher("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", -3, decryption, checkLetterCaseDe))
}

val encryption = (message:String, shift:Int, findCase:(Char, Int) => Int) => message.map((letter) => ((if(findCase(letter, shift) != 0) (letter.toInt - findCase(letter, shift) + shift)%26 else letter.toInt) + findCase(letter, shift)).toChar).mkString

val decryption = (message:String, shift:Int, findCase:(Char, Int) => Int) => message.map((letter) => ((if(findCase(letter, shift) != 0) (letter.toInt - findCase(letter, shift) - shift)%26 else letter.toInt) + findCase(letter, shift)).toChar).mkString

val checkLetterCaseEn = (letter:Char, shift:Int) => if(letter.isLower) (if(shift>0) 97 else 122) else if(letter.isUpper) (if(shift>0) 65 else 90) else 0

val checkLetterCaseDe = (letter:Char, shift:Int) => if(letter.isLower) (if(shift<0) 97 else 122) else if(letter.isUpper) (if(shift<0) 65 else 90) else 0

def cipher(message:String, shift:Int, method:(String, Int, (Char, Int) => Int) => String, findCase:(Char, Int) => Int):String = method(message, shift, findCase)