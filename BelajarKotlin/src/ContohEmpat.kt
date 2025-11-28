package operatorOverloadingAndConvention

data class GameLevel(val number : Int) : Comparable<GameLevel>{
    override fun compareTo(other: GameLevel): Int {
        return number - other.number
    }

    operator fun rangeTo(other: GameLevel) : IntRange{
        return number..other.number
    }
}

fun main() {
    val level1 = GameLevel(1)
    val level5 = GameLevel(5)

    val rangeLevel = level1..level5
    println(rangeLevel) //1...5
    //1, 2, 3, 4, 5
}