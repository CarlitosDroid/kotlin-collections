package com.carlitosdroid

object find {

    /**
     * The [find] method returns the FIRST element that matches the condition
     * or Null if such element wasn't found
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here

        val names1 = mutableSetOf("Jose", null, "Juan", null, null)
        val foundElement = names1.find {
            it?.length == 4
        }
        println(foundElement)

        println("------------------------------------------------")

        val names2 = mutableSetOf("Jose", "Pepe", "Juan")
        val foundElement2 = names2.find {
            it.length == 4
        }
        println(foundElement2)
    }

}