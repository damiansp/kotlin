package Aquarium

class MyList<T: Any> {  // default is <T: Any?> including nulls
    fun get(pos: Int): T { /* todo */ }

    fun addItem(item: T) { /* todo */ }
}


fun workWithMyList() {
    val intList: MyList<String>
    val fishList: MyList<Fish>
}