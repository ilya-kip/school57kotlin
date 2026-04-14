package ru.tbank.education.school.lesson2

/**
 * Сумма четных чисел.
 */
fun sumEvenNumbers(numbers: List<Int>): Int {
    return (numbers.filter { it % 2 == 0 }).reduce { acc, i -> acc + i }
}
