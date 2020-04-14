package com.carlitosdroid

object removeIf {

    /**
     * The [removeIf] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableSetOf("Eduardo", "Leonardo", "Andy", "Jose")
        val simplifiedList = names.removeIf {
            it.length == 4
        }
        println("modified: $names")
        println(simplifiedList)
    }

}