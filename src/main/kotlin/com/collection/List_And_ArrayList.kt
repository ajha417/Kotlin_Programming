package com.collection

fun main(args: Array<String>) {

//    the given list is immutable list, it has fixed size and data can be read only
    var games = listOf<String>("Cricket","Football","Badminton","Tennis")
//    games[0] = "ajfdk"  this will give error as it is trying to write an element


    var players:ArrayList<String> = ArrayList<String>()
    players.add("Dhoni")
    players.add("Kohli")
    for(player in players){
        println(player)
    }
    println()

    for(e in games){
        println(e)
    }

    println("\n")
    println("Mutable list")
    println()
    var roles = mutableListOf<String>() // it is mutable, no fixed size, can read,write or update data
    roles.add("Android")
    roles.add("Web tech")
    roles.add("Flutter")
    roles.add("Java")
    roles.add("SQL")
    roles.remove("Web tech")
    roles.set(1,"MERN stack")

    for(index in 0..roles.size-1){
        println(roles.get(index))
    }
}
