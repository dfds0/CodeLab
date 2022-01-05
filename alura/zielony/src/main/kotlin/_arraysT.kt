import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val arrayA = Array<BigDecimal>(5) { BigDecimal.ZERO }

    arrayA[0] = "1500.55".toBigDecimal()
    arrayA[1] = "2000.0".toBigDecimal()

    println(arrayA.contentToString())

    val arrayB = toArrayBigDecimal("1500.55", "2000.0", "5000.00", "10000.0")

    println(arrayB.contentToString())

    val bonus = "1.1".toBigDecimal()
    val target = "5000".toBigDecimal()
    val plus = "500".toBigDecimal()

    val arrayB10 = arrayB.map { value ->
        if (value < target) {
            value + plus
        } else {
            (value * bonus).setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()

    println(arrayB10.contentToString())

    val sumAll1 = arrayB10.sumAll()
    println("Sum all 1: $sumAll1")

    val amount = 6.toBigDecimal()
    val sumAll6 = arrayB10.fold(sumAll1) { acc, value ->
        ((acc + value) * amount).setScale(2, RoundingMode.UP)
    }
    println("Sum all 6: $sumAll6")

    val averageLast3 = arrayB10.sorted().takeLast(3).toTypedArray().average()
    println("Average last 3: $averageLast3")

    val averageFirst3 = arrayB10.sorted().take(3).toTypedArray().average()
    println("Average first 3: $averageFirst3")
}

fun toArrayBigDecimal(vararg values: String): Array<BigDecimal> {
    return Array(values.size) { index ->
        values[index].toBigDecimal()
    }
}

fun Array<BigDecimal>.sumAll(): BigDecimal {
    return this.reduce { acc, value ->
        acc + value
    }
}

fun Array<BigDecimal>.average(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.sumAll() / this.size.toBigDecimal()
    }
}