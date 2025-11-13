package nextOOP

interface SpaceVehicle {
    fun accelerate()

    fun stop(){
        println("Stop")

    }

}

class LightSpace : SpaceVehicle{
    override fun accelerate() {
        println("Accelarate")
    }

//    override fun stop() {
//        println("Stop Over")
//    }

}

fun main() {
    val lightSpaceOne = LightSpace()

    lightSpaceOne.accelerate()
    lightSpaceOne.stop()

}