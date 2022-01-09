package br.com.alura.bytebank.test

fun testFunctions() {
    println("\n\n### testFunctions")

    val _function: () -> Unit = ::functionA

    println(_function)
    println(_function())

    val _classF: () -> Unit = ::functionA

    println(_classF)
    println(_classF())

    val _lambda: () -> Unit = {
        println("lambda.invoke")
    }

    println(_lambda)
    println(_lambda())

    val _annon: () -> Unit = fun() {
        print("lambda.invoke")
    }

    println(_annon)
    println(_annon())
}

fun functionA() {}

class classA : () -> Unit {
    override fun invoke() {
        println("classA.invoke")
    }
}