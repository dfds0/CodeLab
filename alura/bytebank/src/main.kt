fun main() {
    println("Witamy w ByteBank!")

    testClient()
}

class Client(var name: String, var account: Int, var balance: Double) {

    private fun changeBalance(balance: Double) {
        this.balance += balance
    }

    fun checkBalance() {
        when {
            this.balance > 0.0 -> println("- Saldo dodatnie")
            this.balance < 0.0 -> println("- Saldo ujemne")
            else -> println("- saldo neutralna")
        }
    }

    fun moveBalance(value: Double, client: Client) {
        if (this.balance >= value) {
            this.changeBalance(-value)
            client.changeBalance(value)

            println("-- przeniesiony: $value od klienta ${this.account}, do klienta ${client.account}")
        }
    }
}

fun testClient() {
    var previousClient: Client? = null
    for (index in 100 downTo 1 step 5) {
        println("")

        if (index < 15) {
            break
        }

        val client = Client("Klient$index", 9000000 + index, (100 + index).toDouble())

        println("Klient: ${client.name} - #${client.account}")
        println("Bilans konta: ${client.balance}")

        client.checkBalance()

        previousClient?.moveBalance((10 + index).toDouble(), client)

        previousClient = client
    }
}