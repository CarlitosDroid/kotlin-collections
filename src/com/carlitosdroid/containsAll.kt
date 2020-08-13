package com.carlitosdroid

object containsAll {

    /**
     * The [containsAll] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableListOf("Carlos", "Leonardo", "Jose", null)
        val containedNames = mutableListOf("Leonardo", "Jose")
        val isContained = names.containsAll(containedNames)
        println(isContained)
    }

}