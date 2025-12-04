package Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi dimulai")

    launch {
        updateVersion()
    }

    println("aplikasi sedang digunakan")
}

suspend fun updateVersion() {
    delay(5_000)
    println("UpdateSelesai")
}