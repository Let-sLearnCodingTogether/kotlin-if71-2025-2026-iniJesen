fun tampilkanIsiArray(angka: IntArray) {
    print("Isi Array\t: ")
    for (i in angka) {
        print("$i ")
    }
}

fun hitungTotal(angka: IntArray): Int {
    var total = 0
    for (i in angka) {
        total += i
    }
    return total
}

fun hitungRataRata(angka: IntArray): Double {
    val total = hitungTotal(angka)
    return total.toDouble() / angka.size
}

fun main() {
    val angka = intArrayOf(80, 90, 99, 40)

    tampilkanIsiArray(angka)

    val total = hitungTotal(angka)
    val rataRata = hitungRataRata(angka)

    println("\nTotal\t\t: $total")
    println("Rata-rata\t: $rataRata")
}
