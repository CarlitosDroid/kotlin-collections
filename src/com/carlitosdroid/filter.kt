package com.carlitosdroid

object filter {
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableSetOf("Eduardo", "Leonardo", "Andy", "Jose")
        names.filter {
            it.length > 4
        }
        println("remains the same: $names")
        val filterNames = names.filter {
            it.length > 4
        }
        println(filterNames)
    }

}