data class Scp(val name: String, var level : Int, val type: Type)
enum class Type() { SAFE, EUCLID, KETER }

fun main() {
    val scpA = Scp("A", 1, Type.SAFE)
    val scpB = Scp("B", 2, Type.EUCLID)

    val scpB1 = scpB.copy()
    val scpB2 = scpB.copy(type = Type.KETER)

    println("A == B  : ${scpA == scpB}")
    println("B == B1 : ${scpB == scpB1}")
    println("B == B2 : ${scpB == scpB2}")
    println("B1 == B2: ${scpB1 == scpB2}")
}