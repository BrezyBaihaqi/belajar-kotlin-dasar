package belajar.dasar

// direkomendasikan menggunakan Immutable (val) dibanding Mutable (var)
// standarnya, saat membuat Variabel data harus di isi. Default variabel di Kotlin tidak bisa null

/* Variabel jenis kedua
   Nullable tetap bisa digunakan untuk memberikan variabel yg tidak memiliki data
   tambahkan tandatanya tipedata.(?) setelah tipedata digunakan untuk Nullable
 */

/* Variabel jenis ketiga
    Variabel Constant (Immutable) digunakan untuk keperluan yang lebih luas (global)
    Biasanya variabel dituliskan dengan UPPER_CASE
 */

// Variabel Constant wajib menggunakan val dan ditulis di luar fungsi main
const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"


fun main() {

    val firstName: String = "Brezy"
    val age: Int = 28

    println(firstName)
    println(age)

    val middleName: String? = null
    println(middleName) // bisa di akses
    // println(middleName.length) // tidak bisa di akses, harus menggunakan elvis operator (?.)
    println(middleName?.length)

    // print Variabel Constant
    println("$APP dan versi ke $VERSION")

}