/*
Terkadang kita perlu membuat banyak sekali parameter untuk Function yang kita punya
Hal tersebut akan merepotkan jika kita harus benar-benar tahu urutan parameter tersebut dimana
solusinya, di Kotlin ada Named Argument sehingga kita bisa menyebutkan nama parameter tanpa perlu tahu posisi tiap parameter
 */

fun fullNameJawa(firstName: String,
middleName: String, lastName: String = "",
parentName: String = "", grandpaName: String = "") {
    println("Kenapa nama Kamu panjang sekali hey $firstName $middleName $lastName $parentName $grandpaName")
}
fun main() {
    fullNameJawa("Abdullah", "Umar", "Kastolani", "Reza", "Mustofa")
    fullNameJawa("Nur", "Sholekhatun", "Nisa")
}