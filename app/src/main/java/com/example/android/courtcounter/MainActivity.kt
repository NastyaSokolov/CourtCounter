package com.example.android.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a_3point.setOnClickListener {
            var i = result_a.text.toString().toInt()
            result_a.text = (i + 3).toString()
        }
        a_2point.setOnClickListener {
            var i = result_a.text.toString().toInt()
            result_a.text = (i + 2).toString()
        }
        a_free.setOnClickListener {
            var i = result_a.text.toString().toInt()
            result_a.text = (i + 1).toString()
        }


        b_3point.setOnClickListener {
            var i = result_b.text.toString().toInt()
            result_b.text = (i + 3).toString()
        }
        b_2point.setOnClickListener {
            var i = result_b.text.toString().toInt()
            result_b.text = (i + 2).toString()
        }
        b_free.setOnClickListener {
            var i = result_b.text.toString().toInt()
            result_b.text = (i + 1).toString()
        }
        reset.setOnClickListener{
            result_a.text="0"
            result_b.text="0"
        }
    }
}