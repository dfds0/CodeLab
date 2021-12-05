import model.Client

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

        client.addBalance((100 + index).toDouble())
        client.checkBalance()

        previousClient?.moveBalance((10 + index).toDouble(), client)

        previousClient = client
    }
}