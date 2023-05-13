import java.math.BigInteger

fun main(args: Array<String>) {
    println(findFibonacci(6, BigInteger("1"),BigInteger("0")))
}

//tailrec functions are used to perform recursion without affecting the stack memory
// it saves our program to be crashed if stack memory is overflow
tailrec fun findFibonacci(n:Int,a:BigInteger,b:BigInteger):BigInteger{
    if(n==0) return b
    else
        return findFibonacci(n-1,a+b,a)
}