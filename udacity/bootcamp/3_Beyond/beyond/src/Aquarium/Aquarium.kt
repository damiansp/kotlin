package Aquarium


fun main(args: Array<String>) {
    val fish = Fish()
}


internal fun buildAquarium() = Aquarium()


open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) { height = value * 1000 / (width * length) }
