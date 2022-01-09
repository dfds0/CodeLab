fun main(args: Array<String>) {
    val mapA = mapOf(Pair(1, 20.0), Pair(2, 34.0), Pair(3, 50.0))
    val mapB = mutableMapOf(1 to 20.0, 2 to 34.0, 3 to 50.0)

    println(mapA)
    println(mapB)

    for (it: Map.Entry<Int, Double> in mapB) {
        println("${it.key} - ${it.value}")
    }

    mapB[4] = 70.0
    mapB.put(5, 80.0)
    mapB[1] = 100.0
    mapB.put(3, 55.5)

    mapB.putIfAbsent(6, 200.0)
    mapB.putIfAbsent(6, 2.0)

    println(mapB)

    mapB.remove(6)
    mapB.remove(3, 44.44)
    mapB.remove(1, 100.0)

    println(mapB)
}