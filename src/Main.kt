import kotlin.math.atan
import kotlin.math.exp
fun main() {
    z2()
    z9()
    z7_1()
}
fun z2(){
    print("Введите первый известный элемент:")
    var M: Int = readLine()!!.toInt()

    print("Введите номер первого известного элемента:")
    var iM: Int = readLine()!!.toInt()

    print("Введите второй известный элемент:")
    var N: Int = readLine()!!.toInt()

    print("Введите номер второго известного элемента:")
    var iN: Int = readLine()!!.toInt()

    if (N < M) {
        throw IllegalArgumentException("Первый элемент должен быть меньше второго")
    }

    val step = (N - M) / (iN - iM)
    var sum: Int = 0

    for (i in M..N step step) {
        sum += i
    }

    println("Сумма элементов: $sum")
}
fun z9(){
    val size = 3;
    var ints = IntArray(size);
    for (i in 0 until size) {
        print("Введите ${i+1} число: ")
        ints[i] = readLine()!!.toInt()
    }
    println("Среднее арифметическое: ${(ints[0]+ints[1]+ints[2])/3}\nГеометрическое: ${Math.cbrt((ints[0]*ints[1]*ints[2]).toDouble())}")
}
fun z7_1(){
    var x:Double
    var y:Double
    var z:Double
    print("Введите значения для X:")
    x = readLine()!!.toDouble()
    print("Введите значения для Y:")
    y = readLine()!!.toDouble()
    print("Введите значения для Z:")
    z = readLine()!!.toDouble()
    var a = (Math.sqrt(Math.abs(x-1))-Math.cbrt(Math.abs(y)))/(1+((x*x)/2)+((y*y)/4))
    var b = x * (atan(z) + exp(-(x + 3.0)))
    println("A: $a\nB: $b")
}