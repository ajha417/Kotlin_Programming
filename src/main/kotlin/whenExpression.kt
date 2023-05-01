fun main(args:Array<String>) {
//    When as Expression
    var x = 5

//    here when can be used same as switch statement in java, c

    when(x){
//        we can also use range operator
        in 5..20 -> println("x lies in between 5 and 20")
        
        0,1 -> println("x is 0 or 1")
//        1 -> println("x is 1")
//        we need not write break keyword
//        default statement can be written by using else keyword
        2-> println("x is 2")
        else -> println("x is unknown")

    }

}