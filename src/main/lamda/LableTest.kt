package main.lamda

import main.lamda.first.Person

fun main(args: Array<String>) {
  val people = listOf(Person("Bob", 23), Person("Alice", 23), Person("Alb", 23))
  lookForAlice(people)
  lookForAliceLable(people)
}


fun lookForAlice(people: List<Person>) {
  /**
   * return from first inner function (anonym)
   */
  people.forEach(fun(person) {
    if (person.name == "Alice") return
    println("${person.name} is not Alice")
  })
  println("Alice might be somewhere")
}


fun lookForAliceLable(people: List<Person>) {
  /**
   * return from lamda function forEach into outer
   */
  people.forEach {
    if (it.name == "Alice") return@forEach
    println("${it.name} is not Alice")
  }
  println("Alice might be somewhere")
}