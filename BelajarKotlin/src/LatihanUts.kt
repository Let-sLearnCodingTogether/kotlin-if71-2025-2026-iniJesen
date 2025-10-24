fun main() {
    val stokBarang = mapOf(
        "Buku Tulis Sinar Dunia" to 45,
        "Pena Pilot G-2" to 78,
        "Indomie Goreng" to 120,
        "Teh Kotak" to 30,
        "Binder B5" to 12,
        "Kopi Kapal Api" to 55
    )

    var tempValue = 999
    var tempKey = ""

    stokBarang.forEach {
        if (it.value < tempValue) {
            tempValue = it.value
            tempKey = it.key
        }
    }
    println("Barang yang perlu segera di-restock adalah: $tempKey")



    val barangMinStok = stokBarang.minByOrNull { it.value }

    if (barangMinStok != null) {
        println("Sisa stok $tempKey adalah: ${barangMinStok.value}")
    } else {
        println("Tidak ada barang dalam stok.")
    }
}
