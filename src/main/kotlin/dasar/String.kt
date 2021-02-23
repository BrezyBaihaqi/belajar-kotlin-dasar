fun main() {

    var firstName: String = "Eko"
    var lastName: String = "Kurniawan"

    var address: String = """
        Jalan Industri Sandang, No 40A
        RT 014 RW 017
        Kel Klender
        Kec Duren Sawit
        Kota Jakarta Timur
    """.trimIndent()

    // trim berfungsi untuk memotong karakter, ada trimMargin, trimIndent

    println(firstName)
    println(lastName)
    println(address)

    //menggabungkan String
    println(firstName + " " + lastName)

    //String Template
    var fullName: String = "$firstName $lastName"
    println("Hi, $firstName nama lengkap kamu $fullName")

    // String Template untuk expresi yg lebih kompleks
    println("Panjang $fullName = ${fullName.length}")

}