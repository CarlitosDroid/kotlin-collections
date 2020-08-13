package com.carlitosdroid

object sorted {

    /**
     * The [sorted] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val numbers = listOf(1, 2, 3)
        val names = listOf("Carlos", "Alder", "Ronaldo")
        val sortedNumbers = numbers.sorted()
        val sortedNames = names.sorted()
        println(sortedNumbers)
        println(sortedNames)
    }

}