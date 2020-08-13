package com.carlitosdroid

object subList {

    @JvmStatic
    fun main(args: Array<String>) {
        val numbers = listOf(5, 10, 7, 9, 20)
        val subList1 = numbers.subList(0, 0)//these are the index
        val subList2 = numbers.subList(0, 2)//take care, pick up the elements in position 0 and 1
        println(subList1)
        println(subList2)
    }
}