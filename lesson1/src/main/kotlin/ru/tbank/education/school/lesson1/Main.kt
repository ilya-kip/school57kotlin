package ru.tbank.education.school.lesson1

fun main() {
    val result  = "3 / 5".calculate()
    result?.let { println(it) } ?: println("Ошибка при совершении вычислений")
}
