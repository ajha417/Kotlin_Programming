fun main(args:Array<String>) {
    var a:Int = 10
    var b:Int = 20

    var maxValue:Int

/*
    if(a > b){
        maxValue = a
    }
    else{
        maxValue = b
    }

 */

//    here if is used as expression and returns value
    maxValue = if(a>b){
        println("a is grreater")
        a
    }
    else{
        println("b is greater")
        b
    }

    println(maxValue)

}