package main.kotlin.org.library.domain

import main.kotlin.org.library.domain.Book

data class User (
    val name: String,
    val onLoan: List<Book>,
    var borrowed: List<Book>
)