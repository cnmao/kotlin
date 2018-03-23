/**
 * 创建Class
 * 获取其实例对象
 * rectangle ：长方形
 *Triangle : 三角形
 * perimeter:周长
 */
fun main(args: Array<String>) {
    val rectangle = Rectangle(5.0, 2.0) //no 'new' keyword required
    val triangle = Triangle(3.0, 4.0, 5.0)
    println("Area of rectangle is ${rectangle.calculateArea()}, its perimeter is ${rectangle.perimeter}")
    println("Area of triangle is ${triangle.calculateArea()}, its perimeter is ${triangle.perimeter}")
}

/**
 * 抽象类
 * 集合的内部元素总和：
 * val sides: List<Double>
 *     sides.sum()
 */
abstract class Shape(val sides: List<Double>) {
    val perimeter: Double get() = sides.sum()
    abstract fun calculateArea(): Double
}

/**
 * 接口：提供判断是否为一个图形的功能
 */
interface RectangleProperties {
    val isSquare: Boolean
}

class Rectangle(
        var height: Double,
        var length: Double
) : Shape(listOf(height, length, height, length)), RectangleProperties {
    override val isSquare: Boolean get() = length == height
    override fun calculateArea(): Double = height * length
}

class Triangle(
        var sideA: Double,
        var sideB: Double,
        var sideC: Double
) : Shape(listOf(sideA, sideB, sideC)) {
    override fun calculateArea(): Double {
        val s = perimeter / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}