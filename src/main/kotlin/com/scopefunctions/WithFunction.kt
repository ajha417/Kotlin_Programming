package com.scopefunctions

class Person{

    var name:String = "Amit Kumar Jha"
    var age:Int = 23


}

fun main(args: Array<String>) {

/*
    Scope Function: with
    property 1: refer to the current object by using keyword this
    property 2: return value is lambda result
* */

    var person = Person()

//    this is normal way
    /*println(person.name)
    println(person.age)*/

// property 1
    with(person){
        println(name)
        println(age)

    }

//    property 2
    var bio:String = with(person){
        println(name)
        println(age)
        "$name is going to join asite solutions. He is going to be shorlisted in asite solutions this week"
    }
    println(bio)


}
