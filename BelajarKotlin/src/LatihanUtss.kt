class Karyawan(
    val nama : String,
    val id : String,
    val gajiPokok : Double
) {
    fun tampilkanProfil() {
        println("Nama Karyawan\t: $nama")
        println("ID Karyawan\t\t: $id")
        println("Gaji Pokok\t\t: Rp${"%,.2f".format(verifikasiGaji())}")
        println("--------------------------------")
    }
    fun hitungGajiBulanan(jumlahHariMasuk: Int): Double {
        if (jumlahHariMasuk > 22) {
            return verifikasiGaji()
        } else if (jumlahHariMasuk < 0) {
            return 0 * verifikasiGaji()
        } else {
            return (jumlahHariMasuk / 22.0) * verifikasiGaji()
        }

    }
    fun verifikasiGaji() : Double {
        if (gajiPokok < 0) {
            return 0.0
        } else return gajiPokok
    }
}
fun main() {
    val karyawanA = Karyawan("Andi", "K001", -5_000_000.0)
    val karyawanB = Karyawan("Budi", "K002", 8_000_000.0)
    karyawanA.tampilkanProfil()
    karyawanB.tampilkanProfil()

    val gajiA = karyawanA.hitungGajiBulanan(22)
    val gajiB = karyawanB.hitungGajiBulanan(11)

    println("Gaji Bulanan ${karyawanA.nama}: Rp${"%,.2f".format(gajiA)}")
    println("Gaji Bulanan ${karyawanB.nama}: Rp${"%,.2f".format(gajiB)}")
}
