fun main() {
    println("Witamy w ByteBank!")

    test_client()
}

class Client {
    var name = ""
    var account = 0
    var balance = 0.0
}

fun check_balance(balance: Double) {
    when {
        balance > 0.0 -> println("- Saldo dodatnie")
        balance < 0.0 -> println("- Saldo ujemne")
        else -> println("- saldo neutralna")
    }
}

fun transfer(from: Client, value: Double, to: Client) {
    if (from.balance >= value) {
        from.balance -= value
        to.balance += value

        println("-- $value od klienta ${from.account}, do klienta ${to.account}")
    }
}

fun test_client() {
    for (index in 100 downTo 1 step 5) {
        println("")

        if (index < 15) {
            break
        }

        val client = Client()

        client.name = "Klient$index"
        client.account = 9000000 + index
        client.balance += 100 + index

        println("Klient: ${client.name} - #${client.account}")
        println("Bilans konta: ${client.balance}")

        check_balance(client.balance)
    }
}