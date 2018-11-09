package com.lsy.cotlinbase


class BaseGrammar {

    //参数类型Int，返回值类型Int
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    //表达式作为函数体，返回值类型自动推断
    fun sum2(a: Int, b: Int) = a + b

    //public方法则必须明确写出返回值类型
    public fun sum3(a: Int, b: Int): Int = a + b

    //无返回值类型的函数，Unit类似void
    fun printSum(a: Int, b: Int): Unit {
        println(a + b)
    }

    //Unit可省略，即使是public类型也可省略
    public fun printSum2(a: Int, b: Int) {
        println(a + b)
    }

    //变长参数使用vararg关键字标识
    fun vars(vararg v: Int) {
        for(vt in v) {
            println(vt)
        }
    }

    //变量
    var a: Int = 1
    //常量，类似java中的final
    val b: Int = 1

    //变量和常量声明时可以不指定类型，编译器会自动判断
    var c = 1

    /*字符串模板
    $在字符串中表示变量的值
     */
    var d = 1
    var e = "d is $d"

    /*
    变量默认不能为null，如果可以为null，需要加上？标识符，否则编译不过，
    同样，方法的返回值，如果可以为null，也要加上？
     */
    var f: String? = null

    fun name(): String? = null

}