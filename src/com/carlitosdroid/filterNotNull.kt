package com.carlitosdroid

object filterNotNull {

    /**
     * The [filterNotNull] function returns a List
     * you must assign the response to a new variable
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = listOf("Eduardo", null, "Mari", null, "Jose", "Juan")// list of nullable String
        names1.filterNotNull()
        println("It remains the same: $names1")
        val names2 = names1.filterNotNull()
        println("$names2")
    }
}