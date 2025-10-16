package oop

data class GameItem(
    val id: Int,
    val name: String,
    val value: Int,
    val rarity: String
)

fun main() {
    val inventory = mutableListOf<GameItem>()

    val item1 = GameItem(1, "Pedang Besi", 100, "Common")
    val item2 = GameItem(2, "Ramuan Kesehatan", 50, "Common")
    val item3 = GameItem(3, "Jubah Bayangan", 500, "Epic")

    inventory.addAll(listOf(item1, item2, item3))

    val cursedSword = item1.copy(name = "Pedang Besi Terkutuk", value = 250)

    println("Objek Pedang Besi asli: " +
            "\nItem ${item1.id}\n" +
            "${item1.name}\n" +
            "${item1.value}\n" +
            "${item1.rarity}\n")
    println("Objek Pedang Besi Terkutuk: " +
            "\nItem ${cursedSword.id}\n" +
            "${cursedSword.name}\n" +
            "${cursedSword.value}\n" +
            "${cursedSword.rarity}\n")

    println("\nIsi Inventaris:")
    inventory.forEach { println(it) }
}