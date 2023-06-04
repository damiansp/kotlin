fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val lion: Lion = Asiatic("Leo")
    lion.sayHello()
}


open class Dog {  // open makes it extendable
    open fun sayHello() {
        println("Bark, bark!")
    }
}


class Yorkshire: Dog {
    override fun sayHello() {
        println("Yip, yip!")
    }
}


open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says 'Preowww!'")
    }
}


class SiberianTiger: Tiger("Siberia")


open class Lion(val name: String, val origin: String){
    fun sayHello() {
        println("$name, the lion from $origin says 'Rooooar!'")
    }
}


class Asiatic(name: String): Lion(name=name, origin="India")