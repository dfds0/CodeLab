package br.com.alura.bytebank.model.tier

import br.com.alura.bytebank.model.employee.Authentication

class ClientTierC(
    name: String,
    account: Int,
    private val password: String
) : ClientTier(
    name, account
), Authentication {

    override fun removeBalance(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }
    }

    override fun auth(password: String): Boolean {
        return password == this.password
    }
}