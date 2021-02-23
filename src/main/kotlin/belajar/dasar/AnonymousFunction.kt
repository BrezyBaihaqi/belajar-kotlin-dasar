package belajar.dasar

/*
jika di Lambda, kita tidak bisa menggunakan kata kunci return
kalau kita ingin menggunakan percabangan dan ingin menuliskan return bisa menggunakan fitur Anonymous Functino
Anonymous Functin yaitu Function tanpa deklarasi nama Functionnya
biasanya fun namaFungsi(): Tipe data, di AF tidak perlu menuliskan namaFungsinya
 */

fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value == ""){
            return "OPS KOSONG"
        } else {
            return value.toLowerCase()
        }
    }

    println(upper("NISA"))

    // Anonymous Function bisa langsung dimasukkan ke dalam function
    println(hello("BREZY", fun(value: String): String {
        return value.toLowerCase()
    }))
}