fun main() {
    // Deklarasi array primitif dengan tipe data Byte
    val byteArray = byteArrayOf(10, 20, 30, 40, 50)

    // Menampilkan elemen array menggunakan loop
    for (i in byteArray) {
        print("$i ")
    }

    // Mengakses elemen array berdasarkan indeks
    println("\nElemen pertama\t: ${byteArray[0]}")
    println("Elemen terakhir\t: ${byteArray[byteArray.size - 1]}")

    // Mengubah elemen array
    byteArray[2] = 100
    println("Setelah diubah, elemen ke-3\t: ${byteArray[2]}")

    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val Byte = byteArrayOf(10, 20, 30, 40, 50)
    val shortArray = shortArrayOf(100, 200, 300, 400, 500)
    val longArray = longArrayOf(1000L, 2000L, 3000L, 4000L, 5000L)
    val floatArray = floatArrayOf(1.1f, 2.2f, 3.3f, 4.4f, 5.5f)
    val doubleArray = doubleArrayOf(1.11, 2.22, 3.33, 4.44, 5.55)
    val charArray = charArrayOf('a', 'b', 'c', 'd', 'e')
    val booleanArray = booleanArrayOf(true, false, true, false, true)

    for (i in intArray) print("$i ")
    println("")
    for (i in byteArray) print("$i ")
    println("")
    for (i in shortArray) print("$i ")
    println("")
    for (i in longArray) print("$i ")
    println("")
    for (i in floatArray) print("$i ")
    println("")
    for (i in doubleArray) print("$i ")
    println("")
    for (i in charArray) print("$i ")
    println("")
    for (i in booleanArray) print("$i ")
    println("")

}
