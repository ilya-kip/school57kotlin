package ru.tbank.education.school.lesson2

object DemoList {
    fun createList(): List<Int> {
        val rndlist : List<Int> = listOf((1..100).random(), (1..100).random(), (1..100).random(), (1..100).random(), (1..100).random())
        return rndlist
    }

    fun sumList(list : List<Int>): Int {
        val sum = list.reduce { acc, i -> acc + i }
        return sum
    }

    fun sumEvenList(list : List<Int>): Int {
        val list1 = list.filter { it % 2 == 0 }
        val sum = list1.reduce { acc, i -> acc + i }
        return sum
    }

    fun multiplyList(list : List<Int>): List<Int> {
        val list1 = list.map { it * 2 }
        return list1
    }

    fun maxElement(list : List<Int>): Int {
        val list1 = list.sorted()
        return list1.last()
    }

    fun sortDesc(list : List<Int>): List<Int> {
        val list1 = list.sortedDescending()
        return list1
    }
}
