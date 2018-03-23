/**
 * Loop循环 比如说便利一个集合
 *
 *  Returns the index of the last item in the list or -1 if the list is empty.
 */

fun main(args: Array<String>) {
    getItem()
}

fun getItem(){
    var item = listOf<String>("a" , "b" , "c")

    for (index in item.indices){
        println("item at $index is ${item[index]}")
    }

    println(item.lastIndexOf("b")) // 相应字符最后一次出现时的角标
    println(item)
}
