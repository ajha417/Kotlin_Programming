fun findVolume(length:Int,breadth:Int,height:Int = 10):Int{
    //if no any parameter is passed then default value of height will be taken as 10
    return length * breadth * height;
}
fun main(args: Array<String>) {
    var result = findVolume(2,4);
    println("The volume is $result")


//    if we pass all three values then
    var volume = findVolume(5,10,20);
    println("The new volume is $volume")
}