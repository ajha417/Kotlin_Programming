fun main(args: Array<String>) {


//    CONTINUE statement
//    this keyword will skip the current iteration and continue with the next iteration

/*    for(i in 1..10){
        if(i==5) continue //the value 5 will not be printed
        println(i)
    }*/

//    using continue statement in labelled for loop
    myLoop@ for(i in 1..5){
        for (j in 1..5){
            if(i%2==0 && j%2==0) continue@myLoop
            println("$i and $j")
        }
    }


}