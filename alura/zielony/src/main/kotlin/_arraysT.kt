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
}

fun toArrayBigDecimal(vararg values: String): Array<BigDecimal> {
    return Array(values.size) { index ->
        values[index].toBigDecimal()
    }
}