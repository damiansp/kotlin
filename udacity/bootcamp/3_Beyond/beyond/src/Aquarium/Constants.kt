package Aquarium

const val ROCKS = 3
val n = 5

const val CONSTANT = "top-level constant"


object Constants {
    const val CONSTANT2 = "object constant"
}


val foo = Constants.CONSTANT2


class MyClass {
    companion object {
        const val CONST3 = "const in companion"
    }
}