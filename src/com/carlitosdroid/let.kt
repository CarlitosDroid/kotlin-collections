package com.carlitosdroid

object let {

    /**
     * The [let] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here

        val name = listOf("Carlos", "Ronaldo", "Maria")

        name.let { list ->   //TAKE CARE!!!! this return all the list
            println(list)
        }

        name.let { (a) ->
            println(a)
        }

        name.let { (a, b) ->
            println(a)
            println(b)
        }

        name.let { (a, b, c) ->
            println(a)
            println(b)
            println(c)
        }

    }

}