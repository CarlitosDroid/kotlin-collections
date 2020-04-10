package com.carlitosdroid

object filterNotTo {

    /**
     * The [filterNotTo] function returns a List.
     * Both list must be of the same type, for example: (List<String?>), (MutableList<String?>)
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val names1 = listOf("Eduardo", null, "Mari", null, "Jose", "Juan")// list of nullable String
        val names2 = mutableListOf<String?>()// list of nullable String
        val names3 = names1.filterNotTo(names2) {
            it == null
        }
        println("It remains the same: $names1")
        println("$names2")
        println("$names3")
    }
}