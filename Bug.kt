fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]
    list.removeIf { it == 1 }
    println(list) //Output: [2]
    list.removeIf { it < 3 }
    println(list) //Output: []
}