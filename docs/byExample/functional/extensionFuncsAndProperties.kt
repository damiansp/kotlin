fun main() {
    val order = Order(
        listOf(Item("Bread", 25.0F), Item("Wine", 20.0F), Item("Water", 12.0F)))
    println("Max priced item: ${order.maxPricedItemName()}")
    println("Max item price: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedNames}")
}


data class Order(val items: Collection<Item>)


data class Item(val name: String, val price: Float)


fun Order.maxPricedItemValue(): Float =
    this.items.maxByOrNull { it.price }?.price ?: 0F


fun Order.maxPricedItemName() =
    this.itmes.maxByOrNull { it.price }?.name ?: "No Products"


val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()