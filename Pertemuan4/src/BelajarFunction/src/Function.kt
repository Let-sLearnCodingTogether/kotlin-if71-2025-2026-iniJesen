fun main() {
    tesFunction()
    callName("Jesen")
    nilaiAkhir(
        kuis1 = 10.0,
        kuis2 = 20.0,
        tugas1 = 30.0,
        tugas2 = 40.0,
        uts = 50.0,
        uas = 60.0
    )
}

fun callName(name : String) {
    println("Halo $name")
}

fun tesFunction() {
    println("Selamat Datang")
}

fun nilaiAkhir(
    kuis1 : Double,
    kuis2 : Double,
    tugas1 : Double,
    tugas2 : Double,
    uts : Double,
    uas : Double
) {
    var nilai = kuis1 + kuis2 + tugas1 + tugas2 + uts + uas
    println("Nilai Akhir Kamu $nilai")
}
