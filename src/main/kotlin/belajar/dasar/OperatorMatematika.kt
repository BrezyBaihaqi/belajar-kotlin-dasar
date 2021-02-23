package belajar.dasar

fun main() {
    // operator matematika di Kotlin sama dengan Java menggunakan * + - /
    // ada juga Augmented Assignments yaitu saat a = a (operator) b menjadi a (operator)= b
    var total = 1_000_000
    val barang1 = 200_000
    val barang2 = 250_000
    val barang3 = 230_000

    total += barang1
    total += barang2
    total += barang3
    println(total)

    /* Unary Operator
    ++ = +1
    -- = -1
    - = negative
    + = positif
    ! = false
     */
    total++
    println(total)

    val sehat = true
    println(!sehat)
}