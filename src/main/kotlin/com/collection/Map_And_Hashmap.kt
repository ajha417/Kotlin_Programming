package com.collection

fun main(args: Array<String>) {

    var leaders = mapOf<Int,String>(12 to "Nitish Kumar", 14 to "Modi", 96 to "Vajpayee")
//    this map is immutable, fixed size and read only
    for(key in leaders.keys){
        println(leaders.get(key))
    }

    var cars = HashMap<Int,String>() //this is mutable, read and write both, no fixed size

//    besides these are also two mutable hashmap
    /*var cars1 = mutableMapOf<Int,String>()
    var cars2 = hashMapOf<Int,String>()
*/
    cars.put(1,"Mercedez")
    cars.put(2,"Kia")
    cars.put(3,"scorpio")

    for(car in cars.keys){
        println("car at $car is ${cars.get(car)}")
    }
}