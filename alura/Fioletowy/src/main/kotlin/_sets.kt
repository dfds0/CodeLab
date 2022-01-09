fun main(args: Array<String>) {
    val namesA: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val namesB: List<String> = listOf("Alex", "Paulo", "Maria")

    val namesC: MutableList<String> = mutableListOf()

    namesC.addAll(namesA)
    namesC.addAll(namesB)

    println(namesC)

    val namesD: Set<String> = namesA + namesB
    println(namesD)

    val namesE: Set<String> = namesA - namesB
    println(namesE)

    val namesF: Set<String> = namesA intersect namesB
    println(namesF)
}