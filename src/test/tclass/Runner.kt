package test.tclass

fun main(args: Array<String>) {
    val button = Button()
    println("Button")
    button.showOff()
    button.setFocus(true)
    button.click()

    val childRichButton = ChildRichButton()
    println()
    println("Child")
    childRichButton.showOff()
    childRichButton.animate()
    childRichButton.click()
    childRichButton.disable()

}