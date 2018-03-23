/**
 *  WhenExpression 描述性
 *   输入 和 返回判断
 */
fun main(args: Array<String>) {
    describe(1)
    println(describe(1))
    var describe = describe("Hello")
    println(describe)
}

fun describe(obj:Any): String =
        when (obj) {
            1     -> "one"
            "Hello"    -> "Greeting"
            else -> "else posiable"
        }
