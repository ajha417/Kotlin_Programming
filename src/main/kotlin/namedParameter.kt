fun main(args: Array<String>) {
    //no matter in what sequence we pass the argument it will fetch the result
    //this is named parameter
    findVolumeof(height = 5, length = 20, breadth = 10)
}

fun findVolumeof(length:Int,breadth:Int,height:Int=10){
    println("The length is: "+length);
    println("The breadth is: "+breadth);
    println("The height is: "+height);
}