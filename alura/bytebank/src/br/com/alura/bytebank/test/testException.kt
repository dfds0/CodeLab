package br.com.alura.bytebank.test

import br.com.alura.bytebank.exception.NoAuthorizedException
import br.com.alura.bytebank.exception.NoBalanceException
import br.com.alura.bytebank.model.client.Account
import br.com.alura.bytebank.model.client.Address
import br.com.alura.bytebank.model.client.Client

fun testException() {
    println("\n### testException")

    val address = Address()
    val client = Client("Name", "Document", address, "123")
    val account = Account(client, 123)

    println("- move +10 #123 start")
    sandbox(account, 10.0, "123")
    println("- move +10 #123 end")

    println("- move +10 #456 start")
    sandbox(account, 10.0, "456")
    println("- move +10 #456 end")

    println("- move -11 #123 start")
    sandbox(account, -11.0, "123")
    println("- move -11 #123 end")

    println("- move +10 #123")
    sandbox(account, 10.0, "123")
    println("- move +10 #123 end")
}

fun sandbox(account: Account, amount: Double, password: String) {
    try {
        account.move(amount, password)
    } catch (exception: NoBalanceException) {
        println("   " + exception.message)
    } catch (exception: NoAuthorizedException) {
        println("   " + exception.message)
    } catch (exception: Exception) {
        exception.printStackTrace()
    }
}