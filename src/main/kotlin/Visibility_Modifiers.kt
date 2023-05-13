fun main(args: Array<String>) {

//    we have 4 visibility modifiers
//    public,protected,internal and private
//    by default all members, class and methods are final

    var ind = Indians()
    var testi = TestIt()
    ind.test()
    testi.test()

}
class TestIt{
    fun test(){
        var person = Persons()
//        println(person.a)
        println(person.b)
//        println(person.c)
        println(person.d)

//        person.a and person.c are not visible
//        person.d and person.b are visible
    }
}
open class Persons{
    private val a:Int = 1
    internal val b:Int = 2
    protected val c:Int = 3
    val d:Int = 4 //by default d is public in nature
}

class Indians:Persons(){


    fun test(){
        println(b)
//        println(a)
        println(c)
        println(d)

//        a will not visible here
//        b,c,d are visible
    }
}


