package belajar.dasar

/*
Function Scope diperuntukan jika kita tidak ingin Function yg kita buat bisa terpanggil oleh selain Main Function
Berbeda dengan Java yg tidak bisa membuat kelas di luar psvm (main class), di Kotlin kita bisa bebas membuat function
di luar main function
Function Scope biasanya di batasi oleh kurung kurawal ({})
 */

fun satu() {

}

fun dua() {

}

fun main() {
    fun contohHelloWorld() {
        println("Function di dalam scope Main Function")
    }

    contohHelloWorld()
}