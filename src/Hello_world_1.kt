fun main() {
    val list = mutableListOf(12, 34, 54, 76, 75)
    println(list.swap(0, 4))
    MyClass.myExtensionFun()
}

// creating an extension function swap() on Mutable list
fun MutableList<Int>?.swap(first: Int, second: Int): Any {
    return if (this == null) return "null"
    else {
        val tmp = this[first]
        this[first] = this[second]
        this[second] = tmp
        this
    }
}

// Creating an extension function as a companion object on a class
class MyClass {
    companion object {

    }
}

fun MyClass.Companion.myExtensionFun() {
    println("this is an extension function as companion object on a class")
}
