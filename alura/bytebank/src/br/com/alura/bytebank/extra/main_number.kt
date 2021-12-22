package br.com.alura.bytebank.extra

fun main() {
    val a: Int = 15
    val b: Double = 14.5

    checkNumber(a)
    checkNumber(b)

    println("cast number: " + a.toDouble())
    println("cast number: " + b.toLong())
}

fun checkNumber(value: Number) {
    println("check number: $value")
}