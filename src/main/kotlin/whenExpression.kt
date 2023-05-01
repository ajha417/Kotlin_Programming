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


//    using when as an expression
    var value = 10
    var str:String = when(value){
        1->"value is 1"
        2->"value is 2"
        in 3..10->"value lies in between 3 and 10"
        else ->{
            "value is unknown"
        }
    }
    // here when statement returns value so it is acting as expression here
    println(str)

}