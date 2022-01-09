import models.Book

fun main() {

    val book1 = Book(title = "Niebieski", owner = "Owner 1", yearPublish = 1900, brand = "A")
    val book2 = Book(title = "Zółty", owner = "Owner 2", yearPublish = 1990, brand = "B")
    val book3 = Book(title = "Czerwony", owner = "Owner 3", yearPublish = 2022)
    val book4 = Book(title = "Zielony", owner = "Owner 4", yearPublish = 2220)

    val books: MutableList<Book> = mutableListOf(book1, book2, book3, book4)

    books.add(
        Book(
            title = "Pomaranczowy",
            owner = "Owner 5",
            yearPublish = 1111
        )
    )

    books.add(
        Book(
            title = "Fioletowy",
            owner = "Owner 6",
            yearPublish = 1567
        )
    )

    books.printAsMutable()

    books.remove(book2)

    books.printAsMutable()

    books.sorted().printAsList()

    books.sortedBy { it.title }.printAsList()

    books.filter { it.yearPublish >= 1990L }.printAsList()
}

fun List<Book>.printAsList() {
    val value = this.joinToString(separator = "\n") {
        " - ${it.title} by ${it.owner}"
    }

    println("Books:")
    println(value)
    println("")
}

fun MutableList<Book>.printAsMutable() {
    val value = this.joinToString(separator = "\n") {
        " - ${it.title} by ${it.owner}"
    }

    println("Books:")
    println(value)
    println("")
}