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

