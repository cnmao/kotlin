fun main(args: Array<String>) {
    print("打印")
    println("打印换行")

    var name = "毛梦冲"
    val sex = "man"

    var age : Int?
    age = null

    name?.let {
        val length = name.length
    }

    val firstName = "mao"
    val secondName = "mengchong"
    val allName = "My name is $firstName$secondName"

    val text = """
        |First Line
        |Second Line
        |Third Line
        """.trimMargin()
    print(text)

    val x = 6
    val textABC = if (x > 5)
                            "a"
                            else   "b"

    if (textABC is String){
        var  smartcasting = textABC
    }
    var string = textABC as String

    if (x in 6..100){
        print("Yes")
    }

//    Switch 与 when
    var y = 0
    when(x) {
        1 -> y = 1
        in -1..1 -> y = 2
        else -> y =3
    }

//    for (i in 1..10) { }
//
//    for (i in 1 until 10) { }
//
//    for (i in 10 downTo 0) { }
//
    for (i in 1..10 step 2) {     println(i) }


//
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
//
//    for (item in collection) { }
//
//    for ((key, value) in map) { }

    val list = listOf<String>("1" ,"2" ,"3")

    val map = mapOf(1 to 1 ,
            2 to 2 ,
            3 to 3)

    list.forEach{
        list[1]
    }
    list.filter { list[1].equals("1") }.forEach { print("ok") }

    fun doSomething(){

    }
    fun doSomething(vararg numbers: Int){

    }

    fun getString():String {
        return string
    }
    fun getStringEasy():String = string

    fun doubleint(value : Int ) :Int  = 2*value

//    class Utils private constructor() {
//
//        companion object {
//
//            fun getScore(value: Int): Int {
//                return 2 * value
//            }
//
//        }
//    }
// other way is also there
//
//    object Utils {
//
//        fun getScore(value: Int): Int {
//            return 2 * value
//        }
//    }

        data class Developer(val name: String ,var age : Int)

//    fun Int.triple(): Int {
//        return this * 3
//    }
//
//    var result = 3.triple()
//
//    Read more: http://blog.chengyunfeng.com/?p=1069#ixzz5AFm5A6CL

    Test.te()
}