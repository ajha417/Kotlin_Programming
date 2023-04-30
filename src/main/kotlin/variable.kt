fun main(args:Array<String>){

//    to define variable we need to use var keyword followed by variable name
    var myString = "This is the string values passed"
    println(myString)

//    This is the way to define number
    var myNumber = 10
    println(myNumber)

    var myFloat = 10.2
    println(myFloat)

//    way to declare variable and later using it
    var myStrin2:String
    myStrin2 = "Now here we are defining the value of it" //this can be updated later i.e. mutable string
    println(myStrin2)

//    to define string which cannot be updated use val keyword
    val myAnotherString = "This is the constant string and can't be reassigned" //Immutable string
    println(myAnotherString)

}