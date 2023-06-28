fun main() {
    println(greetMammal(Cat("Snowy")))
}


fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Hello, ${mammal.name}. Nice work as a(n) ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}, my furry friend"
    }
}


sealed class Mammal(val name: String) // can only be subclassed in this package


class Cat(val name: String): Mammal(name)


class Human(val name: String, val job: String): Mammal(name)