package Coroutine

import java.util.concurrent.Executors
import kotlin.concurrent.thread

fun main() {
    val executor = Executors.newFixedThreadPool(3)

    for (i in 1..10){
        executor.submit {
            val threadName = Thread.currentThread().name

            println("Tugas $i berjalan di thread $threadName")
            Thread.sleep(1_000)
        }
    }
    executor.shutdown()
}