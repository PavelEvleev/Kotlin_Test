package test.kotlin.properties.delegate

import java.beans.PropertyChangeListener

fun main(args: Array<String>) {
  val p = Person("Pasha", 25, 600)
  p.addPropertyChangeListener(PropertyChangeListener { event ->
    println("Propery ${event.propertyName} changed " +
        "from ${event.oldValue} to ${event.newValue}")
  })

  p.age = 26
  p.salary = 1600
}