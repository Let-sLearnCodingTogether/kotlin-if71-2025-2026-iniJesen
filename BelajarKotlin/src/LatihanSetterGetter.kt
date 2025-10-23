package oop

class PersegiPanjang(panjang : Double, lebar : Double) {
    val panjang = 0.0
    val lebar = 0.0
    val luasPersegiPanjang : Double
        get() = lebar * panjang
}

class Mahasiswa(ipk : Double) {
    var ipkFix = ipk
        set(ipkFix) {
            field = if (ipkFix < 0) 0.0
            else if (ipkFix > 4) 4.0
                else ipkFix
        }
    init {
        this.ipkFix = ipk
    }
}

fun main() {
    val luasBangun = PersegiPanjang(50.0, 2.0)
    println(luasBangun.luasPersegiPanjang)

    val ipkMahasiswa = Mahasiswa(4.8)
    println(ipkMahasiswa.ipkFix)

    ipkMahasiswa.ipkFix = -4.0
    println(ipkMahasiswa.ipkFix)

    ipkMahasiswa.ipkFix = 5.0
    println(ipkMahasiswa.ipkFix)
}