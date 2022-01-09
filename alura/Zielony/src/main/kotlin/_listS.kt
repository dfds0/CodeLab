import models.Book
import models.Box

fun main() {

    val books = mutableListOf<Book>(
        Book(title = "Polska", owner = "Owner 1", yearPublish = 2023),
        Book(title = "Ja mowi po Polska", owner = "Owner 2", yearPublish = 1023)
    )

    val box = Box(type = "Polska", books = books)

    val sort1 = box.sortByOwner()
    val sort2 = box.sortByYear()

    sort1.printAsList()
    sort2.printAsList()
}