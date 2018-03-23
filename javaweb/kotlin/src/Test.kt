fun main(args: Array<String>) {

    var user = User("毛梦冲" , "1098055977@qq.com")
    //   saySomething(user)
//    format("毛梦冲")

    Class_Constructors(1)

}

fun saySomething(user: User){
    var toString = user.toString()
    println(toString)
}

fun format(string: String , boolean: Boolean = true){
    println(boolean)
}