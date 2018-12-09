package test.kotlin.nullable

fun main(args: Array<String>) {
  println(strLen(null))
  with("Masha") {
    println(length)
    println(toUpperCase())
  }

  for (i in 0.."Masha".length) {
    println("3")
  }
}

private fun strLen(string: String?) = string?.length ?: 0
