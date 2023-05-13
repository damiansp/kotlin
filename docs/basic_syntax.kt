package my.demo

import kotlin.text.*


val PI = 3.14

fun main(args: Array<String>) { // empty ok too
    println(args.contentToString())
    print("Hello, World!\n")
    println(42)
    sum(4, 7)
    prod(4, 7)

    val a: Int = 1
    val b = 2
    val c: Int
    c = 3
    var x = 5
    x += 1

    val rect = Rectangle(5.0, 2.0)
    println("The perimeter of rect is ${rect.perimeter}")

    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
    for (i in items.indices) {
        println("item at $i is ${items[i]}")
    }

    var i = 0
    while (i < items.size) {
        println("item at $i is ${items[i]}")
        index++
    }

    val y = 10
    val z = 9
    if (y in 1..z + 1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size out of range")
    }
    for (y in 1..5) {
        print(y)
    }
    for (y in 1..10 step 2) {
        print(y)
    }
    for (y in 9 downTo 0 step 3) {
        print(y)
    }

    for (item in items) {
        println(item)
    }
    when {
        "orange" in items -> println("orange you glad?")
        "apple" in items -> println("an apple a day...")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun prod(a: Int, b: Int) = a * b


fun printSum(a: Int, b: Int): Unit {  // : Unit may be omitted
    println("$a + $b = ${a + b}")
}


open class Shape // open makes it inheritable


class Rectangle(var height: Double, var length: Double): Shape() {
    var perim = 2*(height + length)
}


fun describe(obj: Any): String = when (obj) {
    1 -> "One"
    "Hello" -> "Greeting"
    is Long -> "Long"
    !is String -> "Not a string"
    else -> "Unknown"
}


fun parseInt(str: String): Int? {
    // will return <null> if type of return obj is not Int
}


fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    if (x != null && y != null) {
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }
}


fun getStringLen(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}