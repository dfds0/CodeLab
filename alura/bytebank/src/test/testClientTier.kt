import model.client.Client
import model.client.ClientTierA
import model.client.ClientTierB

fun testClientTier() {
    val clientTierA = ClientTierA("Tier A", 456)
    val clientTierB = ClientTierB("Tier B", 789)

    clientTierA.addBalance(100.0)
    clientTierB.addBalance(100.0)

    clientTierA.removeBalance(10.0)
    clientTierB.removeBalance(10.0)

    println("Klient ${clientTierA.name}-${clientTierA.account}: Saldo ${clientTierA.balance}")
    println("Klient ${clientTierB.name}-${clientTierB.account}: Saldo ${clientTierB.balance}")
    println("")

}