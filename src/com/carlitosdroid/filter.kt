package com.carlitosdroid

object filter {

    /**
     * The [filter] function returns a List,
     * when you call it, you must assign the returned List to a new variable
     * if you just call it and don't return anything, the list remains the same
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableSetOf("Eduardo", "Leonardo", "Andy", "Jose")
        names.filter {
            it.length > 4
        }
        println("remains the same: $names")
        val filterNames = names.filter {
            it.length > 4
        }
        println("this is the filter list: $filterNames")
    }

}