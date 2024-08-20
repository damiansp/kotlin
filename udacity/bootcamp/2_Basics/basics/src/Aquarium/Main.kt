package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}


fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.height = 80
    myAquarium.print()
    val smallAquarium = Aquarium(length=20, width=15, height=30)
    smallAquarium.print()
    val nineAquarium = Aquarium(nFish=9)
    nineAquarium.print()
}