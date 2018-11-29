package main.tclass.dataClass

class OldClient(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is OldClient)
            return false
        return other.name == name && other.postalCode == postalCode
    }

    override fun toString() = "OldClient(name=$name, postalCode=$postalCode)"

    override fun hashCode(): Int {
        return name.hashCode() * 31 + postalCode
    }


}

fun main(args: Array<String>) {
    val client = OldClient("Pavel", 123124)
    val client1 = OldClient("Pavel", 12312)
    println(client == client1)
    println(client)

    println()

    val processed = hashSetOf(OldClient("Masha", 32423))

    println(processed.contains(OldClient("Masha", 32423)))
}