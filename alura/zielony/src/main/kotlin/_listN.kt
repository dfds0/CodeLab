import models.Book

fun main() {

    val book1 = Book(title = "Niebieski", owner = "Owner 1", yearPublish = 1900, brand = "A")
    val book2 = Book(title = "Zółty", owner = "Owner 2", yearPublish = 1990, brand = "B")
    val book3 = Book(title = "Czerwony", owner = "Owner 3", yearPublish = 2022)
    val book4 = Book(title = "Zielony", owner = "Owner 4", yearPublish = 2220)
    val book5 = Book(title = "Pomaranczowy", owner = "Owner 5", yearPublish = 1111)
    val book6 = Book(title = "Fioletowy", owner = "Owner 6", yearPublish = 1567)

    val books: MutableList<Book?> = mutableListOf(book1, book2, null, book3, book4, null, book5, book6)

    books.printAsMutableN()
    books.sortedBy { it?.title }.printAsListN()

    books.filterNotNull().filter { it.yearPublish >= 1990L }.printAsListN()
    books.filter { it != null && it.yearPublish >= 1990L }.printAsListN()

    books.filterNotNull().groupBy { it.brand ?: "/U/" }.forEach { (brand, books) ->
        println(" Brand: $brand: ${books.joinToString { it.title }}")
    }
}

fun List<Book?>.printAsListN() {
    val value = this.joinToString(separator = "\n") {
        " - ${it?.title} by ${it?.owner}"
    }

    println("Books:")
    println(value)
    println("")
}

fun MutableList<Book?>.printAsMutableN() {
    val value = this.joinToString(separator = "\n") {
        " - ${it?.title} by ${it?.owner}"
    }

    println("Books:")
    println(value)
    println("")
}