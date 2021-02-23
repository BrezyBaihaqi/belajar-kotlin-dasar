/*
Paramater yg berada di posisi terakhir dalam sebuah Function, memiliki kemampuan dijadikan sebuah Varargs
Varargs artinya datanya bisa menerima lebih dari satu input (anggap saja semacam array)
Perbedaan dengan array, Parameter dengan Varargs bisa langsung mengirim data tanpa perlu membuat Array
cukup dengan tanda koma
cara penulisan vararg nilai: tipe data. Vararg harus ditulis di ujung parameter
 */

// contoh Function tanpa vararg
fun hitungTotal(values: Array<Int>): Int {
    var total = 0

    for (value in values) {
        total += value
    }
    return total
}

fun hitungTotalVararg(nama: String, vararg values: Int): Int {
    println("Nama kamu $nama, ya?")

    var total = 0
    for (value in values) {
        total += value
    }
    return total
}

fun main() {
    // funtion tanpa Vararg
    val values = arrayOf(10, 10, 10, 10)
    val result = hitungTotal(values)
    println(result)

    // function dengan Vararg
    // jika kita tidak membuat variabel maka, values dalam Vararg tidak akan terpanggil
    val hasil = hitungTotalVararg("Nisa", 10, 10, 10, 10)
    println(hasil)

    hitungTotalVararg("Brezy", 10, 20, 30)
}