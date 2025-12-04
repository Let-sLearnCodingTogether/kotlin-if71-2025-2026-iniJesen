package Coroutine

import java.util.Date
import kotlin.concurrent.thread

fun main() {
    val runnable = Runnable {
        println(Date())
        Thread.sleep(2_000 )
        println("Hello")
    }

    val thread0 = Thread(runnable)
    thread0.start()
    println("Program Selesai")
}