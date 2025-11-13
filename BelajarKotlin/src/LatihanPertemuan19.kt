package nextOOP

interface Electronic {
    val brand: String

    fun turnOn()
    fun turnOff()

    fun cleanDevice() {
        println("Membersihkan debu dari perangkat $brand")
    }
}

class Fan(override val brand: String) : Electronic {
    override fun turnOn() {
        println("Kipas angin merek $brand berputar")
    }
    override fun turnOff() {
        println("Kipas angin merek $brand berhenti")
    }
}

class SmartLight(override val brand: String) : Electronic {

    override fun turnOn() {
        println("Smart light merek $brand menyala")
    }

    override fun turnOff() {
        println("Smart light merek $brand mati")
    }
}

fun main() {
    print("Masukkan merek SmartLight: ")
    val brandInput = readLine() ?: "Tanpa Merek"

    val lamp = SmartLight(brandInput)
    
    println("Pilih aksi:")
    println("1. Nyalakan")
    println("2. Matikan")
    println("3. Bersihkan (cleanDevice)")

    print("Pilihan: ")
    when (readLine()) {
        "1" -> lamp.turnOn()
        "2" -> lamp.turnOff()
        "3" -> lamp.cleanDevice()   // pakai method concrete dari interface
        else -> println("Pilihan tidak dikenal")
    }
}


