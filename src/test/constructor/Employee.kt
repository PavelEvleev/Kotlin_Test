package test.constructor

class Employee(
        name: String,
        secondName: String,
        private val phone: String
) : Person(name, secondName) {

    fun info() {
        println("$fullName phone: $phone")
    }

}