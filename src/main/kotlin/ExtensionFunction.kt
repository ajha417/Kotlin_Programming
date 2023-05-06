fun main(args: Array<String>) {

    var str1:String = "Hello "
    var str2:String = "Everyone "
    var str3:String = "How are you?"

    println(str1.add(str2 ,str3))
}

// Here String is inbuilt class but kotlin provides a way to modify it and add new function to this class
// so this is example of extension function
fun String.add(str1:String,str2:String):String{
    return this + str1 + str2
}
