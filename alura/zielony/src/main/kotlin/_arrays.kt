
fun main() {
    val intsA = IntArray(4)

    intsA[0] = 78
    intsA[1] = 56
    intsA[2] = 12
    intsA[3] = 28

    var maxA = 0
    for (int in intsA) {
        if (int > maxA) {
            maxA = int
        }
    }

    // MAX
    println("Max $maxA")

    val intsB = intArrayOf(75, 55, 57, 61, 15, 56)

    var minB = Int.MAX_VALUE
    intsB.forEach { int ->
        if (int < minB) {
            minB = int
        }
    }

    // MIN
    println("Min $minB")

    val doublesA = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 1000.0)

    val bonusA = 1.1
    for (index in doublesA.indices) {
        doublesA[index] = doublesA[index] * bonusA
    }

    // INDEX
    println(doublesA.contentToString())

    val doublesB = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 1000.0)

    val bonusB = 1.1
    doublesB.forEachIndexed { index, double ->
        doublesB[index] = double * bonusB
    }

    // INDEX
    println(doublesB.contentToString())
}