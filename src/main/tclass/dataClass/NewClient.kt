package main.tclass.dataClass

data class NewClient(val name: String, val postalCode: Int)


fun main(args: Array<String>) {
    val client = NewClient("Pavel", 123124)
    val client1 = NewClient("Pavel", 123124)
    println(client == client1)
    println(client)

    println()

    val processed = hashSetOf(NewClient("Masha", 32423))

    println(processed.contains(NewClient("Masha", 32423)))
}