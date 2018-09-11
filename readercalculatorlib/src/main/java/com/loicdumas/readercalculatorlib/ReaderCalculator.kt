package com.loicdumas.readercalculatorlib

import com.loicdumas.calculator.Calculator

class ReaderCalculator {

    companion object {
        fun readerAddition(vararg values: Int): String {

            return "Reader Calculator : ${Calculator.addition(*values)}"
        }

    }
}