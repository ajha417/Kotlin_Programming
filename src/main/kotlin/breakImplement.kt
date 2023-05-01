fun main(args: Array<String>) {


//    break statements exits the nearest loop it finds
    for(i in 1..10){
        println("$i")
        if(i==5) //as soon as the value of i becomes 5 the loop is exited using break keyword
            break
    }

//    In kotlin we have the concept of labelled for loop

    myLoop@for(i in 1..3){
        for(j in 1..3){
            println("$i and $j")
            if(i==2 && j==2) break@myLoop //now this will exit the outer loop instead of inner for loop
        }
    }

    

}