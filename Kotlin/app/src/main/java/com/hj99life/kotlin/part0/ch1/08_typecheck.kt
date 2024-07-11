package com.hj99life.kotlin.part0.ch1

fun main() {
    println(check("안녕"))
    println(check(3))
    println(check(true))

    println(cast("안녕"))
    println(cast(10))

    println(smartcast("안녕"))
    println(smartcast(10))
    println(smartcast(true))
}

fun check(a: Any): String {
    return when (a) {
        is String -> {
            "문자열"
        }
        is Int -> {
            "숫자"
        }
        else -> {
            "몰라요"
        }
    }
}

fun cast(a : Any) : String {
    //val result = (a as? String) ?: "실패"
    //println(result)
    return (a as? String) ?: "실패"
}

fun smartcast(a : Any): Int {
    return if(a is String) {
        a.length
    } else if(a is Int) {
        a.dec()
    } else {
        -1
    }
}