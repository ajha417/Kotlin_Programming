import kotlin.concurrent.thread

fun main() {
    println("Main program starts:${Thread.currentThread().name}")

//    println("Main program priority:${Thread.currentThread().priority}")

    thread { // creating dummy thread (worker thread or background thread)
        println("fake thread starts: ${Thread.currentThread().name}")
        println("background thread priority: ${Thread.currentThread().priority}")
        Thread.sleep(1000) // pretending to be some work like file upload or any
        println("Fake thread finishes: ${Thread.currentThread().name}")
    }

//    GlobalScope.launch { //creates background coroutine that runs on background thread
//        println("Fake work starts: ${Thread.currentThread().name}")
////        println("priority:${Thread.currentThread().priority}")
////        Thread.sleep(1000)
//        delay(1000)  // it suspends the current coroutine but thread is free
//        println("Fake work ends: ${Thread.currentThread().name}") // Either T1 or some other thread
//    }
    Thread.sleep(2000)


//    runBlocking {//creates coroutine that blocks the current thread
//        delay(2000) //wait coroutine to finish its task (practically not possible)
//    }
    println("Main program ends: ${Thread.currentThread().name}")
}