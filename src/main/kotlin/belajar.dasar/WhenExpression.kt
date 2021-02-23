fun main() {
    /*
    When Expression di bahasa lain seperti Java namanya SwitchCase Expression
    WhenExpression digunakan untuk kasus yg sangat sederhana
    Di rekomendasikan dibanding If Expression untuk kasus sederhana
    jika di If Expression ada banyak bracket {}, di When cukup 1 bracket {}
    */

    val nilai = 80
    //  value di Variabel harus persis berbeda dengan yg ada di dalam percabangan misal 60, 80, 90
    when (nilai) {
        90 -> println("Excellent!")
        80 -> println("Marveolus!")
        60 -> println("Good Job!")
        else -> println("Try Harder!")
    }

    val nilaiAkhir = 55
    // When Expression tanpa, value di Variabel boleh berbeda dengan yg ada di dalam percabangan
    when {
        nilaiAkhir > 90 -> println("Excellent!")
        nilaiAkhir > 80 -> println("Marveolus!")
        nilaiAkhir > 60 -> println("Good Job!")
        else -> println("Try Harder!")
    }

    // When Expression Multiple Option
    when(nilai) {
        90, 80, 70 -> println("Selamat Anda Lulus!")
        else -> println("Maaf Anda harus lebih giat belajar!")
    }

    // When Expression In, jika data sudah ada di dalam Array
    val nilaiLulus = arrayOf(90, 80, 70)
    when(nilai) {
        in nilaiLulus -> println("Selamat Anda Lulus!")
        !in nilaiLulus -> println("Maaf Anda harus lebih giat belajar!")
    }
}