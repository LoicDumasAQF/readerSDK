package com.loicdumas.calculator
 class Calculator {
     companion object {
        fun deletion(val1: Int, val2: Int) = val1 - val2
        fun multiplication(val1: Int, val2: Int) = val1 * val2
         fun addition(vararg values: Int): Int {
            var result = 0
            for (value in values) {
                result += value
            }
            return result
        }
    }
}
