package br.com.alura.bytebank.model.client

class Account(
    var client: Client,
    var number: Int
) {
    var amount = 0.0
        protected set

    companion object Summary {
        var accounts = 0
            private set
    }

    init {
        accounts++
    }

    fun move(amount: Double) {
        if (amount > 0) {
            this.amount += amount
        }
    }

}