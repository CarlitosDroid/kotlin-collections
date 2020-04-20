package com.carlitosdroid

object joinToString {

    // non-comparable class
    class Person(private val firstName: String, private val lastName: String) {
        override fun toString(): String = "$firstName $lastName"
    }

    /**
     * The [joinToString] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val people = mutableListOf(
                Person("Ragnar", "Lodbrok"),
                Person("Bjorn", "Ironside"),
                Person("Sweyn", "Forkbeard")
        )
        println(people.joinToString(separator = ", "))
        println(people.joinToString(separator = "; "))
        println(people.joinToString(separator = " - "))
    }

}