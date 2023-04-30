fun main(args:Array<String>) {
    var r1 = 1..5
//    this will contain value like 1,2,3,4,5

    var r2 = 10 downTo 1
    //this will contain value from 10,9,8,7,6,5 upto 1

    var r3 = 10 downTo 5 step 2
    //this will contain value 10,8,6

    var r4 = "a".."z"


//    these are the ways to declare range variables

//    to check if any particular value is present in range or not
    var isCPresent = "c" in r4
    println(isCPresent)

}

