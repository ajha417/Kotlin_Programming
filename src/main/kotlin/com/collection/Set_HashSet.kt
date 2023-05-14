package com.collection

fun main(args: Array<String>) {

    //set contains only unique elements
//    hashset also unique elements but the sequence is not guaranteed here
    var rollSet = setOf<Int>(5,1,9,18,9,10,11,11) // this is immutable and read only
    for (value in rollSet){
        println(value)
    }

//    to create set which is mutable
    var students = mutableSetOf<String>()
    students.add("Amit")
    students.add("Andrew")
    students.add("Philips")
    students.add("Xavier")
    students.add("Charles")
    for(value in students){
        println(value)
    }

    var hashS = hashSetOf<Int>()  //the sequence is not guaranteed here
    hashS.add(8)
    hashS.add(2)
    hashS.add(4)
    hashS.add(6)
    hashS.add(10)
    hashS.add(8)

    for(h in hashS){
        println(h)
    }

}
