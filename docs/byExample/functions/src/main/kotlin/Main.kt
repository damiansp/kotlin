fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    println(sum(1, 2))
    println(product(2, 4))

    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")
    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia

    //operator fun Int.times(str: String) = str.repeat(this)
    //println(2 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies. Nothing annoys them quite so much."
    println(str[0..14])

    printAll("Hello", "Howdy", "Hi there")
    printAllWithPrefix("Hello", "Howdy", "Hi there", prefix="Why ")
    log("Hello", "Howdy", "Hi there")
}


fun printMessage(msg: String): Unit {
    println(msg)
}


fun printMessageWithPrefix(msg: String, prefix: String="Info") {
    println("[$prefix]: $msg")
}


fun sum(x: Int, y: Int): Int {
    return x + y
}


fun product(x: Int, y: Int) = x * y


class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }
}


fun printAll(vararg msgs: String) {
    for (m in msgs) {
        println(m)
    }
}


fun printAllWithPrefix(vararg msgs: String, prefix: String) {
    for (m in msgs) {
        println(prefix + m)
    }
}


fun log(vararg entries: String) {
    printAll(*entries)
}