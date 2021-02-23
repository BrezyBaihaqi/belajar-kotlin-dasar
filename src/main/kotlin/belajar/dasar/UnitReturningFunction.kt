package belajar.dasar

/*
Function ada 2 jenis, yang tidak mengembalikan nilai dan yang mengembalikan nilai
Function yang sudah kita buat sebelumnya adalah Function yang tidak mengembalikan nilai
Function yg tidak mengembalikan nilai, Sebenarnya mengembalikan tipe data Unit
di Java namanya Point, kalau di Kotin namanya Unit
Unit adalah tanda bahwa Function tidak mengembalikan apa-apa
Penulisan tipe data Unit tidak wajib, tapi secara otomatis Function mengembalikan tipe data Unit
 */

// Unit Returning Function
fun hello(name: String? = null): Unit {
    if (name == null) {
        println("Hello bro")
    } else {
        println("Hello bro $name")
    }
}

fun main() {
    hello()
    hello("Nisa")
}