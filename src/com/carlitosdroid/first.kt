package com.carlitosdroid

object first {

    /**
     * The [first] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names = mutableSetOf(null, "Juan", "Jose", null, null)
        println("-------- with a nullable list-------")

        val firstElement1 = names.first()
        val firstElement2 = names.first {
            it?.length == 4
        }
        println("$firstElement1")
        println("$firstElement2")
    }

}