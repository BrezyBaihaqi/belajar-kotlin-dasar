/*
kemampuan Higher Order Function yg biasa di gunakan Functional Oriented Programming ..
.. di Kotlin bisa membuat performa aplikasi menurun
karena kotlin tetap berjalan di atas JVM, dimana Java merupakan OOP
mengatasi Higher Order Function, kotlin memiliki kemampuan Inline Function
Inline Function adalah saat code di dalam HOF di duplikasi saat runtime sehingga aplikasi ..
.. tidak perlu membuat object lambda berulang - ulang
 */

fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun sapa(name: () -> String): String {
    return "Hello ${name()}"
}

// kita bisa membuat parameter yg kita inginkan no inline
inline fun greeting(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {

    for (i in 0..100) {
        println(greeting({ "Nisa" }, {"Nur"}))
    }
}