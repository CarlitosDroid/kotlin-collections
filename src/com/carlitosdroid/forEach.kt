package com.carlitosdroid

object forEach {

    /**
     * The [forEach] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableSetOf("Eduardo", "Leonardo", "Andy", "Jose")
        println("-------- with a non-nullable list-------")
        names.forEach {
            println(it)
        }
        println("-------- with a nullable list-------")
        val names2 = listOf("Eduardo", null, "Andy", null)
        names2.forEach {
            println(it)
        }

    }

}