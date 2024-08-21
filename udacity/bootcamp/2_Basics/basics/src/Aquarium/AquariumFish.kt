package Aquarium


abstract class AquariumFish {
    abstract val color: String
}


class Shark: AquariumFish(), FishAction {
    override val color = "grey"

    override fun eat() {
        println("hunts and eats fish")
    }
}


class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"

    override fun eat() {
        println("munches on some algae")
    }
}


interface FishAction {
    fun eat()
}