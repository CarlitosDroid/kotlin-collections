package com.carlitosdroid

object filterIndexed {

    /**
     * The [filterIndexed] function returns a List, the benefit is that is provides you every index
     * when you call it, you must assign the returned List to a new variable
     * if you just call it and don't return anything, the list remains the same
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = listOf("Eduardo", "Leonardo", "Andy", "Jose")
        names.filterIndexed { index, element ->
            (index == 0 && element.length > 4)
        }
        println("remains the same: $names")
        val filterNames = names.filterIndexed {index, element ->
            index == 0 && element.length > 4
        }
        println("this is the filter list: $filterNames")
    }
}