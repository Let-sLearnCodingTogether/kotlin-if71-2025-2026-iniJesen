fun main() {
    val jarak = 0..10000
    val jarak1 = 'a'..'o'
    val jarak2 = 1 until 100000
    val jarak3 = 100000 downTo 1

    println(jarak.count())

    val jarak4 = 0..1234 step 2
    val jarak5 = 2550 downTo 0 step 150

    println(jarak4.first)
    println(jarak4.last)
    println(jarak5.first)
    println(jarak5.last)

    println(jarak4.toList()[6])
    println(jarak5.toList())
}