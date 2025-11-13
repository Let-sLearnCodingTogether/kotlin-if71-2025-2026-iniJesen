package nextOOP

interface PaymentMethod{
    fun pay()
}

interface RefundMethod : PaymentMethod{
    fun refund()
}

class Bank : RefundMethod{
    override fun refund(){
        println("Refund")
    }
    override fun pay(){
        println("Pay")
    }
}

fun main() {
    val bankA = Bank()
    bankA.refund()
    bankA.pay()
}