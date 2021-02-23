fun main() {
    /* Operasi Boolean digunakan untuk membandingkan dua atau lebih nilai Boolean
    && -> Dan -> harus True semua supaya hasilnya True
    || -> Atau -> salah satu harus True supaya hasilnya True
    ! Kebalikan
     */
    val finalExam = 80
    val attendant = 80
    val nilaiExtra = 75

    val passFinalExam = finalExam >= 75
    val passAttendant = attendant >= 80
    val passExtra = nilaiExtra >= 75

    val pass = passFinalExam && passAttendant && passExtra

    if (pass) {
        println("Selamat Anda lulus!")
    }else{
        println("Maaf Anda harus lebih giat belajar")
    }
}