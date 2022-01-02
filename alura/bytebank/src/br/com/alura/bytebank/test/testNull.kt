package br.com.alura.bytebank.test

import br.com.alura.bytebank.model.client.Address
import br.com.alura.bytebank.model.client.Client
import java.lang.NullPointerException

fun testNull() {
    println("\n### testNull")

    var clientNull: Client? = null
    try {
        var address = clientNull!!.address
        println(" -- Address 1: $address")
    } catch (exception: NullPointerException) {
        println(" -- Address 1: ${exception.javaClass.name}")
    }

    var clientSafeCall: Client? = null
    var address = clientSafeCall?.address
    println(" -- Address 2: $address")

    var clientLet: Client? = null
    clientLet.let { address ->
        println(" -- Address 3: $address")
    }

    var clientSafeCallLet: Client? = null
    clientSafeCallLet?.let { address ->
        println(" -- Address 4: $address")
    }

    var clientElvis: Client? = null
    print(" -- Address 5: ${ clientElvis?.address ?: " /empty/"}")
}