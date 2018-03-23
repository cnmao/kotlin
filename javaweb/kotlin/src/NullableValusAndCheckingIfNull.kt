import java.lang.Integer.parseInt

/**
 * 使用NUll值 和 NUll检查
 */

// use a function returning nullable value:
fun printInt(str:String): Int? {
    return str.toIntOrNull()
}

fun main(args: Array<String>) {



//    var printInt = printInt("a") //
//    if (printInt == null) {
//        println("为null 就是打印出来：Process finished with exit code 0 ")
//    }
    // Process finished with exit code 0  程序直接执行结束后，没有你想要的结果 也就是为null 其中有个地方，因为此显示结果总是在最后给出!


//    printProduct("6", "7")
//    printProduct("a", "7")
//    printProduct("a", "b")
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("99", "b")

}

//sampleStart
fun printProduct(arg1: String, arg2: String) {
    val x = printInt(arg1) //6
    val y = printInt(arg2) // 7

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}

fun printProduct2(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

//sampleStart
    // ...
    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return
    }

    // x and y are automatically cast to non-nullable after null check
    println(x * y)
//sampleEnd
}
