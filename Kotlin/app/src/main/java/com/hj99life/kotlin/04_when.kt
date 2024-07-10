package com.hj99life.kotlin

fun main() {
    max(10, 3)
    isHoliday("금")
}

fun max(a: Int, b: Int) {
    val result = if (a > b) a else b
    println(result)
}

// 월 화 수 목 금 토 일
fun isHoliday(dayOfWeek: Any) {
    when(dayOfWeek) {
        "토" ,
        "일" -> if (dayOfWeek == "토") "좋아" else "너무 좋아"
        in 2..4 -> {}
        in listOf("월", "화") -> {}
        else -> "안좋아"
    }
}