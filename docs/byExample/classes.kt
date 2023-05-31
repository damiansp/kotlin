class Customer

class Contact(val id: Int, var email: String)


fun main() {
    val customer = Cunstomer()
    val contact = Contact(1, "somesuch@email.com")
    println(contact.id)
    contact.email = "nonesuch@email.com"
}