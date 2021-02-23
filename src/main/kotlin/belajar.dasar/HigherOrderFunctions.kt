/*
Higher-Order Functions adalah Lambda yg kita jadikan parameter sebagai di Function
HEF berguna ketika kita ingin membuat Function yg general dan ingin mendapatkan input yg flexible berupa lambda,
yg bisa di deklarasikan oleh user ketika memanggil function tersebut
nantinya dengan 1 Function tersebut, kita bisa membuat beberapa kemungkinan menggunakan HEF

ada 2 kode yg di bahas dalm materi ini :
1. cara menuliskan HEF
2. Trailing Lambda
 */

fun main() {
    // misalnya kita mempunyai Function yg memiliki 2 parameter, parameter general dan parameter lambda
    // function Hello memiliki 2 parameter, name: String = general dan transformer: (String) -> String = Lambda
    fun hello(name: String, transformer: (String) -> String): String {
        // input dari user akan di eksekusi oleh lambda
        // jadi nanti parameter name akan di transform menggunakan parameter lambda
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // kita bisa deklarasikan dulu variabel lambda
    val lambdaUpper = { value : String -> value.toUpperCase() }
    println(hello("Nisa", lambdaUpper))

    // bisa langsung dimasukkan saat memanggil Function
    // tanpa trailing lambda
    println(hello("BREZY", { value: String -> value.toLowerCase() }))

    // 2. Trailing Lambda merupakan kemampuan dalam Kotlin untuk menuliskan parameter berbentuk lambda di luar function
    // syaratnya lambda harus berada di parameter terakhir
    // pemanggilan function dengan penulisan lambda di luar function
    println(hello("Eko") {value: String -> // seolah olah ada yg tertinggal (trailing) kan? mana
        // ini yg tertinggal wkwk
        value.toLowerCase()} )

}