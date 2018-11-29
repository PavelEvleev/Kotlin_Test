package main.constructor

import java.util.*

open class Person(name: String, secondName: String) {

    val fullName: String

    init {
        val time = Date()
        fullName = "$name $secondName $time"
    }
}