fun main() {
    var list = (1..20).toList()
    println(list)
    list = list.filter { it % 2 == 0 }
    println(list)

    // we can define the type like this
    val singleLambda = { x: Int -> x + x }
    // or like this, here it will automatically identify the type
    val lambda2: (Int) -> Int = { x -> x + x }

    val singleParam: (Int) -> Int = { x -> x + x }
    val simplifySingleParam: (Int) -> Int = { it + it }

    println(calculator(10, 10) { a, b -> a + b })
    println(singleLambda(10))
    println(lambda2(11))

}

fun calculator(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

class LambdaFunctions {
    val singleParamLambda = { x: Int -> x + x }
}