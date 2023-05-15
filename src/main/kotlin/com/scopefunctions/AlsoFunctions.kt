package com.scopefunctions

fun main(args: Array<String>) {

//    Scope function : also
//    refer to context object by using it identifier
//    the return value is context object

    var numberList:MutableList<Int> = mutableListOf(1,2,3)

    var duplicatenumList = numberList.also {
        println("The list elements are $it")
        it.add(4)
        println("The list elements after adding is $it")
        it.remove(2)
        println("The list elements after removing an element is $it")
    }

    println("Original numbers: $numberList")
    println("Duplicate numbers: $duplicatenumList")

}