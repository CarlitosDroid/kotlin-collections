package com.carlitosdroid

object plusAssign {

    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = mutableSetOf("Carlos", "Ronaldo", "Isaias", "Maria")
        val names2 = mutableListOf("Carlos", "Grecia", "Yuriko")
        names1.plusAssign(names2)
        print(names1)
    }

}