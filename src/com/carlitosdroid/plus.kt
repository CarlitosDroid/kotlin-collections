package com.carlitosdroid

object plus {

    /**
     * The [plus] functions returns a Set
     * if there are repeated elements, it doesn't add them
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = mutableSetOf("Carlos", "Ronaldo", "Isaias", "Maria")
        val names2 = listOf("Carlos", "Grecia", "Yuriko")
        val result = names1.plus(names2)
        print(result)
    }

}