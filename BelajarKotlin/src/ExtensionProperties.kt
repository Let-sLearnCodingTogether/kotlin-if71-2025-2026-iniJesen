package oop

class UserProfile(val username : String)

val UserProfile.usernameUppercase: String
    get() = this.username.uppercase()

fun main() {
    val user1 = UserProfile("renn")
    println(user1.username)
    println(user1.usernameUppercase)
}