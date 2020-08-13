package com.carlitosdroid

object binarySearch {

    /**
     * The [binarySearch] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableListOf(1, 4, 5, null)
        val foundElementIndex = names.binarySearch(5, 0, 4)
        println(foundElementIndex)
    }

}