fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    for (element in list) {
        if (element > 2) {
            toRemove.add(element)
        }
    }
    list.removeAll(toRemove)
    println(list) // Output: [1, 2]

    toRemove.clear()
    for (element in list) {
        if(element == 1){
            toRemove.add(element)
        }
    }
    list.removeAll(toRemove)
    println(list) // Output: [2]

    toRemove.clear()
    for (element in list) {
        if(element < 3){
            toRemove.add(element)
        }
    }
    list.removeAll(toRemove)
    println(list) //Output: []
}