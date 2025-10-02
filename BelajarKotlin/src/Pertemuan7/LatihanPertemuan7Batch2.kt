fun main() {
    val matakuliahWajib: List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "Algoritma dan Struktur Data")

    val matakuliahPilihan : MutableList<String> = mutableListOf(
        "Kotlin",
        "Logika Fuzzy"
    )

    matakuliahPilihan.add("Web 2")

    println("Index 0")
    println(matakuliahPilihan[0])
    println("Index 1")
    println(matakuliahPilihan[1])
    println("Index 2")
    println(matakuliahPilihan[2])

    matakuliahPilihan.add(1, "Web 1")
    println()
    println("Index 1")
    println(matakuliahPilihan[1])

    matakuliahPilihan.removeAt(1)
    println(matakuliahPilihan)

    val matakuliah = matakuliahPilihan + matakuliahWajib
    println(matakuliah)
}