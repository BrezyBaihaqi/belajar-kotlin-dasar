/*
Function parameter wajib diisi ketika memanggil function di main function
namun, kita juga bisa memasukkan nilai default pada parameter
jadi saat memanggil function kita tidak wajib memanggil parameter
default parameter menggunakan tanda "" atau = null jika null setelah tipe data atau
Default Parameter hanya ada di Kotlin, di Java tidak ada
 */
fun hello(firstName: String, lastName: String? = null){
    // kita bisa menambagkan percabangan ataupun kode yg lebih kompleks
    if (lastName == null) {
        // jika menambahkan null, jangan lupa elvis operator (?) di belakang tipe data yg null
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun halo(firstName: String, lastName: String = ""){
    // kita bisa menambagkan percabangan ataupun kode yg lebih kompleks
    if (lastName == null) {
        // jika menambahkan null, jangan lupa elvis operator (?) di belakang tipe data yg null
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Ahmad", "Briezy")
    hello("Nur", "Sholekhatun")
    // saat menggunakan Default Parameter kita tidak harus memasukkan null sebagai parameter kedua yg kosong
    hello("Musaebah")

    halo("Ahmad", "Briezy")
    halo("Nur", "Sholekhatun")
    // saat menggunakan Default Parameter kita tidak harus memasukkan null sebagai parameter kedua yg kosong
    halo("Musaebah")
}