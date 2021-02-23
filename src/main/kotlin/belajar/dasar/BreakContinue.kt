package belajar.dasar

fun main() {
    /*
    Break dan Continue bisa digunakan untuk semua perulangan di Kotlin
    Break digunakan untuk menghentikan seluruh perulangan
    Continue digunakan untuk menghentikan perulangan yang berjalan dan langsung melanjutkan perulangan selanjutnya
     */

    var i = 0
    while (true) {
        println("Perulangan Break ke-$i")
        i++

        /*
        jika menaruh kode Break disini, kode hanya akan dijalankan satu kali
        print out -> Break Me ke-i
         */
        //break
        if (i > 10) {
            println("BREAK!!!")
            // jika tidak ada break akan terjadi infinite loops
            break
        }
    }

    for (Perulangan in 1 until 100) {
        if (Perulangan % 2 == 0) {
            println("Perulangan ke-$Perulangan")
            continue
        }
        println(Perulangan)
    }
}