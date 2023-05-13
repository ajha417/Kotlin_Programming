fun main(args: Array<String>) {
    val x:Int = 45
    val y:Int = 67
//    val greaterNum:Int = x.greaterValue(y) this can be achieved with the help of extension function also

//    now with the help of infix function
    val greaterNum:Int = x greaterValue y
    println(greaterNum)
}

infix fun Int.greaterValue(a:Int):Int{
    if(this > a) return this;
    else return a;
}

//all infix functions are extension function
// but all extension function are not infix function

//infix function can only have one parameter