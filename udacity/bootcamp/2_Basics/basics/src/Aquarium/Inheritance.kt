package Aquarium

fun main(args: Array<String>) {
    delegate()
}


fun delegate() {
    val parrot = Parrotfish()
    println("Fish has color ${parrot.color}")
    parrot.eat()
}


interface FishActions {
    fun eat()
}


interface FishColor {
    val color: String
}


class Parrotfish(fishColor: FishColor = GoldColor):
    FishActions by PrintingFishActions("a lot of coral"),
    FishColor by fishColor


object GoldColor: FishColor {
    override val color = "gold"
}


object RedColor: FishColor {
    override val color = "red"
}


class PrintingFishActions(val food: String): FishActions {
    override fun eat() {
        println("Eating $food")
    }
}