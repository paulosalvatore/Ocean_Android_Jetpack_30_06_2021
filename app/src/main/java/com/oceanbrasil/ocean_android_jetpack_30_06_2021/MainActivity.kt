package com.oceanbrasil.ocean_android_jetpack_30_06_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        Log.d("MainActivity", "onCreate")
//
//        val textView = findViewById<TextView>(R.id.textView)
//        textView.setOnClickListener {
//            textView.text = "Elemento clicado!"
//        }
//    }
//
//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//
//        Log.d("MainActivity", "onSave Instance State")
//
//        val textView = findViewById<TextView>(R.id.textView)
//        outState.putString("VALOR_TEXT_VIEW", textView.text.toString())
//    }
//
//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//
//        Log.d("MainActivity", "onRestore Instance State")
//
//        val textView = findViewById<TextView>(R.id.textView)
//        val valorTextView = savedInstanceState.getString("VALOR_TEXT_VIEW")
//        textView.text = valorTextView
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//
//        Log.d("MainActivity", "Activity destruída!")
//    }
}
