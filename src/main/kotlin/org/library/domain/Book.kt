package main.kotlin.org.library.domain

data class Book(
    val title: String,
    var author: String,
    val rating: String?
)

fun Book.getRating() : String {
    return this.rating ?: "unrated"
}