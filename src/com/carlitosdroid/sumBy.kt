package com.carlitosdroid

object sumBy {

    /**
     * Iterate for each number in the list, operates over every item and sum them.
     * The [sumBy] method returns a reversed list, sorted by the index
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val numbers = listOf(5, 10, 20, 40)
        val sumNumbers = numbers.sumBy {
            it * 2
        }
        println(sumNumbers)
    }
}