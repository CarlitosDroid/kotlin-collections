package com.carlitosdroid

object sumByDouble {

    @JvmStatic
    fun main(args: Array<String>) {
        val numbers = listOf(5, 10, 20, 40)
        val sumNumbers = numbers.sumByDouble {
            it * 2.0
        }
        println(sumNumbers)
    }
}