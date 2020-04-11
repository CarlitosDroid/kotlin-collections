package com.carlitosdroid

object reduce {

    /**
     * reduce vs fold
     * The [reduce] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val numbers = mutableSetOf(1, 2, 3, 4)
        val sum = numbers.reduce { x, y ->
            println("$x - $y")
            x + y
        }
        println(sum)

        println("------------------------------------------------")

        val letters = mutableSetOf("a", "b", "c", "d")
        val word = letters.reduce { x, y ->
            println("$x - $y")
            x + y
        }
        println(word)
    }

}