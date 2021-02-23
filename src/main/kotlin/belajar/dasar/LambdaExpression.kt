package belajar.dasar

/*
Function di Kotlin adalah first-class Citizen (istimewa), di anggap seperti tipe data yg lainnya
Function bisa dimpan di variabel, array bahkan bisa dikirim ke parameter function itu sendiri
Function di Kotlin bisa dijadikan Lambda Expression
LE adalah function yg tidak memiliki nama atau kita bisa tidak mendeklarasikan namanya
biasanya saat membuat Function kita menggunakan kata kunci fun dan nama functionnya
dengan LE, kita bisa membuat Function tanpa harus mendeskripsikan Functionnya.
Functionnya bisa kita langsung masukkan ke array, parameter

ada 3 yg akan di bahas dalam materi ini
1. Cara membuat Lambda
2. kata kunci It
3. Method References
 */

fun main() {
    // membuat lambda
    // val lambdaName: (parameter) -> return value = {Function Lambda Expression => parameter -> body}
    // dalam LE, tidak perlu (), bisa langsung kurawal {}
    // tidak perlu menggunakan return value, baris akhir di body akan menjadi return

    // 1. cara mengeksekusi lambda
    // val name = lambdaName(parameter)

    val contohLambda: (String, String) -> String = {firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        // return value di bawah tanpa perlu kata return
        result
    }

    println(contohLambda("Brezy", "Baihaqi"))

    // kata kunci It
    // 2. It di gunakan jika Lambda hanya mempunyai 1 parameter,
    // secara default jika kita tidak mendeklarasikan parameter pertama, parameter bisa di akses dengan It
    val contohIt: (String) -> String = {
        "Hello, $it"
    }

    println(contohIt("Nisa"))

    // 3. method reference, membuat Lambda Expression dari Function yg sudah ada
    // disebut juga Function References

    fun toUpper(value: String): String = value.toUpperCase()

    // membuat LE dari function di atas
    // cara mengambil function toUpper cukup menggunakan ::(namaFunction)
    val methodReferences: (String) -> String = ::toUpper
    println(methodReferences("Brezy Baihaqi"))
}