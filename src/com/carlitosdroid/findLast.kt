package com.carlitosdroid

object findLast {

    /**
     * The [findLast] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableSetOf("Jose", null, null, null, null)
        println("-------- with a nullable list-------")
        val lastElement = names.findLast {
            it?.length == 4
        }
        println("list of null is equal to a list of one null element: $names")
        println(lastElement)

        val names2 = mutableSetOf("Eduardo", "Leonardo", "Andy", "Jose")
        println("-------- with a non-nullable list-------")
        val lastElement2 = names2.findLast {
            it.length == 4
        }
        println("it remains the same: $names2")
        println(lastElement2)
    }

}