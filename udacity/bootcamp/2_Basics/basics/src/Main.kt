fun main() {
    var marbles: Int? = null
    var lotsOfFish: List<String?> = listOf(null, null)
    var moreFish: List<String>? = null
    var maybeFish: List<String?>? = null
    maybeFish = listOf(null, null)

    var fishTreats = 5
    println(fishTreats?.dec() ?: 0)

    val nFish = 5
    val nPlants = 12
    println("I have $nFish fish and $nPlants plants, or ${nFish + nPlants} objects")

    if (nFish in 1..100) { println("Sufficient fish") }
    else { println("Too many or too few fish") }

    when (nFish) {
        0 -> println("Fish all died")
        50 -> println("Time for another aquarium")
        else -> println("All's well")
    }
}