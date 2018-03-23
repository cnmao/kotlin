/**
 * 条件表达式
 * Conditional 条件
 * expression 表达
 */

fun main(args:Array<String>){
//    println("max of 0 and 1 is ${maxOf(0,1)}")
    println("max of 0 and 1 is ${maxOfSimple(0,1)}")
}

fun maxOf(a:Int , b:Int):Int{
    if(a > b){
        return a
    }else{
        return b
    }
}

fun maxOfSimple(a:Int,b:Int) = if (a>b) a else b
