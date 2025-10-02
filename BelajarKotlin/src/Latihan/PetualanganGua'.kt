fun main() {

    //status petualang
    print("Masukkan nama pemain : ")
    val namaPemain = readln().lowercase()
    var kesehatan = 100
    var punyaKunciEmas = false
    var jumlahPotion = 2

    //status permainan
    var sedangBermain = true

    while (sedangBermain){
        println("\nnama\t\t : $namaPemain")
        println("kesehatan\t : $kesehatan")
        println("sisa potion\t : $jumlahPotion")

        println("\nDidepan kamu terdapat 2 buah jalur (1, 2) :")
        println("1). Jalur gelap dan seram")
        println("2). Jalur tenang dan sunyi")
        print("Pilih jalur : ")
        val jalur = readln()
        var jalurPilihan = jalur.toIntOrNull()

        if (jalurPilihan == 2) {
            kesehatan -=25
            println("\nKamu menginjak perangkap, sisa kesehatanmu $kesehatan")
        } else if (jalurPilihan == 1) {
            println("\nKamu memasuki ruang teka-teki")
            println("ada tiga patung :\nnaga\ngriffin\nular")
            print("Silahkan pilih patung : ")
            val pilihPatung = readln().lowercase()

            when (pilihPatung) {
                "naga" -> {
                    println("\nPatung naga mengeluarkan api, kesehatanmu berkurang 35")
                    kesehatan -=35
                }
                "griffin" -> {
                    println("\nKamu mendapatkan kunci emas")
                    punyaKunciEmas = true
                }
                "ular" -> {
                    println("Patung ular menggigitmu! Kesehatanmu berkurang 15.")
                    kesehatan -= 15
                }
                else -> {
                    println("Kamu tidak memilih patung dengan benar")
                }
            }
            if (jumlahPotion > 0 && kesehatan > 0) {
                if (punyaKunciEmas == false) {
                    print("Gunakan potion untuk memulihkan kesehatan? (y/n): ")
                    val pakaiPotion = readln().lowercase()
                    if (pakaiPotion == "y") {
                        kesehatan += 10
                        if (kesehatan > 100) kesehatan = 100
                        jumlahPotion--
                        println("Kesehatanmu sekarang: $kesehatan (Potion tersisa: $jumlahPotion)")
                    }
                }
            }
        } else {
            println("Jalur pilihan tidak ada")
        }
        if (punyaKunciEmas) {
            println("\nKamu menemukan pintu terakhir")
            println("Kamu menggunakan kunci emas dan menemukan artefak kuno!")
            println("\nPermainan Selesai, kamu MENANG")
            sedangBermain = false
        } else if (kesehatan == 0) {
            println("\nKesehatanmu habis")
            println("Permainan Selesai, kamu KALAH")
            sedangBermain = false
        }
    }


}