/**
 * 类型检查     if o instance of  Person.class  "YES"
 * 自动类型转换 then o is one of Person instances
 *  前边应该是先使用 is String 然后的下一步 操作 才会进行转换。
 *  这个转换时间注意一下
 */
fun main(args: Array<String>) {
    fun printLength(obj: Any) {
        println("'$obj' string length is ${getStringLength(obj) ?: "... err, not a string"} ")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))

}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

