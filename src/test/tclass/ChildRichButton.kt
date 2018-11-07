package test.tclass

class ChildRichButton : RichButton() {

//    Can't be override, because it's final by default
//    override fun disable() {}


    override fun animate() {
        println("ChildMethod animate")
        super.animate()
    }

}