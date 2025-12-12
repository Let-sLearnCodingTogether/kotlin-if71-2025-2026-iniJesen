// =======================
//  Soal 1: Class Smartphone
// =======================

class Smartphone(
    val merk: String,
    val model: String,
    var harga: Double,
    var stok: Int
) {

    fun beli(jumlah: Int) {
        if (jumlah <= stok) {
            stok -= jumlah
            val totalHarga = harga * jumlah
            println("Pembelian berhasil! Anda membeli $jumlah unit $merk $model.")
            println("Total harga: Rp$totalHarga")
        } else {
            println("Gagal membeli $merk $model. Stok tidak mencukupi!")
        }
    }

    fun restock(jumlah: Int) {
        stok += jumlah
        println("Berhasil restock $jumlah unit untuk $merk $model.")
    }

    fun tampilkanInfo() {
        println("==== Informasi Smartphone ====")
        println("Merk  : $merk")
        println("Model : $model")
        println("Harga : Rp$harga")
        println("Stok  : $stok")
        println("==============================")
    }
}

fun main() {
    // ---- IMPLEMENTASI SOAL 1 ----
    val hp1 = Smartphone("Samsung", "SX", 5000000.0, 10)
    val hp2 = Smartphone("iPhone", "20", 20000000.0, 2)

    // Tampilkan info awal
    hp1.tampilkanInfo()
    hp2.tampilkanInfo()

    // Pembelian berhasil
    hp1.beli(3)

    // Pembelian gagal
    hp2.beli(5)

    // Update harga
    hp1.harga = 4500000.0
    println("Harga Samsung SX diperbarui karena diskon.")

    // Restock HP kedua
    hp2.restock(5)

    // Tampilkan info akhir
    hp1.tampilkanInfo()
    hp2.tampilkanInfo()
}
