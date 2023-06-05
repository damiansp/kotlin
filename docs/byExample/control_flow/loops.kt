fun main(args: Array<String>) {
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yum, a $cake cake!")
    }

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    val zoo = Zoo(listOf(Animal("aardvark"), Animal("zebra")))
    for (animal in zoo) {
        println("Ooo, look!  There's the ${animal.name}")
    }
}


fun eatACake() = println("Eating a cake...")
fun bakeACake() = println("Baking a cake...")


class Animal(val name: String)


class Zoo(val animals: List<Animal>) {
    operator fun interator(): Iterator<Animal> {
        return animals.iterator()
    }
}