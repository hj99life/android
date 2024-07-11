package com.hj99life.kotlin.part0.ch1

fun main() {
    var name : String = "상아"
    var number: Int = 10

    var nickname: String? = "코코"
    var secondNumber : Int? = null //타입? null이 가능한 타입

//    val result = if(nickname == null) {
//        "값이 없음"
//    } else {
//        nickname
//    }


    nickname = null
    var result = nickname ?: "값이 없음"
    println(result)

    val size = nickname?.length

    println(size)
}