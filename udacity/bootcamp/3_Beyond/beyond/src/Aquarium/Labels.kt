package Aquarium

fun labels() {
    outer@ for (i in 1..100) {
        for (j in 1..100) {
            if (i > 10) break@outer
        }
    }
}