package com.carlitosdroid

object plusAssign {

    /**
     * The [plusAssign] method returns only Unit, and only works with mutable collections
     * if there are repeated elements, it doesn't add them
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = mutableSetOf("Carlos", "Ronaldo", "Isaias", "Maria")
        val names2 = mutableListOf("Carlos", "Grecia", "Yuriko")
        names1.plusAssign(names2)
        print(names1)
    }

}