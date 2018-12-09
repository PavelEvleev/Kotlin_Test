package test.kotlin.lamda.first

data class Person(val name: String, val age: Int)


fun main(args: Array<String>) {
  val people = listOf(Person("Pavel", 26), Person("Igor", 48))
  println(people.maxBy { it.age })

  val nextAction = ::sendEmail

  people.forEach { nextAction(it, "привет жесть") }

}
