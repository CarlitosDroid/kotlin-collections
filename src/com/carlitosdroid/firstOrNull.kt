package com.carlitosdroid

object firstOrNull {

    /**
     * The [firstOrNull] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here

        val names1: MutableSet<String?>? = null
        val firstElement1 = names1?.firstOrNull()
        println("$firstElement1")
        println("-----------------------------------------")
        val names2: MutableSet<String?>? = mutableSetOf(null, "Juan", "Jose", null, null)
        val firstElement2 = names2?.firstOrNull()
        val firstElement3 = names2?.firstOrNull {
            it?.length == 4
        }
        println("$firstElement2")
        println("$firstElement3")
    }

}