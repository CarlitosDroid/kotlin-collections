package com.carlitosdroid

object Main {

    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val words = "A long time ago in a galaxy far far away".split(" ")
        val shortWords = mutableListOf<String>()
        words.getShortWords(shortWords, 3)
        println(shortWords)
    }

    private fun List<String>.getShortWords(shortWords: MutableList<String>, maxLength: Int) {

//        this.filter(shortWords) {
//            it.length <= maxLength
//        }
//        println(shortWords)
//        val articles = setOf("a", "A", "an", "An", "the", "The")
//        shortWords -= articles
    }

}