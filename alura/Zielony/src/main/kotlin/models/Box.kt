package models

data class Box(
    val type: String,
    val books: MutableList<Book>
) {
    fun sortByOwner(): List<Book> {
        return books.sortedBy { it.owner }
    }

    fun sortByYear(): List<Book> {
        return books.sortedBy { it.yearPublish }
    }
}