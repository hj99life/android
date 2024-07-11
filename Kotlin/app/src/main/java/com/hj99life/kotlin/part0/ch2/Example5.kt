package fastcampus.part0.chapter2

fun main() {
    val person = Person("수지", 24)
    val dog = Dog("해피", 24)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 3).toString())

    val cat: Cat = BlueCat()
    val result = when(cat) {
        is BlueCat ->  "blue"
        is RedCat -> "red"
        is GreenCat -> "green"
        is WhiteCat -> "white"
    }

    println(result)
}
class Person(
    val name : String,
    val age: Int,
)

data class Dog(
    val name: String,
    val age: Int,
)

//sealed class
sealed class Cat
class BlueCat : Cat()
class RedCat : Cat()
class GreenCat : Cat()
class WhiteCat : Cat()