fun main() {
    val stack = muatableStackOf(0.62, 3.14, 2.7)
    println(stack)
}


fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)


class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(elem: E) = elements.add(elem)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size
    override fun toString() = "MutableStack(${elements.joinToString()})"
}


