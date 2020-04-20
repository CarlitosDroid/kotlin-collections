package com.carlitosdroid

object asSequence {

    /**
     * The [asSequence] method returns Unit, you can iterate the elements
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        //SAMPLE 1
        val collection = listOf('a', 'b', 'c')
        val sequence = collection.asSequence()
        println(sequence.joinToString()) // a, b, c
        println(sequence.drop(1).joinToString()) // b, c

        //SAMPLE 2
        val array = arrayOf(1, 2, 3)
        // create a sequence with a function, returning an iterator
        val sequence1 = Sequence { array.iterator() }
        println(sequence1.joinToString()) // 1, 2, 3
        println(sequence1.drop(1).joinToString()) // 2, 3

        //PAY ATTENTION!!!
        // create a sequence from an existing iterator
        // can be iterated only once
        val array2 = arrayOf("Carlos", "Ronaldo", "Isaias")
        val sequence2 = array2.iterator().asSequence()
        println(sequence2.joinToString()) // 1, 2, 3
        //sequence2.drop(1).joinToString() // <- iterating sequence second time will fail
    }

}