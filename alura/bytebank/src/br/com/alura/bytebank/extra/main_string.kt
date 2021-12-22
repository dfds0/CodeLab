package br.com.alura.bytebank.extra

fun main() {
    var a = "string"
    var b = a

    b = "new string"

    println(a)
    println(b)

    for (c in b) {
        print(c)
    }
    print("\n")

    var d = b.substring(4)

    println(d)
}