package test.properties.set

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val counter = LengthCounter()

    counter.addWord("Philipins")
    counter.addWord("Pasha")
    print(counter.counter)
}