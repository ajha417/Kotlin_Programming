fun main(args: Array<String>) {
    var myNumbers:List<Int> = listOf<Int>(2,4,23,90)

//    filter method filters the collection according to desired result
    val smallNumbers = myNumbers.filter { it < 10 } // OR v-> v< 10
    for(value in smallNumbers){
        println(value)
    }
    println()

//    map helps to find the desired output
    val squaredNumbers = myNumbers.map { it * it } // other way is i-> i*i
    for(nums in squaredNumbers){
        println(nums)
    }
    var people = listOf<Filter_and_map>(Filter_and_map("Amit",30),Filter_and_map("Andrew",23),Filter_and_map("rains",23))


    var names = people.filter { it.name.startsWith("A") }.map { it.name }

    for(name in names){
        println(name)
    }
}

class Filter_and_map(var name:String,var age:Int) {
//    some other code here
}