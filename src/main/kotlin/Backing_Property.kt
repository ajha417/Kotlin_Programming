fun main(args: Array<String>) {
    var age:Int  = 10
    val student = Backing_Property()
    student.addHobbies("Cricket")

//    without using backing property
//    accidental deletion of data: we don't want this
//    student.hobbies.remove("Cricket")

//    while using backing property the above code won't compile

}
class Backing_Property {
    /*private var _age:Int = 0 //backing fields holds actual 'age' property
    public var age:Int  // var age is known as backing property exposed to outside world
            get(){
                return _age
            }
            set(value) {
                _age = value
            }*/

//    while using backing property
    private val _hobbies = mutableListOf<String>() //backing field
    public val hobbies:List<String>  //backing property: immutable
                    get() = _hobbies

    fun addHobbies(hobbyName:String){
        _hobbies.add(hobbyName)
    }

//    without using backing property
//    val hobbies  = mutableListOf<String>()
//    fun addHobbies(hobbyName:String){
//        hobbies.add(hobbyName)
//    }
}