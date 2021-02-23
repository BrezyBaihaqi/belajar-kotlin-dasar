package belajar.dasar

fun main() {
    /* While Loops digunakan untuk perulangan yang lebih luas (fleksibel), tidak hanya untuk iterator
    mirip dengan If Expressions sampai kondisi bernilai false
    Harus hati-hati menggunakan While Loops, jangan sampai lupa mendefinisikan false agar tidak terjadi infinite loops
     */

    var i = 0

    while (i < 10.17) {
        println("While Loops ke-$i")
        i++
    }
    println("finish")
}