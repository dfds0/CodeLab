package br.com.alura.bytebank.test

import br.com.alura.bytebank.model.client.Address

fun testLet() {
    println("\n\n### testLet")

    Address().let {
        println("OBJECT - LET -- $it")
    }
    "String".let {
        println("STRING - LET -- $it")
    }
    0.let {
        println("INT - LET -- $it")
    }

    val value = orderA(1) { "return operator" }
    println(value)

    println("\n")

    val address = Address(-1, "SP", "SP", "BR")
    println(address)

    val _let = address.let {
        it.city
    }.let {
        println(it)
    }.let {
        "end"
    }.let(::println).let {
        "_let"
    }
    println(_let)

    println("\n")

    functionA(1, 2) {
        println(it)
    }

    println("\n")

    Address(state = "SP", city = "SP", location = "BR").apply { this
        "${this.location}"
    }.let {
        println(it)
    }

    Address(state = "SP", city = "SP", location = "BR").run { this
        "${this.location}"
    }.let {
        println(it)
    }

}

fun orderA(value: Int, operator: () -> String) {
    "$value -- $operator()"
}

fun functionA(a: Int, b: Int, result: (Int) -> Unit) {
    println(" -- before")
    result(a + b)
    println(" -- after")
}