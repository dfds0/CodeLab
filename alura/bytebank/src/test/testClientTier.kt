import model.Client
import model.ClientTierA
import model.ClientTierB

fun testClientTier() {
    val clientTierX = Client("Tier X", 123)
    val clientTierA = ClientTierA("Tier A", 456)
    val clientTierB = ClientTierB("Tier B", 789)

    clientTierX.addBalance(100.0)
    clientTierA.addBalance(100.0)
    clientTierB.addBalance(100.0)

    clientTierX.removeBalance(10.0)
    clientTierA.removeBalance(10.0)
    clientTierB.removeBalance(10.0)

    println("Klient ${clientTierX.name}-${clientTierX.account}: Saldo ${clientTierX.balance}")
    println("Klient ${clientTierA.name}-${clientTierA.account}: Saldo ${clientTierA.balance}")
    println("Klient ${clientTierB.name}-${clientTierB.account}: Saldo ${clientTierB.balance}")
    println("")

}