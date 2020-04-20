package com.carlitosdroid

object associate {

    /**
     * The [associate] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here

        //SAMPLE 1
        val names = listOf("Grace Hopper", "Jacob Bernoulli", "Johann Bernoulli")
        val byLastName = names.associate { it.split(" ").let { (firstName, lastName) ->
            lastName to firstName } }

        // Jacob Bernoulli does not occur in the map because only the last pair with the same key gets added
        println(byLastName) // {Hopper=Grace, Bernoulli=Johann}


        //SAMPLE 2
        val string = "bonne journée"
        // associate each character with its code
        val result = string.associate { char -> char to char.toInt() }
        // notice each letter occurs only once
        println(result) // {b=98, o=111, n=110, e=101,  =32, j=106, u=117, r=114, é=233}

    }

}