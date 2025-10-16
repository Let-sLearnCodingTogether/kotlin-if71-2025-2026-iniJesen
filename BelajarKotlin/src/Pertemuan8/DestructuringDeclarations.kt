package oop

data class Kendaraan(val merek : String, val tahun : Int)

fun main() {
    val toyota = Kendaraan("tayo", 2025)

    val (merek, tahun) = toyota
    println(merek)
    println(tahun)
}