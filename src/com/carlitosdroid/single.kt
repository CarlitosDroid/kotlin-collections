package com.carlitosdroid

object single {

    /**
     * The [single] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = mutableListOf("Carlos")
        val names2 = mutableListOf("Carlos", "Leonardo", "Jose", "Alexis")
        val single1 = names1.single()
        println(single1)
        val single2 = names2.single()
        println(single2)//exception if there are more than a single element
    }

}