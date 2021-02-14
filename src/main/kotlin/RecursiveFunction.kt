/*
Recursive Function adalah Functionyg memanggil dirinya sendiri
terkadang dalam pekerjaan, RF mempermudah pekerjaan.
Biasanya kalo tidak menggunakan RF, looping yg akan dipilih
Contoh RF adalah Factorial
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

    fun factorialRecursive() {

    }

    println(factorialLoop(10))
}
