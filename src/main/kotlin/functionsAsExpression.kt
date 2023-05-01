fun main(args: Array<String>) {

    var largeValue:Int = max(4,6);
    println("The largest value is $largeValue")
}

//  traditional approach
/*fun max(a:Int,b:Int):Int{
    if(a > b){
        return a
    }
    else{
        return b
    }
}*/

// now using function as expression

fun max(a:Int,b:Int):Int = if(a > b) a else b  //just in single line we can return value based on if-else condition