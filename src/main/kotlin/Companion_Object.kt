fun main(args: Array<String>) {

    Companion_Object.count = 45
    var s:String = Companion_Object.typeOf()
    println(s)
}

class Companion_Object{
    companion object{
        var count:Int = -1  //this is actually be converted into static variable


        @JvmStatic
        fun typeOf():String{   // and this will be as static method
            return "This is this type"
        }
    }
}