fun main() {
    val range = 10..100
    val rangeDownto = 10.downTo(1)
    val rangeDownto2 = 10 downTo 1
    val rangeUpTo = 100 downTo 50 step 3

    // Operasi di Range
    println(range.count())
    println(rangeDownto.contains(11))
    println(range.first)
    println(range.last)
    println(range.step)
    println(rangeUpTo.count())
}