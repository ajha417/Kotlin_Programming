fun main(args: Array<String>) {
    var student = Students("Amit")
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
    init {
        println("The name of the student is $name")
    }
}