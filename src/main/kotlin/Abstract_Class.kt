fun main(args: Array<String>) {

//    we cannot create an object of Person1 class though we can have reference of it
//    val per = Person1() error
    val per = Indian()
    per.str = "Ritesh"
    println("The string is ${per.str}")
    per.eats()
    per.abstracttest()
    per.runs()
}

abstract class Person1{ //all abstract class are open by default
    abstract val str:String
    abstract fun abstracttest()
    open fun eats(){}
    open fun runs(){}
}

class Indian:Person1(){

//    here we need to compulsority implement the abstract methods and data variable
    override var str:String = "Amit"
    override fun abstracttest() {
        println("This is the abstract method implemented in child class")
    }

    override fun eats() {
        println("Indians eats")
    }

    override fun runs() {
        println("Indian runs very fast")
    }
}