package test.kotlin.lamda.second

import main.lamda.second.Example.sum
import main.lamda.second.Example.twoAndThree


object Example {

  val sum = { x: Int, y: Int -> x + y }
  val action = { println(52) }

  //function accept another function
  fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println(result)
  }
}

fun main(args: Array<String>) {
  println(sum(10, 12))

  //forwarding lamda into function
  twoAndThree { a, b -> a * b }
  twoAndThree { a, b -> a - b }

}



