package ru.samsung.itschool.mdev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textview = findViewById<TextView>(R.id.textView)
        val textplainA = findViewById<EditText>(R.id.editTextA)
        val textplainB = findViewById<EditText>(R.id.editTextB)
        val textplainC = findViewById<EditText>(R.id.editTextC)
        button.setOnClickListener {
            val a = textplainA.text.toString().toDouble()
            val b = textplainB.text.toString().toDouble()
            val c = textplainC.text.toString().toDouble()
            val d = b*b - 4*a*c
            Log.d("RRR",d.toString())
            textview.text = if(d>0) {
                "Есть решения"
            } else {
                "Нет решений"
            }
        }

        Log.d("RRR","onCreate()");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("RRR","onRestart()");
    }

    override fun onResume() {
        super.onResume()
        Log.d("RRR","onResume()");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("RRR","onDestroy()");
    }

    override fun onStop() {
        super.onStop()
        Log.d("RRR","onStop()");
    }

    override fun onPause() {
        super.onPause()
        Log.d("RRR","onPause()");
    }

    override fun onStart() {
        super.onStart()
        Log.d("RRR","onStart()");
    }
}