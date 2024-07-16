package com.hj99life.kotlin.part0.ch2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hj99life.kotlin.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //SAM
        //Single Abstract Method
        // 함수형 인터페이스를 인자로 받는 자바 함수를 호출 할 때,
        // 인터페이스는 람다로 대체 가능
        // * 함수형 인터페이스 : 추상 메서드가 1개인 인터페이스
        val view = View(this)
        view.setOnClickListener { println("안녕") }
    }
}

//object Counter : DogCounter() {
//    init {
//        println("초기화")
//    }
//
//    var count = 0
//    fun countUp() {
//        count++
//    }
//}
//
//open class DogCounter  {
//    fun bark() {
//        println("멍멍")
//    }
//}
//
//class Example6 {
//    companion object {
//        init {
//            println("hello")
//        }
//        fun createDog(): DogCounter {
//            return DogCounter()
//        }
//        const val NAME = "hello"
//    }
//}