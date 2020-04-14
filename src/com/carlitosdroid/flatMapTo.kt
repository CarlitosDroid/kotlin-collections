package com.carlitosdroid

object flatMapTo {

    data class Customer(val name: String, val age: Int)
    data class Address(val street: String, val number: String)

    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val customerMap = mapOf(
                Pair(Customer("Carlos", 26), Address("NANTERRE CT1", "77471")),
                Pair(Customer("Ronaldo", 38), Address("W NORMA ST2", "77009")),
                Pair(Customer("Maria", 19), Address("S NUGENT AVE3", "77571")),
                Pair(Customer("Isaias", 24), Address("E NAVAHO TRL4", "77449")),
                Pair(Customer("Camille", 46), Address("AVE N5", "77587")))

        val newCustomerList = mutableListOf(Customer("Kelly", 37))

        customerMap.flatMapTo(newCustomerList, {(customer, _) -> listOf(customer)})
        newCustomerList.forEach { println(it) }
    }

}

