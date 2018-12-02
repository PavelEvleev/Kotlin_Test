package main.lamda.second


data class Person(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String?
)

class ContactListFilter {
  var prefix: String = ""
  var onlyWithOnlineNumber: Boolean = false

  fun getPredicate(): (Person) -> Boolean {
    val startWithPrefix = { p: Person -> p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix) }
    if (!onlyWithOnlineNumber) {
      return startWithPrefix
    }
    return { startWithPrefix(it) && it.phoneNumber != null }
  }
}

fun main(args: Array<String>) {
  val contacts = listOf(
      Person("Dmitry", "Jemenov", "124-125"),
      Person("Svetlana", "Isakova", null))

  val contactListFilter = ContactListFilter().apply {
    prefix = "Dm"
    onlyWithOnlineNumber = true
  }

  println(contacts.filter(contactListFilter.getPredicate()))
}