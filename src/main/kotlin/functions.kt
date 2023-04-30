fun main(args:Array<String>) {
    var personName = "Amit Kumar Jha";
    var personObj = Person();
    personObj.display(personName)
}
class Person{
    fun display(name:String){
        print(name)
    }
}