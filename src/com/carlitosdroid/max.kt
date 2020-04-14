package com.carlitosdroid

object max {

    /**
     * The [max] functions returns the bigger element
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableListOf("Leonardo", "Hector", "Andy", "Alexis")
        val maxString = names.max()
        println(maxString)

        val numbers = mutableListOf(1, 4, 8, 3, 5)
        val maxNumber = numbers.max()
        println(maxNumber)
    }

}