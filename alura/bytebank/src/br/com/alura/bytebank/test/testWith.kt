package br.com.alura.bytebank.test

import br.com.alura.bytebank.model.client.Address

fun testWith() {
    println("\n\n### testWith")

    with(Address()) {
        location = "BR"
        number = 123
        city = "SP"
        state = "SP"
    }.let {
        println(it)
    }

}