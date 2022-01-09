fun main() {

    val orderList = listOf(
        Order(1, 20.0),
        Order(2, 10.09),
        Order(3, 9.0),
        Order(4, 20.22)
    )

    println(orderList)

    val orderMap = orderList.associate {
        Pair(it.number, it)
    }

    val orderMapBy = orderList.associateBy { it.number }

    println()
    println(orderMap)
    println(orderMapBy)

    val orderMapWith = orderList.associateWith { it.value > 10.0 }

    println()
    println(orderMapWith)

    val orderGroupBy = orderList.groupBy { it.value > 20.0 }

    println()
    println(orderGroupBy)
}

class Order(val number: Int, val value: Double) {
    override fun toString(): String {
        return "[$number x $value]"
    }
}