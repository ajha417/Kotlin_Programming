fun main(args: Array<String>) {
    var car = Cars()
    car.no_of_wheels = 4
//    car.model = "Mercedez Benz"
    car.runs()
    car.speed = 120
    car.drift()
    println("The no of wheels in car is ${car.no_of_wheels}")
    println("The model of car is ${car.model}")
}

open class Vehicle{
    var no_of_wheels:Int = -1
    open var model:String = "default model"


    open fun runs(){
        println("Vehicle runs")
    }
}

class Cars:Vehicle(){
    var speed:Int = -1
    override var model:String = "new model"
//    by default all methods are public final
//    now to override we need to use open keyword in parent class and override keyword in child class
    fun drift(){
        println("car drifts")
    }

    override fun runs() {
        super.runs()
        println("Car runs very fast")
    }
}

class Autos:Vehicle(){
    var mileage:Int = -1
    fun carriesPassenger(){
        println("Auto carries passenger")
    }
}