package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
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


fun feedFish(fish: FishAction) {
    fish.eat()
}


fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Made 1 ${shark.color} shark and 1 ${pleco.color} Plecostomus")
    shark.eat()
    pleco.eat()
}