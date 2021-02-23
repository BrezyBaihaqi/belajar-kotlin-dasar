/*
Label adalah penanda, semua expression di Kotlin bisa di tandai dengan label
cukup menggunakan katak kunci @ setelah nama label, misal namalabel@.
label tidak boleh ada spasi, harus satu kata
 */

// salah satu kegunaan label adalah bisa di integrasikan dengan Break, Continue dan Return
// biasanya Break, Continue dan Return hanya berefek pada scope di tempat mereka berada
// dengan label kita bisa menentukan ke label mana kode akan berhenti

fun labelBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            println("i-$i * j-$j = ${i * j}")
            if (i > 5) {
                break@loopI
                // dengan label di break, hasilnya berkurang menjadi i-6 * j*1
                // tanpa label di break, hasilnya akhirnya i-10 * j-1
            }
        }
    }
}

fun labelContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI
                // dengan label di continue, hasilnya tidak ada j-5 di perkalian kedua
                // tanpa labelI di continue, hasilnya akhirnya i-10 * j-4
            }
            println("i-$i * j-$j = ${i * j}" )
        }
    }
}

// selain dengan Break dan Continue, label juga bisa di integrasikan dengan Return

fun main() {

    fun test(name: String, param: (String) -> Unit): Unit = param(name)

    test("") test@{
        if (it == "") {
            // label bisa digunakan untuk return, karena lambda tidak bisa menggunakan return
            return@test
            }else {
                println("Nisa")
        }
    }
}