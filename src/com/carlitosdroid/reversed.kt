package com.carlitosdroid

object reversed {

    /**
     * A list in order is a collection of order items
     * The [reversed] method returns a reversed list, sorted by the index
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = listOf("carlos", "ronaldo", "maria", "isaias")
        val reversedNames = names.reversed()
        println(reversedNames)
    }

}