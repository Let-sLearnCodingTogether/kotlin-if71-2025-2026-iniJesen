package oop

class TranskripNilai {
    val list : List<Char> by lazy {
        println("List di akses")
        listOf('A', 'B', 'C')
    }
}

fun main() {

}