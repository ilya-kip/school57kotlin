package ru.tbank.education.school.lesson2

object DemoMap {

    fun createMap(): Map<String, Int> {
        val chars = ('a'..'z')
        fun rndString(lenght : Int) : String {
            return (1..lenght).map{ chars.random() }.joinToString("")
        }
        val rndMap = mapOf<String, Int>(
            rndString((5..10).random()) to (1..100).random(),
            rndString((5..10).random()) to (1..100).random(),
            rndString((5..10).random()) to (1..100).random(),
            rndString((5..10).random()) to (1..100).random(),
            rndString((5..10).random()) to (1..100).random()
        )
        return rndMap
    }

    fun maxValue(map : Map<String, Int>): Int {
        val maxValue = map.maxWith (compareBy{ it.value })
        return maxValue.value
    }

    fun keyForMaxValue(map : Map<String, Int>): String {
        val maxValue = map.maxWith (compareBy{ it.value })
        return maxValue.key
    }

    fun sortByValueDesc(map : Map<String, Int>): Map<String, Int> {
        val sortedMap = map.toList().sortedBy { (_, value) -> -value }.toMap()
        return sortedMap
    }

    fun filterOddValues(map : Map<String, Int>): Map<String, Int> {
        val map1 = map.filterValues { it % 2 == 1 }
        return map1
    }
}
