fun operation(a: Int, b: Int, operator: String): Int {
    println("Start operation...")

    var c: Int = 0
    when (operator) {
        "+" -> c = a+b
        "-" -> c = a-b
        "*" -> c = a*b
        "/" -> c = a/b
    }

    println("Evaluate: $a $operator $b = $c")

    return a+b
}

fun main() {
    operation(11, 5, "+")
    operation(9, 18, "-")
    operation(8, 4, "*")
    operation(1603, 10032021, "/")
}