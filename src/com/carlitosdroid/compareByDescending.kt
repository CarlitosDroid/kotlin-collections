package com.carlitosdroid

object compareByDescending {

    /**
     * The [compareByDescending] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val list = listOf('B', 'a', 'A', 'b')

        val sorted = list.sortedWith(
                compareByDescending(String.CASE_INSENSITIVE_ORDER) { v -> v.toString() }
        )

        println(sorted) // [B, b, a, A]
    }

}