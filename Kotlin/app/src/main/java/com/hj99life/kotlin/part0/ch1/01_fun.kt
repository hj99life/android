package com.hj99life.kotlin.part0.ch1

fun main() {
    // 1. 익명함수
    // 2.

    val hello = fun(): (Int, Int, Int) -> Int = { a, b, c -> a * b * c }
    val hi: (Int, Int) -> String = { a, b -> if (a + b > 10) "크다" else "작다" }

    println(hi(1,3))

}


fun hello(a: Int, b: (Int, Int, Int) -> Int) {
}