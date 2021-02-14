/*
Recursive Function memiliki keterbatasan dimana jika terlalu dalam memanggil RF akan terjadi StackOverFlow
apa maksudnya? lihat ke bawah
contoh Recursive Function
factorial(5)
factorial(5) => 5 * factorial(4)
factorial(5) => 5 * factorial(4)  => 5 * factorial(3)

jika RF di atas memiliki angka 1_000_000 misalnya, maka hardware komputer kita akan memanggil RF terus menerus
dan bisa terjadi kepegalan (Exhausted) yg berimbas pada Stack Over Flow

Permasalahan RF seperti itu tidak bisa ditangani di Java tetapi di Kotlin bisa dengan Tail Recursive Function
TRF adalah teknik mengubah RF menjadi Looping biasa ketika dijalankan
syarat RF menggunakan TRF yaitu :
1 gunakan tailrec di depan Functino
2 hanya boleh memanggil Function dirinya sendiri tanpa embel-embel operasi dengan data lain
 */

fun main() {
    // Recursive tanpa tailrec
    fun display(value: Int) {
        println("Recursive ke- $value")

        if (value >0) {
            display(value - 1)
        }
    }

    // syarat 1, kata kunci tailrec
    tailrec fun displayTailrec(value: Int) {
        println("Tail Recursive ke- $value")

        if (value > 0) {
            // syarat 2, hanya memanggil display, tanpa operasi tambahan misal + 2
            // jika ada tambahan maka error
            displayTailrec(value - 1)
        }
    }

    // tanpa tailrec akan terjadi StackOverFlowError
    // -> display(7000)
    // dengan tailrec tidak akan terjadi StackOverFlow
    // -> displayTailrec(7000)

    // Tail Recursive Function dengan Factorial
    // menambahkan parameter karena else tidak bisa menambahkan value
    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        println("value $value, total $total")

        return when(value) {
            // jika value bernilai 1 maka yg di kembalikan adalah total
            1 -> total
            // jangan lupa menuliskan value - 1 agar tidak terjadi StackOverFlow
            // tapi kalau bukan 1, maka 10 - 1 dan total * 10
            else -> factorialRecursive(value - 1, total * value)
        }
    }

    println(factorialRecursive(10))
}
