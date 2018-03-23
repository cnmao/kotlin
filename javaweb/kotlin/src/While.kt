/**
 * 使用While 进行循环便利出来一个集合或者数组的各个值
 */

fun item(){
    var item = listOf<String>("a" , "b" , "c")

    var index = 0 ;
    while (index < item.size){
        println(item[index])
        index++
    }
    println(item)
}

fun main(args: Array<String>) {
    item()
}
