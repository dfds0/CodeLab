package br.com.alura.bytebank.model.tier

class ClientTierA(name: String, account: Int) : ClientTier(name, account) {

    override fun removeBalance(value: Double) {
        if (this.balance >= value) {
            this.balance -= (value + 0.1)
        }
    }

}