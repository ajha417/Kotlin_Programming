fun main(args: Array<String>) {

    var dog = Dog()
    dog.color = "black"
    dog.breed = "labra"
    println("The color of dog is ${dog.color}")
    println("The breed of dog is ${dog.breed}")
    dog.eats()
    dog.bark()

    var cat = Cat()
    cat.color = "grey"
    cat.age = 4
    println("The color of cat is ${cat.color}")
    println("The age of cat is ${cat.age}")
    cat.meow()
    cat.eats()
}

// by default all classes are public and final
// and cannot be inherited directly

// so we need use open keyword before class to make it eligible for inherited

open class Animal{
    var color:String = ""

    fun eats(){
        println("eats")
    }
}
class Dog:Animal(){
    var breed:String = ""

    fun bark(){
        println("Dog barks")
    }
}

class Cat:Animal(){
    var age:Int = -1

    fun meow(){
        println("cat meows")
    }
}