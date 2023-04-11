package main.kotlin.org.library

import main.kotlin.org.library.domain.Book
import main.kotlin.org.library.domain.User
import main.kotlin.org.library.domain.getRating

fun main(args: Array<String>) {
    val harryPotter1 = Book("Harry Potter and the Philosopher's Stone", "JK Rowling", null)
    println(harryPotter1)
    println(harryPotter1.title)
    harryPotter1.author = "April"
    println(harryPotter1)
    println(harryPotter1.getRating())

    val harryPotter2 = harryPotter1.copy()
    val equals = harryPotter1.equals(harryPotter2)
    println(equals)

    var april = User("April Selby", arrayListOf(harryPotter1), arrayListOf())
    println(april)
    april.borrowed += harryPotter2
    print(april)

    printObject(harryPotter1)
}

fun printObject(x: Any) {
    if (x is Book) {
        print("book title is: " + x.title)
    } else if (x is User) {
        print ("user name is: " + x.name)
    }
}