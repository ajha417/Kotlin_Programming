fun main(args: Array<String>) {
    var dog = Dogs("Black","Labra")
    
}

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

