package belajar.dasar

// Array di Kotlin mirip dengan Java dimana tipe data di Array tidak bisa dicampur
/* Operasi dalam Array
    size -> mendapatkan panjang Array
    get(index) -> mendapat data di posisi index
    [index] -> mendapat data di posisi index
    set(index, value) -> mengubah data di posisi index
    [index] = value -> mengubah data di posisi index
 */

fun main() {
    val name: Array<String> = arrayOf("Topik", "Bambang", "David", "Mouldie")
    val age: Array<Int> = arrayOf(19, 23, 10, 25)

    println(name.size)
    println(name.get(2))
    println(age[0])
    age.set(2, 18)
    println(age[2])
    age[0] = 17
    println(age[0])

    // Array tidak boleh Null
    // tapi Null tetap bisa digunakan dengan memasukan ? di belakang tipe data
    // val age: Array<Int?> = arrayOf(19, 23, 10, 25)
    // age[3] = null

}