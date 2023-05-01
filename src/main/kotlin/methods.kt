fun main(args: Array<String>) {
    var a:Int = 10
    var b:Int = 5
    var sum:Int = add(a,b)
    diff()
    mul(a,b)
    println("The sum of $a and $b is $sum")
}

fun add(a:Int,b:Int):Int{
    return  a+b
}

fun diff(){
    var a = 5
    var b = 2
    println("The difference is ${a-b}")
}
fun mul(a:Int,b:Int){
    println("The product of $a and $b is ${a*b}")
}