import br.com.alura.bytebank.model.tier.ClientTier
import br.com.alura.bytebank.model.tier.ClientTierA

fun testClient() {
    var previousClient: ClientTier? = null
    for (index in 100 downTo 1 step 5) {
        println("")

        if (index < 15) {
            break
        }

        val client = ClientTierA(name = "Klient$index", account = 9000000 + index)

        println("Klient: ${client.name} - #${client.account}")
        println("Bilans konta: ${client.balance}")

        client.addBalance((100 + index).toDouble())
        client.checkBalance()

        previousClient?.moveBalance((10 + index).toDouble(), client)

        previousClient = client
    }
}