import java.util.*
import kotlin.random.Random.Default.nextInt

fun main() {
    println("Witamy w ByteBank!")

    for (index in 100 downTo 1 step 5) {
        println("")

        if (index < 15) {
            break
        }

        val title = "Klient$index"
        val account = 9000000 + index
        var balance = 0.0

        balance += 100 + index

        println("Klient: $title - #$account")
        println("Bilans konta: $balance")

        check_balance(balance)
    }
}

fun check_balance(balance: Double) {
    when {
        balance > 0.0 -> println("- Saldo dodatnie")
        balance < 0.0 -> println("- Saldo ujemne")
        else -> println("- saldo neutralna")
    }
}