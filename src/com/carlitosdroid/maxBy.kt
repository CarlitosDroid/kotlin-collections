package com.carlitosdroid

object maxBy {

    data class Product(val name: String, val price: Double)

    /**
     * The [maxBy] functions returns the bigger element
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val productList = setOf(
                Product("Samsung Galaxy S8 64GB Unlocked Phone", 699.99),
                Product("iPad Pro 9.7-inch 32 GB", 474.98),
                Product("Samsung Electronics Ultra HD Smart LED TV", 677.92),
                Product("Google Pixel Phone - 5 inch display", 279.95),
                Product("iPad Pro 9.7-inch 128G", 574.99),
                Product("Google Wifi system 1-Pack", 149.90),
                Product("iPhone 8 Plus 64G", 850.00),
                Product("Samsung Galaxy Tab 4", 127.67))

        val productWithHighestPrice = productList.maxBy { it.price }

        println(productWithHighestPrice)
    }

}