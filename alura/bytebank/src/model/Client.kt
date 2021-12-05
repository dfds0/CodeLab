package model

open class Client(val name: String, val account: Int) {
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

    fun moveBalance(value: Double, client: Client) {
        if (this.balance >= value) {
            this.changeBalance(-value)
            client.changeBalance(value)

            println("-- przeniesiony: $value od klienta ${this.account}, do klienta ${client.account}")
        }
    }

    open fun addBalance(value: Double) {
        this.balance += value
    }

    open fun removeBalance(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }
    }
}