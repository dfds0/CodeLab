package br.com.alura.bytebank.test

fun testHOF() {
    println("\n\n### testHOF")

    operatorA(1, 2, result = { value ->
        println(value)
    })

    operatorB(3, 4, result = {
        println(this)
    })
}

fun operatorA(a: Int, b: Int, result: (Int) -> Unit) {
    println("operatorA - before")
    result(a + b)
    println("operatorA - after")
}

fun operatorB(a: Int, b: Int, result: Int.() -> Unit) {
    println("operatorB - before")
    (a + b).result()
    println("operatorB - after")
}