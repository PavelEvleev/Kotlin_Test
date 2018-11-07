package test.properties.set

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".
            """.trimIndent())
            field = value
        }

}

fun main(args: Array<String>) {
    val user = User("Pavel")

    user.address = "dvvsa"
}