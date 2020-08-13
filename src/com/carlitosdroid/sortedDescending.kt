package com.carlitosdroid

object sortedDescending {

    /**
     * The [sortedDescending] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val numbers = listOf("one", "two", "three", "four")
        val sortedNumbers = numbers.sortedBy { it.length }
        println("Sorted by length ascending: $sortedNumbers")
        val sortedByLast = numbers.sortedByDescending { it.last() }
        println("Sorted by the last letter descending: $sortedByLast")
    }

}