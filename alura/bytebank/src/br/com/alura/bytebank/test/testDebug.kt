package br.com.alura.bytebank.test

import br.com.alura.bytebank.exception.NoBalanceException

fun testDebug() {
    println("\n### testDebug")

    function1()
    function4()
    function5()
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

fun function4() {
    println("- function 4 start")

    val value10 = 10
    val value0 = 0
    val value1 = 1
    val value2 = 2

    val valueX: Int? = try {
        value10 / value0
    } catch (exception: ArithmeticException) {
        //exception.printStackTrace()
        println(exception.message)
        null
    }

    val valueY: Int? = try {
        value10/value1
    } catch (exception: ArithmeticException) {
        //exception.printStackTrace()
        println(exception.message)
        null
    }

    val valueZ: Int? = if(value10%value2==value0) {
        value1
    } else {
        value2
    }

    println("-- valueX = $valueX")
    println("-- valueY = $valueY")
    println("-- valueZ = $valueZ")

    println("- function 4 end")
}

fun function5(){
    println("- function 5 start")
    try {
        function6()
    } catch (exception: NoBalanceException) {
        println(exception.message)
    }
    println("- function 5 end")
}

fun function6(){
    throw NoBalanceException()
}