package com.scopefunctions

class Person2{
    var name:String = ""
    var age:Int = 0
}
fun main(args: Array<String>) {

//    apply function return context object
//    current object is referred by using this keyword

    var person = Person2().apply {
        name = "Amit Jha"
        age = 23
    }

//    to print value
    with(person){
        println(name)
        println(age)
    }


//    perform some operation on Person2

    person.also {
        it.name = "Smart Programmer"
        println("New name is ${it.name}")
    }
}
