package br.com.alura.bytebank.test

fun testDebug() {
    println("\n### testDebug")

    function1()
}

fun function1() {
    println("- function 1 start")
    function2()
    println("- function 1 end")
}

fun function2() {
    println("- function 2 start")
    function3()
    println("- function 2 end")
}

fun function3() {
    println("- function 3 start")
    for (index in 1..5) {
        println("Index: $index")
    }
    println("- function 3 end")
}