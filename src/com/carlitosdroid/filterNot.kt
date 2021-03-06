package com.carlitosdroid

object filterNot {

    /**
     * The [filterNot] function returns a List.
     * you must assign the response to a new variable
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = listOf("Eduardo", null, "Mari", null, "Jose", "Juan")// list of nullable String
        names1.filterNot {
            it == null
        }
        println("It remains the same: $names1")
        val names2 = names1.filterNot {
            it == null
        }
        println("$names2")
    }
}