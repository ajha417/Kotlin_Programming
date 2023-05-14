interface ICardCashBack{
    fun getCashBackValue():Float
}
enum class CreditCardType(var color:String,var limit:Int):ICardCashBack{
    SILVER("grey",50000){
                        override fun getCashBackValue():Float = 0.04f
                        },     //ordinal = 0   name = "SILVER"
    GOLD("golden",10000000){
                           override fun getCashBackValue(): Float = 0.06f
                           },       //ordinal = 1   name = "GOLD"
    PLATINUM("red",20000000){
        override fun getCashBackValue(): Float = 0.16f
    }    //ordinal = 2   name = "PLATINUM"
}
fun main(args: Array<String>) {

//    enum constants are objects of enum class type
    var amitCardType:CreditCardType = CreditCardType.PLATINUM

//    enum has two properties : ordinal and name
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD)

    println(CreditCardType.PLATINUM.getCashBackValue())

//    enum has two methods - values() and valueOf()
    var allValues:Array<CreditCardType> = CreditCardType.values()
    allValues.forEach { println(it) }

//    using in when statement
    when(amitCardType){
        CreditCardType.SILVER -> println("Amit has silver credit card")
        CreditCardType.GOLD -> println("Amit has gold credit card")
        CreditCardType.PLATINUM -> println("Amit has Platinum credit card")
    }
}