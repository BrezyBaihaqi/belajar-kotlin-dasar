package belajar.dasar

/*
Extension Function adalah kemampuan menambah Function pada tipe data yg sudah ada
tipe data yg sudah ada seperti String, Int, Boolean dll
biasanya kita menambahkan tipe data kedalam sebuah Function,
tapi dalam EF, kita justru menambahkan Function ke dalam sebuah tipe data
EF cocok digunakan saat kita menggunakan Library orang lain yg tipe datanya tidak bisa di ubah
Tapi harus di ingat kita tidak bisa menambahkan EF terlalu banyak karena akan membuat program sulit dimenegerti
cara membuat EF cukup menambahkan tipe data pada nama function diikuti tanda titik (.)
untuk mengakses data di EF, kita bisa menggunakan kata kunci this
 */

fun String.hello(): String {
    return "Hello $this"
}

// kita menggunakan println karena menggunakan tipe data Unit, beda dengan di atas yg sudah ketahuan String
fun String.printHello()= println("Hello $this")

fun main() {
    val name = "Nisa"

    // kita bisa tiba2 memanggil function di belakang name yg ber tipe data String
    println(name.hello())

    // misal kita punya String, kita bisa tiba2 menggabungkan tipe data tersebut dengan Function
    "Brezy".printHello()
}