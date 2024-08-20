//34567890//34567890//34567890//34567890//34567890//34567890//34567890//34567890
package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = 2 * volumeNeeded
        }
    }

    constructor(): this(true, 9) {
        println("Running secondary constructor")
    }
}


fun makeDefaultFish() = Fish(true, 50)

fun makeExampleFish() {
    val fish = Fish(true, 50)
    println(
        "This fish is ${if (fish.friendly) "" else " not " } friendly. "
        + "It needs ${fish.size}ccs")
}