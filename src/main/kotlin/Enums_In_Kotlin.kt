enum class CreditCardType{
    SILVER,     //ordinal = 0   name = "SILVER"
    GOLD,       //ordinal = 1   name = "GOLD"
    PLATINUM    //ordinal = 2   name = "PLATINUM"
}
fun main(args: Array<String>) {

//    enum constants are objects of enum class type
    var value:CreditCardType = CreditCardType.GOLD

//    enum has two properties : ordinal and name
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD)

//    enum has two methods - values() and valueOf()
    var allValues:Array<CreditCardType> = CreditCardType.values()
    allValues.forEach { println(it) }
}