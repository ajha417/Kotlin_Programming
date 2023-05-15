fun main(args: Array<String>) {

    var name:String? = "Amit kumar jha"
    var name2:String? = null
//    1. safe call (?.)
//    Returns the length if string is not null otherwise it returns null
//    Use it if you don't mind getting null value

//    println("The length of name is ${name?.length}")

//    2. safe call with let (?.let)
//    it executes only if name is not null
    name2?.let { println("The length of name is ${name2.length}") }

//    3. Elvis-operator( ?: )
//    When we have nullable reference 'name', we can say "is name not null", use it,
//    otherwise use some non-null value
    /*val len = if(name !=null)
                    name.length
                else
                    -1*/
//    we can use elvis-operator which can be executed in single line
    var len = name?.length?:-1
    println(len)

//    4. non-null assertion operator ( !! )
//    Use it when you are sure the value is not null
//    throws NullPointerException if value is found to be null

    println("The length of name is ${name!!.length}")

}
