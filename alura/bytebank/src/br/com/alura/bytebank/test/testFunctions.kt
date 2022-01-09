package br.com.alura.bytebank.test

fun testFunctions() {
    println("\n\n### testFunctions")

    val _functionA: () -> Unit = ::functionA
    println(_functionA)
    println(_functionA())

    val _classA: () -> Unit = ::functionA
    println(_classA)
    println(_classA())

    val _lambdaA: () -> Unit = {
        println("lambda.invoke")
    }
    println(_lambdaA)
    println(_lambdaA())

    val _annonA: () -> Unit = fun() {
        println("annon.invoke")
    }
    println(_annonA)
    println(_annonA())

    println("\n")

    val _functionB = ::functionB
    println(_functionB)
    println(_functionB(1, 2))

    val _classB: (Int, Int) -> Int = ::functionB
    println(_classB)
    println(_classB(1, 2))

    val _lambdaB: (Int, Int) -> Int = { a, b ->
        println("lambda.invoke")
        a + b
    }
    println(_lambdaB)
    println(_lambdaB(1, 2))

    val _lambdaBB = { a: Int, b: Int ->
        println("lambda.invoke")
        a + b
    }
    println(_lambdaBB)
    println(_lambdaBB(1, 2))

    val _annonB = fun(a: Int, b: Int): Int {
        println("annon.invoke")
        return a + b
    }
    println(_annonB)
    println(_annonB(1, 2))

    println("\n")

    val operatorA: (Double) -> Double = lambda@{
        if (it > 1000.0) {
            return@lambda it + 50.0
        }
        return@lambda it + 100.0
    }
    println(operatorA(1100.0))
    println(operatorA(1000.0))
    println(operatorA(100.0))

    val operatorB: (Double) -> Double = fun (value): Double {
        if (value > 1000.0) {
            return  value + 50.0
        }
        return value + 100.0
    }

    println(operatorA(1101.0))
    println(operatorA(1001.0))
    println(operatorA(101.0))
}

fun functionA() {}

fun functionB(a: Int, b: Int): Int {
    return a + b
}

class classA : () -> Unit {
    override fun invoke() {
        println("classA.invoke")
    }
}

class classB : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
        println("classB.invoke")
        return p1 + p2
    }
}