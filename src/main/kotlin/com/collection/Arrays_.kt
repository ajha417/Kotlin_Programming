package com.collection

fun main(args: Array<String>) {

    var myArray = Array<Int>(5){0}
//    here array of size 5 will be created
//    all the elements are initialized with 0 as 0 is passed as lambda

    myArray[0] = 23
    myArray[4] = 56
    myArray[3] = 98
//    to iterate through myArray
    println("Using for loop")
    for(index in 0..myArray.size-1){
        println(myArray[index])
    }

    println("Using enhanced for loop")
    for(element in myArray){
        println(element)
    }
}