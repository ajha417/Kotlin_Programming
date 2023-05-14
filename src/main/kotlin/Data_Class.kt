fun main(args: Array<String>) {

    var u1 = User("Amit",23)
    var u2 = User("Amit",23)

    println(u1.toString())
    if(u1==u2) println("equal")
    else println("not equal")

    var newUser = u1.copy()
    println(newUser)

    var newUser1 = u1.copy(age=15,name="Rakesh")
    println(newUser1)

//    data class helps to compare the value only
}
data class User(var name:String,var age:Int){

}