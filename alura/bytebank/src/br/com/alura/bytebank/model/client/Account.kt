package br.com.alura.bytebank.model.client

class Account(
    var client: Client,
    var number: Int
) {
    var amount = 0.0
        protected set

    fun move(amount: Double) {
        if (amount > 0) {
            this.amount += amount
        }
    }

}