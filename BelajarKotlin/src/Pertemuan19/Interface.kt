package nextOOP

interface Vechile {
    fun accelerate()
    fun stop()
}

class Motor : Vechile {
    override fun accelerate() {
        println("eccelerate")
    }
    override fun stop() {
        println("stop")
    }
}

fun main() {
    val motor1 = Motor()

    motor1.accelerate()
    motor1.stop()
}