fun main(args: Array<String>) {

    val myNumbers = listOf<Int>(2,3,4,5,23,45,10,12,19)

    /*val check1 = myNumbers.all { it > 10 } // it will check for all elements that satisfies given condition
    println(check1)

    val check2 = myNumbers.any({it > 10}) //it will check if any of the elements satisfies the condition
    println(check2)

    val totalCount = myNumbers.count {it > 10}  // it will count total number of elements that satisfies the condition
    println(totalCount)

    val firstNum:Int? = myNumbers.find { it > 10 } // it will return the first element that satisfies the given predicate  or given condition
    println(firstNum)

    */

//    other way

    val myPredicate = {num:Int-> num > 10}
    val check1 = myNumbers.all(myPredicate) // it will check for all elements that satisfies given condition
    println(check1)

    val check2 = myNumbers.any(myPredicate) //it will check if any of the elements satisfies the condition
    println(check2)

    val totalCount = myNumbers.count(myPredicate)  // it will count total number of elements that satisfies the condition
    println(totalCount)

    val firstNum:Int? = myNumbers.find(myPredicate) // it will return the first element that satisfies the given predicate  or given condition
    println(firstNum)
}
