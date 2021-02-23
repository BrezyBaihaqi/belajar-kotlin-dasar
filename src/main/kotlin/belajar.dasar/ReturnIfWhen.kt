/*
Kotlin mendukung penulisan Return sebelum IF dan When dalam sebuah Function
lalu di dalam blok setelah If dan When kita mengembalikan nilai untuk sebuah Function
Hal ini untuk mempermudah ketika kita ingin mengembalikan nilai dalam If atau When
 */

fun main() {

    // biasanya seperti ini jika kita harus me-Return Fungsin yg memiliki tipe data pengembalian
    fun sayHello(name: String= ""): String {
        if (name == "") {
            return "Hello Bro!"
        } else {
            return "Hello $name"
        }
    }

    println(sayHello())
    println(sayHello("Nisa"))

    // di Kotlin kita bisa menuliskan return sebelum If dan When
    fun sayHi(name: String= ""): String {
        return if (name == "") {
            "Hello Bro!"
        } else {
            "Hello $name"
        }
    }

    println(sayHi())
    println(sayHi("Nisa"))

    fun sayWhen(name: String= ""): String {
        return when (name) {
            "" -> "Hello Bro!"
            else -> "Hello $name"
        }
    }

    println(sayWhen())
    println(sayWhen("Nisa"))

}

