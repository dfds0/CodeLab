package br.com.alura.bytebank.test

import br.com.alura.bytebank.model.client.Account
import br.com.alura.bytebank.model.client.Address
import br.com.alura.bytebank.model.client.Client

fun testRun() {
    println("\n\n### testRun")

    Client(name = "Name", document = "Document", address = Address(), password = "Password")
        .let {
            Account(client = it, number = 123)
        }.run {
            move(1000.0, "Password")
            amount * 0.1
        }.let {
            println(it)
        }
}