package com.hj99life.kotlin.exam

fun main() {
    var name : String = "상아"
    var number: Int = 10

    var nickname: String? = "코코"
    var secondNumber : Int? = null

//    val result = if(nickname == null) {
//        "값이 없음"
//    } else {
//        nickname
//    }
    nickname = null
    val size = nickname?.length

    println(size)
}