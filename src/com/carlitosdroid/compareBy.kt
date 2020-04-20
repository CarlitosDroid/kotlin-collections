package com.carlitosdroid

object compareBy {

    /**
     * The [compareBy] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val list = listOf('B', 'a', 'A', 'b')

        val sorted = list.sortedWith(
                compareBy(String.CASE_INSENSITIVE_ORDER) { v -> v.toString() }
        )

        println(sorted) // [a, A, B, b]
    }

}