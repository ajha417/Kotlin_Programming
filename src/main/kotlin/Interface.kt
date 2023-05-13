fun main(args: Array<String>) {

//    we cannot create the object of interface
    var p = New_Printer()
    println("The model name of printer is ${p.model}")
    p.printIt()
    p.shareFiles()
    p.onClick()
}

interface Printer{
//    by default all data members are public and open
//    the methods and data variables are not final
    var model:String
    fun printIt()
    fun shareFiles(){
        println("it is shared")
    }

    fun onClick(){
        println("it is onclick of interface_kt")
    }
}
interface Printer2{
    //    by default all data members are public and open
//    the methods and data variables are not final
    var model:String
    fun printIt()
    fun shareFiles(){
        println("File is shared among many files")
    }
    fun onClick(){
        println("This is from printer2")
    }
}

class New_Printer:Printer,Printer2{
    override var model:String = "New model"
//    now we need to compulsorily implement
    override fun onClick(){
        super<Printer>.onClick()
        super<Printer2>.onClick()
    }


//    now we cannot use common method which need to implement that mathod


    override fun shareFiles() {
        println("This is the way of sharing files")
    }
    override fun printIt() {
        println("Printing document")
    }

}