package com.example

class Student(var studentName:String,var address:String) {
    fun showInfo(){
        println("The student name is ${studentName}")
        println("${studentName} lives in ${address}")
    }
}