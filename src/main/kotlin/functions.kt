fun main(args:Array<String>) {
    var personName = "Amit Kumar Jha";
    var personObj = Person();
    personObj.personName = "Amit"
//    personObj.display(personName)
    println("The name of the person is ${personObj.personName}");
    //this is called string interpolation. user $ sign and curly braces


}
class Person{
    var personName:String = ""
    fun display(name:String){
        print(name)
    }
}