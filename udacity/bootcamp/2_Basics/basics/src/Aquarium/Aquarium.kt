package Aquarium

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    var volume: Int
        get() = width * height * length / 1000
        set(value) { height = value * 1000 / (width * length)}
    var water = 0.9 * volume

    constructor(nFish: Int): this() {
        val water: Int = nFish * 2000  // cc
        val tank: Double = 0.2 * water
        height = (tank / (length * width)).toInt()
    }

    fun print() {
        println("A ${length}x${width}x${height}cm (${volume}L) aquarium")
    }
}