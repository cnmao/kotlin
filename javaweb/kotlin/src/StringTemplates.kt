/**
 * use String Templates
 * 可以有相互 replace 等操作
 */
fun main(args: Array<String>) {
//sampleStart
    var a = 1
    // simple name in template:
    val s1 = "a is $a"

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a" //
//sampleEnd
    println(s2)
}