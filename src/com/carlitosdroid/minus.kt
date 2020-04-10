package com.carlitosdroid

object minus {

    /**
     * The [minus] function returns a Set
     * if there are repeated elements, it removes them
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = mutableSetOf("Carlos", "Ronaldo", "Isaias", "Maria")
        val names2 = listOf("Carlos", "Grecia", "Yuriko")
        val result = names1.minus(names2)
        print(result)
    }

}