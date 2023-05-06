fun main(args: Array<String>) {

    val str1:String = "Hello "
    val str2:String = "Everyone "
    val str3:String = "How are you?"

    println(str1.add(str2 ,str3))


//    example to find greater number
    val x:Int = 5
    val y:Int = 10

    val greaterNumber = x.greater(y)
    println("The greater number is: "+greaterNumber)
}

// Here String is inbuilt class but kotlin provides a way to modify it and add new function to this class
// so this is example of extension function
fun String.add(str1:String,str2:String):String{
    return this + str1 + str2
}

fun Int.greater(other:Int):Int{
    if(this > other) return this
    else return other
}
