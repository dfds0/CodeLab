package br.com.alura.bytebank.model.tier

abstract class ClientTier(val name: String, val account: Int) {
    var balance = 0.0
        protected set

    private fun changeBalance(balance: Double) {
        this.balance += balance
    }

    fun checkBalance() {
        when {
            this.balance > 0.0 -> println("- Saldo dodatnie")
            this.balance < 0.0 -> println("- Saldo ujemne")
            else -> println("- saldo neutralna")
        }
    }

    fun moveBalance(value: Double, client: ClientTier) {
        if (this.balance >= value) {
            this.changeBalance(-value)
            client.changeBalance(value)

            println("-- przeniesiony: $value od klienta ${this.account}, do klienta ${client.account}")
        }
    }

    open fun addBalance(value: Double) {
        this.balance += value
    }

    abstract fun removeBalance(value: Double)
}