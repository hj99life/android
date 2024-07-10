package com.hj99life.kotlin

fun main() {
    println("Hello world")
    test()
    var result = test(1,3)
    println(result)

    var result1 = test(1, c=5)
    println(result1)

    test2(id="hj", name="나", nickname="hj")

    println(times(1,3))
}

// 2. 함수
fun test() {
    println("test")
}

fun test(a: Int, b: Int) : Int {
    println(a+b)
    return a+b
}

fun test(a:Int):Int {
    val b = 3
    println(a+b)
    return  a+b
}

fun test(a:Int, b:Int =3, c:Int = 4) : Int {
    println(a+b)
    return  a+b
}

fun test2(name:String, nickname :String, id : String)= println(name + nickname + id)

fun times(a:Int, b:Int) = a*b
