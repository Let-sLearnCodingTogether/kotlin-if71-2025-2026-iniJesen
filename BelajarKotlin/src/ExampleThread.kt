package Coroutine

import java.util.Date
import kotlin.concurrent.thread

fun main() {
    val runnable = Runnable {
        println(Date())
        Thread.sleep(2_000 )
        println("Hello")
    }

    val runnable1 = Runnable {
        println(Date())
        Thread.sleep(2_000 )
        println("Hello runnable 1")
    }

    val thread0 = Thread(runnable)
    val thread1 = Thread(runnable1)
    thread0.start()
    thread1.start()
    print("Program Selesai")
}