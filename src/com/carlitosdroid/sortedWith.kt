package com.carlitosdroid

object sortedWith {

    // non-comparable class
    class Person(val firstName: String, val lastName: String) {
        override fun toString(): String = "$firstName $lastName"
    }

    /**
     * The [sortedWith] method returns list, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here

        val people = mutableListOf(
                Person("Ragnar", "Lodbrok"),
                Person("Bjorn", "Ironside"),
                Person("Sweyn", "Forkbeard")
        )

        val sortedList = people.sortedWith(compareBy { it.firstName })

        // after sorting
        println(sortedList) // B, R, S (ordered)
        println(people) // remains the same
    }

}