package br.com.alura.bytebank.extra

fun main() {
    val doc1 = Document("123", "cpf")
    val doc2 = Document("123", "cpf")
    val doc3 = Document("456", "cpf")
    val doc4 = doc2.copy()

    println("-")
    println("1==2 ? ${doc1 == doc2}")
    println("1==3 ? ${doc1 == doc3}")
    println("1==4 ? ${doc1 == doc4}")
    println("2==3 ? ${doc2 == doc3}")
    println("2==4 ? ${doc2 == doc4}")
    println("3==4 ? ${doc3 == doc4}")

    val (id, type) = doc3

    println("-")
    println("$id - $type")
}

data class Document(val id: String, val type: String) {
    operator fun component3() = this.id + "?"
}