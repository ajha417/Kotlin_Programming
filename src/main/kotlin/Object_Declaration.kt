fun main(args: Array<String>) {

//    no we cannot create an object
//    we can access data members with the help of dot
    CustomerData.count = 45
    println(CustomerData.typeOfCustomer())
    CustomerData.superClassMethod("Hello boy")
}

open class MyClass{
    open fun superClassMethod(str:String){
        println("This is super class")
    }
}
//kotlin doesn't support static methods and variables
// but we have alternate for that
// we can use object keyword instead of class and its data members will behave like static


object CustomerData:MyClass(){
    var count:Int = -1              //  Behave like   STATIC variable
    fun typeOfCustomer():String{        //      Behaves like STATIC method
        return "VIP Customer"
    }

    override fun superClassMethod(str: String){     // Currently, behaves like STATIC method
        super.superClassMethod(str)
        println("Object customerData:"+str)
    }
}