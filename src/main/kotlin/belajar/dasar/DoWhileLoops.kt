package belajar.dasar

fun main() {
    /* perulangannya hampir sama dengan While Loops
    bedanya pada Do While Loop, kode blok akan dijalankan dahulu, baru di akhir dicek kondisi
    minimal 1 kali akan di eksekusi, walaupun kondisinya False
     */

    var i = 0

    do {
        println("Do While Loop ke-$i")
        i++
    } while (i < 10)

    var iFalse = 100

    do {
        // walaupun While bernilai False (karna iFalse bernilai false, kode blok di bawah ini tetap akan di jalankan 1 kali
        println("Do While Loop ke-$iFalse")
        i++
    } while (iFalse < 10)
}