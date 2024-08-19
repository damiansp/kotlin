package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}


fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.height = 80
    println(
        "A ${myAquarium.length}x${myAquarium.width}x${myAquarium.height}cm"
        + " (${myAquarium.volume}L) aquarium")
}