package com.carlitosdroid

object forEach {

    /**
     * The [forEach] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableSetOf("Eduardo", "Leonardo", "Andy", "Jose")
        names.forEach {
            println(it)
        }
    }

}