package com.hj99life.kotlin

fun main() {
    println("Hello world")
    test()
    var result = test(1,3)
    println(result)

    val result1 = test(1, c = 5)
    println(result1)

    test2(id="hj", name="나", nickname="hj")

    println(times(1,3))
    println(time1(1,3))
    println(time2(1,3))

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


// 2. 함수
fun test1(a: Int, b: Int = 3, c: Int = 4) : Int {
    println(a+b)
    return a+b
}

fun test3(name: String, nickname : String, id: String) = println(name + nickname + id)

fun time1(a: Int, b: Int ) : Int {
    return a * b
}

fun time2(a: Int, b: Int) = a * b
