package main.constructor

fun main(args: Array<String>) {
  val person = Person("Pavel", "asasd")
  println(person.fullName)


  val employee = Employee("Pavel", "asasd", "2134234")
  employee.info()
}