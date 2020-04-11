package com.carlitosdroid

object filterTo {

    /**
     * The [filterTo] function returns a List,
     * the destination(first parameter) must be a mutable collection
     * if you just call it and don't return anything, the list remains the same
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableSetOf("Eduardo", "Leonardo", "Andy", "Jose")
        val names2 = mutableSetOf("NewName")
        val names3 = names.filterTo(names2) {
            it.length > 4
        }
        println("remains the same: $names")
        println("$names2")
        println("$names3")
    }

}