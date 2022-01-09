fun main() {
    // Range A
    val rangeA: IntRange = 1.rangeTo(10)
    for (range in rangeA) {
        print("$range ")
    }

    println("\n--")

    // Range B
    val rangeB = 0..100 step 2
    for (range in rangeB) {
        print("$range ")
    }

    println("\n--")

    // Range C
    val rangeC = 2.until(100) step 2
    for (range in rangeC) {
        print("$range")
    }

    println("\n--")

    // Range D
    val rangeD = 100 downTo 0 step 3
    rangeD.forEach { print("$it") }

    println("\n--")

    // Range E
    val rangeE = 1500.0..5000.0
    val targetDouble = 4000.0
    if (targetDouble in rangeE) {
        print("$targetDouble is IN")
    } else {
        print("$targetDouble is OUT")
    }

    println("\n--")

    // Range F
    val rangeF = 'a'..'z'
    val targetChar = 'K'
    if (targetChar in rangeF) {
        print("$targetChar is IN")
    } else {
        print("$targetChar is OUT")
    }

    println("\n--")

    // Range G
    val rangeG = intArrayOf(10, 12, 18, 33, 40, 67)
    val maxG = rangeG.maxOrNull()
    val minG = rangeG.minOrNull()
    val averageG = rangeG.average()
    println("Max is $maxG, Min is $minG and Average $averageG")

    val isAll = rangeG.all { it > 18 }
    println("All > 18 ? $isAll")

    val isAny = rangeG.any { it > 33 }
    println("Any > 33 ? $isAny")

    val filter = rangeG.filter { it > 20 }
    println("All > 20 ? $filter")

    val find = rangeG.find { it == 67 }
    println("Find = 67 ? $find")
}