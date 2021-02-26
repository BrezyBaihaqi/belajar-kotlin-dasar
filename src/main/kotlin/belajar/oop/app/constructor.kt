package belajar.oop.app

import belajar.oop.data.Car

/** Constructors
 * saat kita membuat Object, maka kita seperti memanggil sebuah Function
 * di dalam Class Kotlin, kita bisa membuat Constructors,
 * Constructors mirip seperti Function yang akan dipanggil saat pertama kali Object dibuat
 * mirip seperti Function, kita bisa memberi parameter pada Constructors, bedanya tidak ada return value
 * -> cek kembali materi FunctionParameter
 * contoh Function yang memiliki Parameter
 * fun sayHello(firstName: String, lastName: String? = null){}
 *
 * cara membuat Constructor, mirip seperti Parameter di sebuah Function
 * Lalu bagaimana cara membuat Object di Class yang memiliki Constructor?
 * tidak sama seperti sebelumnya, saat membuat Object wajib memasukan Parameter si Constructor saat membuat Object
 *
 * -> cek Class Car
 *
 */

fun main() {
    /** kita akan membuat Object dari Class Car
     * Class Car akan error jika kita hanya mengetikan Car () tanpa param Constructornya
     * kita wajib memasukan param Constructor yang tidak default ke dalam Class
     */

    // setelah kita menggunakan initializer block, setiap Object yg dibuat disini akan mengeksekusi init { }
    val avanza = Car("Toyota")
    // kita bisa merubah properties dari parameter Constructor di atas selama itu bukan immutabe
    avanza.brand = "Honda"

    val alvaz = Car("Wuling", 2019)

    // kita bisa memanggil properties dari parameter Constructor Object di atas seperti saat memanggil properties Object
    println(avanza.brand + " " + avanza.year)
    println(alvaz.brand + " " + alvaz.year)
}