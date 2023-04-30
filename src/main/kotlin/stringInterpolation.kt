fun main(arsg:Array<String>) {
    var name = "Amit"
    println("The name of the student is "+name) //this is traditional way
    println("The name of the student is ${name}") //this is new way and it is called string interpolation
    var carObj1 = Car()
    var carObj2 = Car()
    carObj1.speed_of_car1 = 40
    carObj2.speed_of_car2 = 120
    println("the speed of car 1 is ${carObj1.speed_of_car1} and the speed of car 2 is ${carObj2.speed_of_car2}")
    println("The relative speed will be ${carObj1.speed_of_car1 + carObj2.speed_of_car2} when in opposite direction")
}
class Car{
    var speed_of_car1 = 0
    var speed_of_car2 = 0
}