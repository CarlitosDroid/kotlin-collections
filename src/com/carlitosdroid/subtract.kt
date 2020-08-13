package com.carlitosdroid

object subtract {

    @JvmStatic
    fun main(args: Array<String>) {
        val numbers = listOf(5, 10, 7, 9, 20)
        val evenNumbers = listOf(10, 20)
        val subtractedNumbers = numbers.subtract(evenNumbers)
        println(subtractedNumbers)
    }
}