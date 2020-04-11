package com.carlitosdroid

object forEachIndexed {

    /**
     * The [forEachIndexed] method returns Unit, you can iterate the elements
     * the benefit is that you can get the index(position of every element)
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableSetOf("Eduardo", "Leonardo", "Andy", "Jose")
        names.forEachIndexed { index, element ->
            println("$index - $element")
        }
    }

}