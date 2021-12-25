package br.com.alura.bytebank.model.client

import br.com.alura.bytebank.exception.NoAuthorizedException
import br.com.alura.bytebank.exception.NoBalanceException
import br.com.alura.bytebank.model.employee.Authentication

class Account(
    var client: Client,
    var number: Int
) : Authentication {
    var amount = 0.0
        protected set

    companion object Summary {
        var accounts = 0
            private set
    }

    init {
        accounts++
    }

    fun move(amount: Double, password: String) {
        if (amount < 0) {
            throw NoBalanceException()
        }
        if (!auth(password)) {
            throw NoAuthorizedException()
        }
        this.amount += amount
    }

    override fun auth(password: String): Boolean {
        return this.client.auth(password)
    }

}