package com.carlitosdroid

object filterNotNullTo {

    /**
     * The [filterNotNullTo] function returns a List
     * you must assign the response to a new variable
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = listOf("Eduardo", null, "Mari", null, "Jose", "Juan")// list of nullable String
        val names2 = mutableListOf<String?>("NewName")// mutable list of nullable String
        val names3 = names1.filterNotNullTo(names2)
        println("It remains the same: $names1")
        println("$names2")
        println("$names3")
    }
}