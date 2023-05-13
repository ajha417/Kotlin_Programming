fun main(args: Array<String>) {
    var dog = Dogs("Black","Labra")

}

/*
open class Animals(var color:String){

    init {
        println("Animal Init $color")
    }
}

class Dogs(color:String,var breed:String):Animals(color){

    init {
        println("Dogs init $color and $breed")
    }
}

*/


// now implementing with the help of secondary constructor

open class Animals{
    var color:String = ""
    constructor(color:String){
        this.color = color
        println("From Animals constructor: $color")
    }
}

class Dogs:Animals{
    var breed:String = ""
    constructor(color:String,breed:String):super(color){
        this.breed = breed
        println("From Dogs constructor: $color and $breed")
    }
}