fun main(args: Array<String>) {
    val mapA = mapOf(Pair(1, 20.0), Pair(2, 34.0), Pair(3, 50.0))
    val mapB = mutableMapOf(1 to 20.0, 2 to 34.0, 3 to 50.0)

    println(mapA)
    println(mapB)

    println()
    for (it: Map.Entry<Int, Double> in mapB) {
        println("${it.key} - ${it.value}")
    }

    mapB[4] = 70.0
    mapB.put(5, 80.0)
    mapB[1] = 100.0
    mapB.put(3, 55.5)

    mapB.putIfAbsent(6, 200.0)
    mapB.putIfAbsent(6, 2.0)

    println()
    println(mapB)

    mapB.remove(6)
    mapB.remove(3, 44.44)
    mapB.remove(1, 100.0)

    println()
    println(mapB)

    val _a = mapB.getValue(3)
    val _b = mapB.getValue(5)
    val _c = mapB.getOrElse(0) { "Not Found!" }
    val _d = mapB.getOrDefault(9, -1.0)

    println()
    println(" a = $_a, b = $_b, c = $_c, d = $_d")

    println()
    println(mapB.keys)
    println(mapB.values)

    val mapC = mapB.filter { (key, value) ->
        key % 2 == 1 && value > 50.0
    }

    println()
    println(mapC)

    val mapD = mapC + mapOf(7 to 88.0, 8 to 14.0)

    println()
    println(mapD)

    val mapE = mapD - mapOf(6 to 6.6)
    val mapF = mapE - mapOf(7 to 88.0)

    println()
    println(mapE)
    println(mapF)
}