import java.util.Calendar

fun main(args: Array<String>) {
    getDayOfWeek()
}


fun getDayOfWeek() {
    print("Today is ")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (day) {
        1 -> "Sun"
        2 -> "Mon"
        3 -> "Tue"
        4 -> "Wed"
        5 -> "Thu"
        6 -> "Fri"
        7 -> "Sat"
        else -> "Unday"
    })
}