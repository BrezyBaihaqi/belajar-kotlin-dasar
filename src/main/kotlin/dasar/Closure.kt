/*
Closure adalah kemampuan sebuah Function, Lambda atau Anonymous Function ..
.. berinteraksi dengan data-data disekitarnya dalam scope yg sama.
Closure itu saat function di dalam function main yg bisa di akses di dalam scope ({}) yg sama

Sebisa mungkin hindari penggunaan Closure, karena kalau tidak di buat dengan baik bisa mengubah data lain
 */

fun main() {
    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment ke")
        // disebut lambda karena counter++ otomatis menjadi return
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Function Increment")
        // kalau counter ini bukan lambda karena berada di dalam function
        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()

    // kemampuan Closure menyebabkan semua function di dalam function main di panggil sekaligus dalam 1 println
    println(counter)
}