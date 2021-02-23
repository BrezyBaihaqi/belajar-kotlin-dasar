/*
Infix Notation adalah operasi yg biasa di lakukan di operasi matetmatika
dimana IN melakukan operasi terhadap dua data, misal hasil = a + b
untuk menggunakan IN, tidak wajib menggunakan tanda .
Syaratany :
- harus sebagai function dari membernya atau kelasnya tipe data
- harus memiliki 1 parameter, tidak boleh lebih
- tidak boleh varargs dan default
- masukan kata kunci infix di awal Function

Infix Notation tidak ada di Java
 */

infix fun String.ke(type: String): String {
    return if (type == "UP") {
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}

infix fun Int.kali(type: Int): Int {
    val total = this * type
    return total
}
fun main() {
    println("Eko" ke  "UP")
    println(10 kali 200)
    1000 downTo 1
}