package com.carlitosdroid

object iterator {

    /**
     * The [iterator] extends from [Iterable] and is similar to foreach for a list
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        //SAMPLE 1
        val numbers = listOf("one", "two", "three", "four")
        val numbersIterator = numbers.iterator()
        while (numbersIterator.hasNext()) {
            println(numbersIterator.next())
        }

        //SAMPLE 2
        val array = listOf(1, 2, 3)
        val sequence2 = array.iterator()
        println(sequence2.next()) // 1
        println(sequence2.next()) // 2
    }

}