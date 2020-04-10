package com.carlitosdroid

object filterIsInstance {

    /**
     * The [filterIsInstance] function returns a List of elements that are instances of the parameter <R>
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = listOf("Eduardo", null, "Mari", null, "Jose", "Juan")// list of nullable String
        println("$names1")
        val names2 = names1.filterIsInstance<String>() // are elements instances of no-null String?
        println("$names2")
        val names3 = names1.filterIsInstance<Int>() // are elements instances of Int?
        println("$names3")
    }
}