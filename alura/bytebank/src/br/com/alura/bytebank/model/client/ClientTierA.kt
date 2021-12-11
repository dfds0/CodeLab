package br.com.alura.bytebank.model.client

class ClientTierA(name: String, account: Int) : Client(name, account) {

    override fun removeBalance(value: Double) {
        if (this.balance >= value) {
            this.balance -= (value + 0.1)
        }
    }

}