fun main(args: Array<String>) {
    var student = Students("Amit",10)
    println(student.age)
    println(student.name)
}

/*
class Students(name:String){
    var name:String = "dummy"
    init {
        this.name = name
        println("The name of the student is $name")
    }

}*/


// Instead of doing it in two steps we can do it in 1 step

class Students(var name:String){
    var age:Int = -1
    init {
        println("The name of the student is $name")
    }

//    kotlin has feature of secondary constructor which we can have the number of parameters we want

//    to have secondary constructor we must have to provide this
//    secondary constructor can be called only after init block
    constructor(name:String,age:Int):this(name){
        this.age = age
    }
}