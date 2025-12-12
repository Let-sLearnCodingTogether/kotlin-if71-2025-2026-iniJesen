// =======================
//  Soal 2: Pengiriman Paket
// =======================

// Enum status pengiriman
enum class StatusPengiriman {
    PROSES, DIKIRIM, SAMPAI
}

// Interface layanan kurir
interface LayananKurir {
    fun hitungOngkir(jarak: Int): Double
}

// Implementasi kurir JNE
class JNE : LayananKurir {
    override fun hitungOngkir(jarak: Int): Double {
        return 1000.0 * jarak
    }
}

// Implementasi kurir GoSend
class GoSend : LayananKurir {
    override fun hitungOngkir(jarak: Int): Double {
        return 2000.0 * jarak
    }
}

// Generic class Paket<T>
class Paket<T>(
    val isiPaket: T,
    val alamat: String,
    var kurir: LayananKurir,
    var status: StatusPengiriman = StatusPengiriman.PROSES
) {

    fun cekStatus() {
        println("Isi Paket : $isiPaket")
        println("Alamat    : $alamat")
        println("Status    : $status")
    }

    fun kirimPaket(jarak: Int) {
        status = StatusPengiriman.DIKIRIM
        val biaya = kurir.hitungOngkir(jarak)
        println("Paket sedang dikirim...")
        println("Biaya ongkir: Rp$biaya")
    }
}

fun main() {
    // ---- IMPLEMENTASI SOAL 2 ----

    val paket1 = Paket("Dokumen Rahasia", "Jakarta Selatan", JNE())
    paket1.cekStatus()
    paket1.kirimPaket(10)

    val paket2 = Paket(101, "Bandung", GoSend())
    paket2.cekStatus()
    paket2.kirimPaket(5)
}
