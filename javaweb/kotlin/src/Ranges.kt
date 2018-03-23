/**
 * ranges 范围
 * 注意 是范围 ，而不是等式
 * woring : y in x+1
 * right : y in 0..x=1
 */

fun main(args: Array<String>) {
    var x = 9
    var y = 10

    if (y in 9..x+1){
        println("$y in ${x+1} 中")
    }

    val list = listOf("a", "b", "c")
    var indices = list.indices
    println(indices)
}