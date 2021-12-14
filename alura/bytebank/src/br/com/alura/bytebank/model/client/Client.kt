package br.com.alura.bytebank.model.client

import br.com.alura.bytebank.model.employee.Authentication

class Client(
    var name: String,
    val document: String,
    var address: Address = Address(),
    private val password: String
) : Authentication {

    override fun auth(password: String): Boolean {
        return this.password == password
    }

}