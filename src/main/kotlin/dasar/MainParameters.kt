/*
kadang saat menjalankan program , kita butuh input parameter dari luar program kita
bisa untuk konfigurasi program atau lainnya
Kotlin mendukung parameter untuk main function seperti java
dengan IntelliJ ada auto complete ketika ketik main, ada maina
itu adalah main parameters
 */

fun main(args: Array<String>) {
    // ketika kita menjalankan program ini tidak akan menghasilkan apa2
    // hanya jika kita memasukan perintah di args melalui edit configuration
    // maka perintah itu akan dijalankan sebagai hasilnya
    // misal kita masukkan nur sholekhatun nisa
    for (value in args) {
        println(value)
    }
}