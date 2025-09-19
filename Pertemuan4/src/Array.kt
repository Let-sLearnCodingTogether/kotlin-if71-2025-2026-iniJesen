fun main() {
    val users = arrayOf("Ali 1", "Budi 2", "Citra 3")


    println(users[0])
    println(users[1])
    println(users[2])

    users.set(2, "Citra HAHAHA")
    println(users[2])

    println("Jumlah : ${users.size}")
}