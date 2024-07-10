package com.hj99life.kotlin

fun main(){
    //3. 변수
    
    val a : Int = 3
    var b : Int = 10 
    b = 20 
    
    val name = "이름"

    //val user = User(name:"이름", age : 10)
    val user = User(name="푸바오", 4 )
    println( user.age)

    Kid(name="후이바오", age=1, gender="female")
}

open class User(open val name :String, open var age : Int = 100)

class User2(val name :String, var age : Int)

// 상속 open , override
// 주생성자 constructor
//class kid constructor( overrideval name: String, override var age: Int): User(name, age ){
// 부생성자
class Kid(override  val name: String, override var age: Int): User(name, age ){
    var gender : String ="female"

    init {
        println("초기화 중입니다.")
    }
    constructor(name:String, age:Int, gender:String) : this(name, age){
        this.gender = gender
        println("부생성자 호출")
    }
}