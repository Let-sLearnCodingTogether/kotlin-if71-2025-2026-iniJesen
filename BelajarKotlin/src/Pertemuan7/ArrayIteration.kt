fun main() {
//    val users : Array<String> = arrayOf("User 1", "User 2")
//
//    users.forEach {
//        println("Forech : $it")
//    }
//
//    users.forEach { user ->
//        println("Forech2 : $user")
//    }
//
//    users.forEachIndexed { index, user ->
//        println("Foreach Index : ${index+1} :$user")
//    }
     val ages : Array<Int> = arrayOf(60, 30, 50, 40, 90)

    println("Sum : ${ages.sum()}")
    println("Average : ${ages.average()}")
    println("Max Or Null : ${ages.maxOrNull()}")
    println("Min Or Null : ${ages.minOrNull()}")
    println("Count : ${ages.count()}")

    println("Contain : ${ages.contains(30)}")
    println("Contain : ${ages.contains(55)}")
    println("Index : ${ages.indexOf(40)}")
    println("Any : ${ages.any{it>10}}")
    println("All : ${ages.all{it>45}}")

    println("Ages : ${ages.joinToString()}")
    ages.sort()
    println("Ages sort : ${ages.joinToString()}")
    ages.reverse()
    println("Ages reverse : ${ages.joinToString()}")
    println("Ages slice : ${ages.slice(2..4).joinToString()}")


}