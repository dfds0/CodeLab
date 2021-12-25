import br.com.alura.bytebank.test.testDebug
import br.com.alura.bytebank.test.testException
import br.com.alura.bytebank.test.testObject
import br.com.alura.bytebank.test.testSystemInternal

fun main() {
    println("Witamy w ByteBank!")

    testClient()
    testClientTier()
    testEmployee()
    testSystemInternal()
    testObject()
    testDebug()
    testException()
}