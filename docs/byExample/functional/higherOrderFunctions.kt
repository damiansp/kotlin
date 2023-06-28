fun main() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("$sumResult, $mulResult")

    val func = operation()
    println(func(2))
}


fun calculate(x: Int, y: Int, op: (Int, Int) -> Int) {
    return op(x, y)
}


fun sum(x: Int, y: Int) = x + y


fun operation(): (Int) -> Int {
    return ::square
}


fun square(x: Int) = x * x