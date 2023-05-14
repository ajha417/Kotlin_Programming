fun main(args: Array<String>) {

    var program = ProgramIt()
//    program.reverseIt("Hello",{s->s.reversed()})
//    we can use it keyword if we have one parameter
    program.reverseIt("Hello",{it.reversed()})
}
class ProgramIt{
    fun reverseIt(str:String,myFunct:(String)->String){
        var result = myFunct(str)  // this line will be evaluated as str.reversed() ====> "Hello".reversed() = "olleH"
//        now the above line be evaluated as it.reversed() ===> str.reversed() ====> "Hello".reversed() = "olleH"
        println(result)
    }
}