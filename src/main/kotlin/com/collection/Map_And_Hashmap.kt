package com.collection

fun main(args: Array<String>) {

    var leaders = mapOf<Int,String>(12 to "Nitish Kumar", 14 to "Modi", 96 to "Vajpayee")
//    this map is immutable, fixed size and read only
    for(key in leaders.keys){
        println(leaders.get(key))
    }

}