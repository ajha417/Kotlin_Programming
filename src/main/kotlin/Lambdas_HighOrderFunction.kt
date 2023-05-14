fun main(args: Array<String>) {

    var p = Program()
    p.addTwoNumbers(45,34)
    p.addTwoNumbers(53,56,object : MyInterface{
        override fun execute(sum: Int) {
            println("The sum of two numbers is $sum")
        }
    })

//    var myLambda:(Int)->Unit = { s:Int -> println(s) }

//    p.addTwoNumbers(32,12,myLambda)

//    p.addTwoNumbers(4,5,{x,y->x+y})


//    other way to call it
    p.addTwoNumbers(3,4){x,y->x+y}
}
class Program{

    fun addTwoNumbers(a:Int,b:Int,action:(Int,Int)->Int){
        var result = action(a,b)
        println(result)
    }
    /*fun addTwoNumbers(a:Int,b:Int,action:(Int)->Unit){  // high level function with lambda as parameter
        val sum = a + b
        action(sum)
    }*/

    fun addTwoNumbers(a:Int,b:Int,action: MyInterface){  //using interface, object-oriented way
        val sum = a + b
        action.execute(sum)
    }
    fun addTwoNumbers(a:Int,b:Int){  //using normal method
        val sum = a + b
        println(sum)
    }
}
interface MyInterface{
    fun execute(sum:Int)
}