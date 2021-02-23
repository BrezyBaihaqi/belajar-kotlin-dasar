fun main() {
    /* For berfungsi sebagai salah satu perulangan
    For digunakan untuk perulangan iterasi dari data iterator (Array, Range dll)
    iterator lebih banyak ada di collection
     */

    // mengambil data satu persatu dari Array
    val names = arrayOf("Ahmad", "Briezy", "Baihaqi", "Nur", "Sholekhatun", "Nisa", "Ghozali", "Hanifah", "Musaebah", "Solehudin")
    for (name in names) {
        println(name)
    }

    // mengecek berapa jumlah indes di array
    var total = 0
    for (name in names) {
        println(name)
        total++
    }
    println("Total perulangan names = $total")


    //For Loops dengan Range
    for (range in 0..10) {
        println(range)
    }

    for (menurun in 10 downTo 1 step 2) {
        println(menurun)
    }

    // menggabungkan For Loops dengan Range
    /* jangan lupa untuk mengurangi 1 dari ukuran total Array agar tidak terjadi
    ArrayIndexOutOfBoundsException. Karna index selalu dimulai dari 0
     */
    /* ada tiga cara penulisan kode (- 1)
    satu -> val lengthArray = names.size - 1
    dua -> for (i in 0..lengthArray -1)
    tiga - > for (i in 0 until lengthArray)
     */
    val lengthArray = names.size - 1
    for (i in 0..lengthArray) {
        println("Index ke-$i = ${names.get(i)}")
    }
}