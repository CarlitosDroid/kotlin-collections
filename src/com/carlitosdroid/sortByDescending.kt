package com.carlitosdroid

object sortByDescending {

    /**
     * The [sortByDescending] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableListOf("Carlos", "Leonardo", "Jose", null)
        names.sortByDescending {
            it
        }
        println(names)
    }

}