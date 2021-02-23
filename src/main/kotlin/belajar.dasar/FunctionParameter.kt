/*
saat membuat Function, kadang kita membutuhkan data dari luar atau yg kita sebut parameter
di Kotlin kita menambahkan lebih dari satu parameter di Function, atau mengosongkan parameter (tidak wajib)
jika kita menambahkan parameter, saat memanggil Function yang kita buat harus memasukkan parameter tersebut
Saat memberikan parameter wajib menambahkan tipe data di belakang parameter
default akan digunakan val, parameter yg sudah di buat tidak bisa di rubah
 */

fun sayHello(firstName: String, lastName: String? = null){
    // kita bisa menambagkan percabangan ataupun kode yg lebih kompleks
    if (lastName == null) {
        // jika menambahkan null, jangan lupa elvis operator (?) di belakang tipe data yg null
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Ahmad", "Briezy")
    sayHello("Nur", "Sholekhatun")
    sayHello("Musaebah", null)
}