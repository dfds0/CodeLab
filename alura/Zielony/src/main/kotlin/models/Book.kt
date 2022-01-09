package models

data class Book(
    val title: String,
    val owner: String,
    val yearPublish: Long,
    val brand: String? = null
) : Comparable<Book> {
    override fun compareTo(other: Book): Int {
        return this.yearPublish.compareTo(other.yearPublish)
    }
}
