package com.carlitosdroid

object minusAssign {

    /**
     * the minusAssign only works for a mutable collections
     * and the second list can be mutable collection or just collections
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = mutableSetOf("Carlos", "Ronaldo", "Isaias", "Maria")
        val names2 = listOf("Carlos", "Grecia", "Yuriko")
        names1.minusAssign(names2)
        print(names1)
    }

}
