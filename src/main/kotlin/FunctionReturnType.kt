/*
jika Function di deklarasikan dengan tipe data pengembalian (bukan Unit)
maka wajib di dalam function kita harus mengembalikan data (menulis return)
penulisan Return diikuti dengan data yg akan di kembalikan
 */

fun jumlahkan(a: Int, b: Int): Int {
    val total = a + b
    return  total
}

fun pembagian(a: Int, b: Int): Int {
    if (b == 0) {
        // berfungsi jika kita ingin membagi dengan 0, hasil akan selalu 0 bukan Exception
        return 0
    } else {
        val total = a / b
        // kode return di bawah berfungsi untuk mengembalikan kode yg akan di jalankan di akhir
        return total
    }
}

fun main() {
    println(jumlahkan(10, 10))

    val result = jumlahkan(100, 100)
    println(result)

    println(pembagian(100, 10))

    val bagi = pembagian(100, 0)
    println(bagi)
}