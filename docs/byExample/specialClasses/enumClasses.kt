fun main() {
    val state = State.RUNNING
    val msg = when (state) {
        State.IDLE -> "Idlin'"
        State.RUNNING -> "Runnin'"
        State.FINISHED -> "It's finished!"
    }
    println(msg)

    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())    // false
    println(Color.YELLOW.containsRed())  // true
}


enum class State {
    IDLE, RUNNING, FINISHED
}


enum class Color {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}