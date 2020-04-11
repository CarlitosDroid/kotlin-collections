package com.carlitosdroid

object filterIndexedTo {

    /**
     * The [filterIndexedTo] function returns a C (Collection), this returns a filtered Mutable Collection
     * the first parameter 'names2' also will contain this filtered collection and must be a Mutable Collection
     * the original list will remain intact
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = listOf("Eduardo", "Leonardo", "Andy", "Jose")
        val names2 = mutableListOf("NewName")
        val names3 = names1.filterIndexedTo(names2) { index, element ->
            (index == 0 && element.length > 4)
        }
        println("$names1")
        println("$names2")
        println("$names3")
    }
}