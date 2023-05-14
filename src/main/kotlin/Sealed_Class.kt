sealed class Shape{
    class Circle(var radius:Float):Shape()
    class Square(var length:Int):Shape()
    class Rectangle(var length: Int,var breadth:Int):Shape()


//    we can define object, data class, sealed class and sealed interface inside sealed class

//    object NotAShape:Shape()
//    sealed class AnotherSealed:Shape()
//    sealed interface Draw
}

/*
*
* we can put these classes outside also
*   class Circle(var radius:Float):Shape()
    class Square(var length:Int):Shape()
    class Rectangle(var length: Int,var breadth:Int):Shape()
* */
fun main(args: Array<String>) {

    var circle = Shape.Circle(4.2f)
    var square = Shape.Square(4)
    var rectangle = Shape.Rectangle(14,12)
    checkShape(circle)
    checkShape(square)
    checkShape(rectangle)
}
fun checkShape(shape:Shape){
    when(shape){
        is Shape.Circle -> println("Circle area is ${3.14 * shape.radius * shape.radius}")
        is Shape.Square -> println("Square area is ${shape.length * shape.length}")
        is Shape.Rectangle -> println("Rectangle area is ${shape.length * shape.breadth}")
    }
}