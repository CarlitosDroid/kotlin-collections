package com.carlitosdroid

object sortWith {

    // non-comparable class
    class Person(val firstName: String, val lastName: String) {
        override fun toString(): String = "$firstName $lastName"
    }

    /**
     * The [sortWith] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val people = mutableListOf(
                Person("Ragnar", "Lodbrok"),
                Person("Bjorn", "Ironside"),
                Person("Sweyn", "Forkbeard")
        )

        people.sortWith(compareByDescending { it.firstName }) // S, R, B

        // after sorting
        println(people) //  Sweyn Forkbeard, Ragnar Lodbrok, Bjorn Ironside
    }

}