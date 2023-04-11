package main.kotlin.org.library

import main.kotlin.org.library.domain.Book

fun main(args: Array<String>) {
    val harryPotter1 = Book("Harry Potter and the Philosopher's Stone", "JK Rowling")
    println(harryPotter1)
    println(harryPotter1.title)
    harryPotter1.author = "April"
    println(harryPotter1)

    val harryPotter2 = harryPotter1.copy()
    val equals = harryPotter1.equals(harryPotter2)
    println(equals)
}