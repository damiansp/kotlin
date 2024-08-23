package Aquarium

fun main(args: Array<String>) {
    val fish = Fish()
}


internal fun buildAquarium() = Aquarium()


class Aquarium(val width, var height: Int = 40, val length: Int = 100) {
    var volume
        get() = width * height * length / 1000
        set(value) { height = (value * 1000) / (width * length)}
}