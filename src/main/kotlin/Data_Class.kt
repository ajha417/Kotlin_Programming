fun main(args: Array<String>) {

    var u1 = User("Amit",23)
    var u2 = User("Amit",23)
    if(u1==u2) println("equal")
    else println("not equal")

//    data class helps to compare the value only
}
data class User(var name:String,var age:Int){

}