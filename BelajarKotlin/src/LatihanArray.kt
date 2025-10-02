fun main() {
    val hari = arrayOf(
        "Senin",
        "Selasa",
        "Rabu",
        "Kamis",
        "Jumat",
        "Sabtu",
        "Minggu"
    )

    println("Jumlah : ${hari.size}")

    println("Hari pertama adalah ${hari[0]}")
    println("Hari terakhir adalah ${hari[6]}")

    println(hari[4])
    hari.set(4, "Jumat Barokah")
    println(hari[4])
}
// hari terakhir adalah ${hari[6]}