package main.lamda.first

import kotlin.concurrent.thread

fun postoneComputation(delay: Long, computation: () -> Unit) {
  thread {
    Thread.sleep(delay)
    computation()
  }
}


fun main(args: Array<String>) {

  var i = 0
  postoneComputation(5000) { println(42) }
  while (i < 100) {
    Thread.sleep(1000)
    println(". . . ")
    i++
  }

}