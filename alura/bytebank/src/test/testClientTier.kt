import model.client.ClientTierA
import model.client.ClientTierB
import model.client.ClientTierC

fun testClientTier() {
    val clientTierA = ClientTierA("Tier A", 456)
    val clientTierB = ClientTierB("Tier B", 789)
    val clientTierC = ClientTierC("Tier C", 123, "123")

    clientTierA.addBalance(100.0)
    clientTierB.addBalance(100.0)
    clientTierC.addBalance(100.0)

    clientTierA.removeBalance(10.0)
    clientTierB.removeBalance(10.0)
    clientTierC.removeBalance(10.0)

    println("Klient ${clientTierA.name}-${clientTierA.account}: Saldo ${clientTierA.balance}")
    println("Klient ${clientTierB.name}-${clientTierB.account}: Saldo ${clientTierB.balance}")
    println("Klient ${clientTierC.name}-${clientTierC.account}: Saldo ${clientTierC.balance}")
    println("")

}