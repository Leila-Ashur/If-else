import kotlin.math.max

fun main() {
var large= integers(3,7,9)
    println(large)
    var numbers=integersNumber(-600)
    println(numbers)
    var similar=equality("Leila","Akirachix")
    println(similar)
    var case=upper('L')
    println(case)
    var string= numbInt("Rectangle")
    println(string)
    var tru=boolean(true)
    println(tru)
    var same=palindrome("civic")
    println(same)
    var divide=divisibility(9,3)
    println(divide)
    var char=character('y')
    println(char)
    var odding=odd(13)
       println(odding)
    var start=starting("yellow")
    println(start)

}
//Write a Kotlin function that takes three integers as input and returns the maximum of the three.
fun integers(num1:Int,num2:Int,num3: Int):Int{
    var max =num2
    if (num1>max){
        return num1
    }
    if (num3>max){
        return num3
    }
    return max
}
//Write a Kotlin function that takes an integer as input and returns "Positive"
// if the number is positive, "Negative" if the number is negative, and "Zero" if the number is zero.
fun integersNumber(integer:Int):String{
    if (integer<=0){
        return  "Negative"

    }
    else if (integer>1){
        return "Positive"
    }
    return "Zero"

}
//Write a Kotlin function that takes two strings as input and returns "Equal" if the two strings are
// equal, "Different length" if the two strings have different lengths, and "Different content" if the
// two strings have the same length but different content.
fun equality(name:String,school:String):String{

    if(name==school){
        return "equal"
    }
    if(name.length!=school.length){
        return "Different length"
    }

    else{
        return "different content"
    }

}
//Write a Kotlin function that takes a character as input and returns "Uppercase" if the character is
// an uppercase letter, "Lowercase" if the character is a lowercase letter, and "Other" otherwise.
fun upper(char: Char):String {
    if (char.isUpperCase()) {
        return "uppercase"
    }
    else if (char.isLowerCase()){
        return "lowercase"
    }
    else{
        return "Other "
    }
}
//Write a Kotlin function that takes two integers as input and returns "Equal" if the two integers are
// equal, "Ascending" if the first integer is less than the second, and "Descending" if the first
// integer is greater than the second.
fun numbers(num1:Int,num2: Int):String{
    if(num1==num2) {
        return "equal"
    }
    else if (num1<num2){
        return "Ascending"

    }
    else{
      return  "Descending"
    }
}
//Write a Kotlin function that takes three integers as input and returns "Increasing" if the three
// integers are in increasing order, "Decreasing" if the three integers are in decreasing order,
// and "Neither" otherwise.
fun numb(num1: Int,num2: Int,num3: Int):String{
    if (num2 in (num1 + 1) until num3){
          return "Increasing"
    }
    else if (num2 in (num3 + 1) until num1){
        return "Decreasing"
    }
    else{
        return "Neither"
    }
}
//Write a Kotlin function that takes a string as input and returns "Short" if the string length
// is less than 5, "Medium" if the string length is between 5 and 10, and "Long" if the string
// length is greater than 10.
fun numbInt (shape:String):String{
    if(shape.length<5){
        return "Short"
    }
    else if (shape.length in 6..9){
        return "medium"
    }
    else{
        return "Long"
    }
}
//Write a Kotlin function that takes a Boolean value and returns "Yes" if the value
// is true and "No" if the value is false.
fun boolean(Value:Boolean):String{
    if (Value){
        return "yes"
    }
    else{
        return "NO"
    }
}
//Write a Kotlin function that takes a string as input and returns "Palindrome" if the string is a
// palindrome and "Not palindrome" otherwise.
fun palindrome(word:String):String{
    var reverse= word.reversed()
    if (word==reverse){
        return "palindrome"
    }
    else{
        return "Not palindrome"
    }
}
//Write a Kotlin function that takes two integers as input and returns "Divisible" if the first
// integer is divisible by the second integer and "Not divisible" otherwise.
fun divisibility(one:Int,two:Int):String{
    if (one%two==0){
        return "Divisible"
    }
    else{
        return "Not Divisible"
    }
}
//Write a Kotlin function that takes a character
// as input and returns "Vowel" if the character is a vowel and "Consonant" otherwise.
fun character(char: Char):String{
    var vowels="a,e,i,o,u"
    if (char in vowels){
        return "vowel"
    }
    else{
        return "Consonant"
    }
}



//Write a Kotlin function that takes a string as input and returns "Yes"
// if the string starts with the letter "Y" and "No" otherwise.
fun starting(name: String):String{
    if (name.startsWith('y',true)){
        return "Yes"
        }
    else{
        return "No"
    }
}




//Write a Kotlin function that takes an integer as input and returns "Even"
// if the number is even and "Odd" if the number is odd.
fun odd(number:Int):String{
    if (number%2==0){
        return "Even"
    }
    else{
        return "Odd"
    }
}






