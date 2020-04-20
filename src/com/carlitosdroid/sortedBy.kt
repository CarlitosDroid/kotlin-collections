package com.carlitosdroid

object sortedBy {

    /**
     * The [sortedBy] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableListOf("Leonardo", "Carlos", "Jose", null)
        val firstElement1 = names.sortedBy {
            it
        }
        println(firstElement1)
    }

}