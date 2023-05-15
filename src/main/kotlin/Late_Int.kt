fun main(args: Array<String>) {

//    lateint keyword is used when we want to declare any value without defining it
    var country = Late_Int()
//    country.setup()
    country.name = "India"
    country.setup()
}
class Late_Int{
//    we must initialize the variable before using
//    lateinit is only used with mutable [ var ] data type
//     lateinit only used with non-nullable data type
//    lateinit variables must be analysed before using it

    lateinit var name:String
    fun setup(){
        println("The length of name is ${name}")
    }
}