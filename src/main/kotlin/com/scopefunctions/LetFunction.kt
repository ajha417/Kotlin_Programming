package com.scopefunctions

import java.util.*

fun main() {

//    Scope function : let
//    property1 : refer to current object by using it identifier
//    property2 : return value is lambda result

//    Use let function to avoid null pointer exception

    var name:String? = "hello"

//    this will throw nullPointer exception
   /* println(name!!.reversed())
    println(name.capitalize())
    println(name.length)*/

//    to avoid it
    var stringLength = name?.let {
        println(it.length)
        println(it.reversed())
        println(it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
        it.length
    }

    println(stringLength)

}
