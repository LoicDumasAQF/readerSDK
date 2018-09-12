package com.loicdumas.utilsproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.loicdumas.calculator.AnotherCalculator
import com.loicdumas.calculator.Calculator
import kotlinx.android.synthetic.main.activity_sample_main_activity.*

class SampleMainActivIty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_main_activity)


        val a = 8
        val b = 21
        val c = 15


        tv_main_activity.text = "Somme de $a + $b + $c = ${Calculator.addition(a, b, c)}"



        tv_main_activity.text = "${tv_main_activity.text.toString()} \n Somme de $a + $b = ${AnotherCalculator.addition(a, b)}"

    }
}
