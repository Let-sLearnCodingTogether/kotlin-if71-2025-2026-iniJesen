import com.sun.jdi.Type

fun printAngka(angka: IntArray) {
    for (number in angka) {
        println(number)
    }
}
fun printAngka2(vararg angka : Int) {
    for (number in angka) {
        println(number)
    }
}
infix fun String.to(type: String) : String {
    if (type == "upper") {
        return this.uppercase()
    }
    return this.lowercase()
}
fun main() {
    val isiArray = intArrayOf(1, 2, 3)

    printAngka(isiArray)
    printAngka2(10, 20)

    println("hello world" to "upper")
    println("HELLO WORLD" to "lower")
}


