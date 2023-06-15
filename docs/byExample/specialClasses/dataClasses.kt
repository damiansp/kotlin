/*345678*//*345678*//*345678*//*345678*//*345678*//*345678*//*345678*//*345678*/
data class User(val name: String, val id: Int) {
    override fun equals(other: Any?) = other is User && other.id == this.id
}


fun main() {
    val user = User("Alex", 1)
    val user2 = User("Alex", 1)
    val user3 = User("Max", 2)
    println(user)
    println("user == user2: ${user == user2}")
    println("user == user3: ${user == user3}")
    println(user.hashCode())
    println(user2.hashCode()) // same as user
    println(user3.hashCode())
    println(user.copy())
    pritln(user === user.copy())  // false (unique objects in memory)
    println(user.copy("Max"))
    println(user.copy(id=3))
    println("Name: ${user.component1()}") // decalaration order
    println("ID: ${user.component2()}")
}