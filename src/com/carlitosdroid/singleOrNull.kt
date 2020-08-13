package com.carlitosdroid

object singleOrNull {

    /**
     * The [singleOrNull] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = mutableListOf("Carlos", "Leonardo", "Jose", "carloss")
        val names2 = mutableListOf("Carlos")
        val single1 = names1.singleOrNull()
        val single2 = names2.singleOrNull()
        println(single1)
        println(single2)
    }

}