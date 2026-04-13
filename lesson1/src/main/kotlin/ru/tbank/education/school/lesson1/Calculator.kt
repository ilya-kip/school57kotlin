package ru.tbank.education.school.lesson1


/**
 * Метод для вычисления простых арифметических операций.
 */
fun calculate(a: Double, b: Double, operation: OperationType = OperationType.ADD): Double? {
    when(operation) {
        OperationType.ADD -> return a + b
        OperationType.SUBTRACT -> return a - b
        OperationType.MULTIPLY -> return a * b
        OperationType.DIVIDE -> if(b != 0.0) return a / b else return null
    }
}

/**
 * Функция вычисления выражения, представленного строкой
 * @return результат вычисления строки или null, если вычисление невозможно
 * @sample "5 * 2".calculate()
 */
@Suppress("ReturnCount")
fun String.calculate(): Double? {
    val parts = this.split(" ")
    if((parts.size != 3) and (parts.size != 2)){
        return null
    }
    val a = parts[0].toDoubleOrNull() ?: return null
    val b = parts[1]
    val c = parts[2].toDoubleOrNull() ?: return null

    val op = when(b){
        "+" -> OperationType.ADD
        "-" -> OperationType.SUBTRACT
        "*" -> OperationType.MULTIPLY
        "/" -> OperationType.DIVIDE
        else -> return null
    }
    return calculate(a, c, op)
}
