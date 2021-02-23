/*
Kadang kita sering membuat Function yg sangat sederhana misal hanya berisi 1 baris
jika seperti itu, kita bisa mengubahnya menjadi Single Expression Function (SEF)
SEF dituliskan dengan kata kunci = setelah nama Function dan tipe data pengembalian Function
 */

// Biasanya kita menulis Function seperti ini
fun doubleA(a: Int): Int {
    val total = a * 2
    return total
}

// Function tetrsebut bisa kita ubah menjadi SEF
// dalam SEF, kode b * 2 dianggap sebagai Expression dan langsung dijadikan return value
// Jadi tidak perlu menggunakan kata kunci return
fun doubleB(b: Int): Int = b * 2

// SEF juga bisa digunakan untuk tipe pengembalian data Unit
fun hi(name: String): Unit = println("hi $name")

fun main() {
    val kaliDua = doubleA(8)
    println(kaliDua)

    val kaliDuaSEF = doubleB(8)
    println(kaliDuaSEF)

    // kode di bawah ini tetap akan menghasilkan hi Nisa karena Function di atas sudah ada println
    val sapa = hi("Nisa")
    // kalau kita println sapa maka akan kelaur kotlin.Unit
    println(sapa)
}