package belajar.dasar

/*
Recursive Function adalah Functionyg memanggil dirinya sendiri
terkadang dalam pekerjaan, RF mempermudah pekerjaan.
Biasanya kalo tidak menggunakan RF, looping yg akan dipilih
Contoh RF adalah Factorial
RF ada di hampir semua bahasa pemrograman
 */

fun main() {
    // Factorial menggunakan loop
    fun factorialLoop(value: Int): Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }

    println(factorialLoop(10))

    // Factorial menggunakan Recursive
    fun factorialRecursive(value: Int): Int {
        return when(value) {
            1 -> 1
            // jangan lupa menuliskan value - 1 agar tidak terjadi StackOverFlow
            else -> value * factorialRecursive(value - 1)
        }
    }

    println(factorialRecursive(10))
}
