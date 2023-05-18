data class Customer(val name: String, val email: String) { /* ... */ }

fun foo(a: Int=0, b: String="") { /* ... */ }

val positives = list.filter { x -> x > 0 }  // same as
val positives = list.filter { it > 0 }

if ("who@example.com" in emailList) { /* ... */ }

println("Name: $name")

when (x) {
    is Foo -> // ...
    is Bar -> // ...
    else -> // ...    
}        
        
val list = listOf("a", "b", "c")
val map = mapOf("a" to 1, "b" to 2, "c" to 3)

println(map["key"])
map["key"] = value

for ((k, v) in map) {
    println("$k -> $v")
}


for (i in 1..100) { /* ... */ }
for (i in 1 until 100) { /* ... */ }
for (x in 2..10 step 2) { /* ... */ }
for (x in 10 downTo 1) { /* ... */ }
(1..10).forEach { /* ... */ }

val p: String by lazy { /* ... */ }


fun String.spaceToCamelCase() { /* ... */ }
"convert me to camel case".spaceToCamelCase()


// Singleton
object Resource {
    val name = "Name"
}


abstract class MyAbs {
    abstract fun doIt()
    ablstrac fun sleep()
}

fun main() {
    val myObj = obj: MyAbs() {
        override fun doIt() { /* ... */ }
        override fun sleep() { /* ... */ }
    }
    myObj.doIt()
}


val files = File("Test").listFiles()
println(files?.size) // prints if not null

println(files?.siz ?: "empty") // if null prints "empty"
val filesSize = files?.size ?: run {
    return someSize
}
println(filesSize)

val email = values["email"] ?: throw IllegalStateException("Email is missing")

val mainEmail = emails.firstOrNull() ?: ""

value?.let { /* ... */ } // execute block if value not null


val mapped = value?.let {transfromValue(it)} ?: defaultValue // defaultValue if result is null


fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color value")
    }
}


fun test() {
    val res = try {
        count()
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
    // ...
}


val y = if (x == 1) {
    "one"
} else if  (x == 2) {
    "two"
} else {
    "many"
}


fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply {fill(-1)}
}


fun meaning() = 42


// same as
fun meaning(): Int {
    return 42
}


class Turtle {
    fun penDown()
    fun penUp()
    fun trun(degrees: Double)
    fun walk(pixels: Double)
}


val tortuga = Turtle()
with (tortuga) {
    penDown()
    for (i in 1..4) {
        walk(100.0)
        turn(90.0)
    }
    penUp()
}