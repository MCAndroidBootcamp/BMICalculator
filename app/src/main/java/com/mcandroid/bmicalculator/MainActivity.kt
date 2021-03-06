package com.mcandroid.bmicalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOnClickListenerForButton()
    }

    private fun calculateBMI():Double{
        var weight: Double = (numWeight.getText().toString().toDouble())
        var height: Double = (numHeight.getText().toString().toDouble())

        return (weight / height / height)
    }

    private fun setOnClickListenerForButton(){
        btnCalculateBMI.setOnClickListener{
            val intent = Intent("com.mcandroid.bmicalculator.BMIResultsScreen")
            intent.putExtra("BMIResult",calculateBMI())
            startActivity(intent)
        }
    }
}
