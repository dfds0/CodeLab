fun main() {
    println("Witamy w ByteBank!")

    testClient()
}

class Client(val name: String, val account: Int) {
    var balance = 0.0
        private set

    fun changeBalance(balance: Double) {
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

        val client = Client(name = "Klient$index", account = 9000000 + index)

        println("Klient: ${client.name} - #${client.account}")
        println("Bilans konta: ${client.balance}")

        client.changeBalance((100 + index).toDouble())
        client.checkBalance()

        previousClient?.moveBalance((10 + index).toDouble(), client)

        previousClient = client
    }
}