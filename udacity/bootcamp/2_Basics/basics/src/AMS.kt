import java.util.Random
import kotlin.math.tan


fun main(args: Array<String>) {
    val day = randDay()
    feedFish(day)
    if (waterNeedsChanging(day)) {
        println("Change the water today!")
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
    return true
}


fun canAddFish(
        tankSize: Int, currentFishLengths: Array<Int>, hasDecorations: Boolean
): Boolean {
    val capacity = tankSize * 0.8 if hasDecorations else tankSize
    val currentLengths = currentFishLengths.sum()
    return currentLengths < capacity
}