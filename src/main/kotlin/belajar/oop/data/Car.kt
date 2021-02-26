package belajar.oop.data

/**
 * cara menambahkan Constructor di sebuah Class
 * sebelumnya hanya -> class Car {}, di rubah menjadi -> class Car(Constructor) {kode}
 * cek paramater Constructor di bawah
 *
 * Parameter Constructor juga seperti Parameter Function
 * kita bisa memberikan default valuenya
 * awal -> paramYear: Int, jadi -> paramYear: Int = 2020
 */
class Car(paramBrand: String, paramYear: Int = 2020) {
    // -> dari initializer block
    // akan terjadi error jika kita langsung masukan kode, misal println("....")
    // agar tidak error, kita perlu kata kunci init { }
    init {
        // dengan initializer block kita bebas menuliskan kode apapun
        // harus di ingat jangan berat-berat kode yg di buat disini
        println("Car $paramBrand dibuat")
    }

    // init { } akan di eksekusi di dalam Object yg kita buat
    // -> cek file constructor

    // Parameter yg sudah kita buat bisa kita panggil di Object yg kita buat
    // Parameter di atas kita assign ke dalam Variabel seperti di bawah
    var brand: String = paramBrand
    var year: Int = paramYear

    // -> next lihat file constructor
}