package Aquarium

// object indicates a class that will only have one instance
object MobyDick {
    fun breach() {}

    fun dive() {}
}


enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}


// sealed classes can only be subclassed within the file they are defined in
sealed class Seal

class CommonSeal: Seal()


class SpottedSeal: Seal()


fun matchSeal(seal: Seal): String {
    return when(seal) {
        is CommonSeal -> "Common"
        is SpottedSeal -> "Spotted"
    }
}