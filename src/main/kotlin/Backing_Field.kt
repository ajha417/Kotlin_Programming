fun main(args: Array<String>) {
    var obj = Backing_Field()
    obj.back_field = 50
    obj.back_field
}
class Backing_Field {
//    kotlin internally call get and set method
    var back_field:Int = 20
    get() {
//        println("The value of back field is $back_field") throws stackoverflow exception
        println("The value of backing field is $field") //field keyword stores the value of back_field property
        return field
    }
    set(value) {
        if(value >= 0){
            field = value  //it assigns value to back_field property
//            back_field = value // throws exception
        }
    }

}