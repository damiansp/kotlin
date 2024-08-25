package Aquarium


fun main(args: Array<String>) {
    val symptoms: MutableList<String> = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    symptoms.add("white fungus")
    symptoms.remove("white fungus")
    symptoms.contains("red")

    val ailments: Map<String, String> = mapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(ailments["red sores"])
    println(ailments.getOrDefault("bloating", "don't know"))
    ailments.getOrElse("belly up") { print("Consulting specialists for cures...") }

    val inventory: MutableMap<String, Int> = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")
}


internal fun buildAquarium() = Aquarium()


open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = value * 1000 / (width * length)
        }
}


fun String.hasSpaces() = find { it == ' ' } != null


fun extensionsExample() {
    "Does it have spaces?".hasSpaces()
}

