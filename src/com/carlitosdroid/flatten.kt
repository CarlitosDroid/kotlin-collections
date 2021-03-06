package com.carlitosdroid

object flatten {

    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        println(simpleFlattenedList(listOf(listOf(1, 2, 3), listOf("one", "two", "three"))))
        // [1, 2, 3, one, two, three]

        println(flattenedArray(arrayOf(arrayOf(1), arrayOf(2, 3), arrayOf(4, 5))))
        // [1, 2, 3, 4, 5]
    }

    private fun simpleFlattenedList(list: List<List<Any>>): List<Any> {
        return list.flatten()
    }

    private fun flattenedArray(array: Array<Array<Int>>): List<Int> {
        return array.flatten()
    }

}

