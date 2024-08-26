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

    genericExample()
}


fun String.hasSpaces() = find { it == ' ' } != null


fun extensionsExample() {
    "Does it have spaces?".hasSpaces()
}


open class WaterSupply(var needsProcessing: Boolean)


class TapWater: WaterSupply(true) {
    fun addChemicalCleaners() = apply { needsProcessing = false }
}


class FishStoreWater: WaterSupply(false)


class LakeWater: WaterSupply(true) {
    fun filter() = apply { needsProcessing = false }
}


class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("adding water fro $waterSupply")
    }
}


inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R


fun addItemTo(aquarium: Aquarium<WaterSupply) = println("item added")


interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}


class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()

    }
}


fun <T: WaterSupply> waterIsClean(aquarium: Aquarium<WaterSupply>) {
    println("aquarium water is clean; ${aquarium.waterSupply.needsProcessing}")
}


inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T


fun genericExample() {
    val cleaner TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.hasWaterSupplyOfType<TapWater>()  // true
    aquarium.waterSupply.isOfType<LakeWater>()  // false
    aquarium.addWater(cleaner)
    addItemTo(aquarium)
    waterIsClean(aquarium)
}