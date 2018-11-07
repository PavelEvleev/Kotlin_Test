package test.tclass

open class RichButton : Clickable {

    fun disable() = println("Disable")

    open fun animate() = println("Animte")

    final override fun click() {
        println("RichButton click")
    }
}