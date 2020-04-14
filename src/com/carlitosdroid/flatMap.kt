package com.carlitosdroid

object flatMap {

    data class Customer(val name: String, val age: Int)
    data class Address(val street: String, val number: String)

    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val customerMap = mapOf(
                Pair(Customer("Jack", 25), Address("NANTERRE CT", "77471")),
                Pair(Customer("Mary", 37), Address("W NORMA ST", "77009")),
                Pair(Customer("Peter", 18), Address("S NUGENT AVE", "77571")),
                Pair(Customer("Amos", 23), Address("E NAVAHO TRL", "77449")),
                Pair(Customer("Craig", 45), Address("AVE N", "77587")))

        val customerList = customerMap.flatMap { (customer, _) -> listOf(customer) }
        customerList.forEach { println(it) }

        val addressList = customerMap.flatMap { (_, address) -> listOf(address) }
        addressList.forEach{ println(it) }

        val customerInfos = customerMap.flatMap { (customer, address) -> listOf("${customer.name} lives at ${address.street}") }
        customerInfos.forEach{ println(it) }
    }

}

