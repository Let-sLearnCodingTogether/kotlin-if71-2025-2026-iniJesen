fun main() {
    val matakuliahWajib : List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "Algoritma dan Struktur Data")

    println("List mata kuliah wajib : $matakuliahWajib.forEach {1}")
    println("Size list mata kuliah wajib : ${matakuliahWajib.size}")

    println("Index pertama mata kuliah wajib : ${matakuliahWajib[0]}")
    val mataKuliahUppercase = matakuliahWajib.map{
        it.uppercase()
    }

    println("List mata kuliah uppercase : $mataKuliahUppercase")

    val matakuliahLebihDariNKarakter = matakuliahWajib.filter {
        it.length > 10
    }

    println("Mata kuliah lebih dari 10 karakter : $matakuliahLebihDariNKarakter")
}