package com.loicdumas.readersdk

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.loicdumas.calculator.Calculator
import com.loicdumas.readercalculatorlib.ReaderCalculator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = 8
        val b = 21
        val c = 15


        tv_main_activity.text = "Reader app \n Somme de $a + $b + $c = ${ReaderCalculator.readerAddition(a, b, c)}"

    }
}
