/**
 * 集合
 * list集合遍历
 * set集合判断其中是否有某个值
 * Lambda 表达式
 */

fun main(args: Array<String>) {
    var items = listOf<String>( "a"  , "b" , "c")
    getListItem(items)
    judgeIn();
    lambda()
}

/**
 * Using lambda expressions to filter and map collections:
 */
fun lambda() {
    var items = listOf<String>( "banana", "avocado", "apple", "kiwi")
    items
            .filter { it.startsWith("a") }
            .sortedBy { it } //  Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
            .map { it.toUpperCase() } //* Returns a list containing the results of applying the given [transform] function  to each element in the original collection.
            .forEach{ println(it) } //Performs the given [action] on each element. 执行
}

/**
 * Checking if a collection contains an object using in operator
 */
fun judgeIn() {
    var of = setOf<String>("a", "b", "c")
    when{
        "a" in of -> println("a in $of")
        "d" in of -> println("d in $of")
    }
}

/**
 * Iterating over a collection:
 */
fun getListItem(items: List<String>) {

    for (item in items){
        println(item)
    }
}
