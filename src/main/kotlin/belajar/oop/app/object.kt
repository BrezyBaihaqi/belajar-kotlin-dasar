package belajar.oop.app

import belajar.oop.data.Address
import belajar.oop.data.Person

fun main() {
    /** bikin Object dari Class Person
     * untuk membuat Object cukup panggil kelasnya
     * seperti memanggil Function -> namaFunction() <-
     */

    /**
     *  Cara memanipulasi Properties
     *  misal kita punya Object Eko, Brezy, Nisa dari Class Person()
     *  di dalam masing-masing Object kita memiliki Properties firstName, middleName, lastName (cek Properties default di Class Person)
     *  cara memanipulasinya adalah dengan memanggil Properties setelah Object diikuti nilai barunya
     */
    val eko = Person()
    eko.firstName = "Eko"

    val brezy = Person()
    brezy.middleName = "Baihaqi"

    val nisa = Person()
    nisa.lastName = "Nisa"

    val countryName = Address()
    // nama Country akan error karena kita menset data Immutable di dalam Class Address
    // data yg Immutable tidak bisa kita manipulasi di dalam Object
    // -> countryName.country = "Amerika"

    // hanya bisa di ambil datanya dengan cara namaObject diikuti namaProperties
    println(countryName.country)

    // print Object
    println(eko.firstName)
    println(brezy.middleName)
    println(nisa.lastName)

    /** Saat kita membuat Object, kita bisa mengencapsulasi (encapsulation)
     * Encapsulation yaitu menggrupkan beberapa data di dalam satu Object
     * misalnya disini kita membuat Class Person, kita bisa memasukkan banyak data
     * data di Class Person (firstName, middleName, lastName) bisa dimasukkan  di dalam satu Class Person dan Object yg akan kita buat
     */
}