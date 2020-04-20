package com.carlitosdroid

object sortedByDecendent {

    /**
     * The [sortByDescending] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableListOf("Carlos", "Jose", "Leonardo", null)
        names.sortByDescending {
            it?.length
        }
        println(names)
    }

}