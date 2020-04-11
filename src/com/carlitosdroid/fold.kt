package com.carlitosdroid

import java.math.BigDecimal

object fold {

    data class Application(val name: String, val score: BigDecimal)

    /**
     * reduce vs fold
     * Kotlin also provides a very commonly used function named fold which does the same thing as reduce.
     * The difference between the two is that fold takes an explicit initial value,
     * whereas reduce  uses the first element from the list as the initial value.
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val total: BigDecimal = listOf(
                Application("a", BigDecimal("100")),
                Application("b", BigDecimal("100")))
                .map { it.score }
                .fold(BigDecimal.ZERO, { total, next -> total.plus(next) }) // The ZERO is the explicit initial value
        println("total: $total")
    }

}