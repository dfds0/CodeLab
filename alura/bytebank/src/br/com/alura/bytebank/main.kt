import br.com.alura.bytebank.test.*

fun main() {
    println("Witamy w ByteBank!")

    testClient()
    testClientTier()
    testEmployee()
    testSystemInternal()
    testObject()
    testDebug()
    testException()
    testNull()
    testFunctions()
    testLet()
    testWith()
    testRun()
    testHOF()

    // .let     - it    -> return lambda        // Em objetos não nulos
    // .run     - this  -> return lambda        // Configuração e computação de resultado
    // .with    - this  -> return lambda        // Com objeto..
    // .apply   - this  -> return object        // Configuração de objeto
    // .also    - this  -> return object        // Executa sem afetar o programa
}