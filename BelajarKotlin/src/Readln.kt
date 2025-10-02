fun main() {
    print("nama : ")
    val name = readln()

    print("umur : ")
    val ageInput = readln()
    val age = ageInput.toIntOrNull()

    if (age != null) {
        println("\nnama saya $name")
        println("umur saya $age")
    } else {
        println("umur tidak valid")
    }
}