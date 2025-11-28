package operatorOverloadingAndConvention

data class MANA(val current: Int, val max: Int) {

    operator fun plus(other: MANA): MANA {
        val newMax = maxOf(this.max, other.max)
        val newCurrent = minOf(this.current + other.current, newMax)
        return MANA(newCurrent, newMax)
    }

    operator fun inc(): MANA {
        val newCurrent = minOf(this.current + 10, this.max)
        return MANA(newCurrent, this.max)
    }


    operator fun minus(value: Int): MANA {
        val newCurrent = maxOf(this.current - value, 0)
        return MANA(newCurrent, this.max)
    }
}

fun main() {
    var mana1 = MANA(current = 50, max = 100)
    val mana2 = MANA(current = 20, max = 50)

    val total = mana1 + mana2
    println(total)
    mana1++
    println(mana1)
    val minus = mana1 - 30
    println(minus)
}