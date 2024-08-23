import java.util.Random
import kotlin.math.tan


fun main(args: Array<String>) {
    val day = randDay()
    feedFish(day)
    if (waterNeedsChanging(day)) {
        println("Change the water today!")
    }
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    repeat(2) {
        println("A fish is swimming")
    }
}


fun randDay(): String {
    val week = listOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    return week[Random().nextInt(7)]
}


fun feedFish(day: String) {
    val food = getFood(day)
    println("Today is $day, and the fish eat $food")
}


fun getFood(day: String): String {
    return when (day) {
        "Mon" -> "flakes"
        "Tue" -> "pellets"
        "Wed" -> "redworms"
        "Fri" -> "mosquitoes"
        "Sat" -> "seaweed"
        "Sun" -> "plankton"
        else -> "nothing"
    }
}


fun waterNeedsChanging(day: String, temp: Int=27, dirty: Int=20): Boolean {
    return when {
        isTooHot(temp) -> true
        isDirty(dirty) -> true
        isChangeDay(day) -> true
        else -> false
    }
}


fun isTooHot(temp: Int) = temp > 30


fun isDirty(dirty: Int) = dirty > 30


fun isChangeDay(day: String) = day == "Sun"


val dirty = 20
val filterWater: (Int) -> Int = { dirty -> dirty / 2 }


fun feedSomeFish(dirty: Int) = dirty + 10


fun updateDirty(dirty: Int, op: (Int) -> Int): Int {
    return op(dirty)
}


/*
fun dirtyProcessor() {
    dirty = updateDirty(dirty, filterWater)
    dirty = updateDirty(dirty, ::feedSomeFish)
    dirty = updateDirty(dirty) { dirty -> dirty + 50 }
}
 */


/*
fun canAddFish(
        tankSize: Int, currentFishLengths: List<Int>, hasDecorations: Boolean
): Boolean {
    val capacity = if (hasDecorations) tankSize * 0.8  else tankSize
    val currentLengths = currentFishLengths.sum()
    return (currentLengths < capacity)
}
 */