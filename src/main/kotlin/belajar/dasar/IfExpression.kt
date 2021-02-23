package belajar.dasar

fun main() {
    /*
    If adalah salah satu kunci yang digunakan untuk percabangan
    percabangan akan mengeksekusi kode program tertentu jika kondisinya terpenuhi
    selain Kotlin, hampir semua bahasa pemrograman mendukung If Expression
     */

    val nilai = 61

    if (nilai > 90) {
        println("Excellent!")
    }else if (nilai > 80) {
        println("Marveolus!")
    }else if (nilai > 60) {
        println("Good Job!")
    }else{
        println("Try Harder!")
    }
}