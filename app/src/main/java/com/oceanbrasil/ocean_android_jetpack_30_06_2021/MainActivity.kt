package com.oceanbrasil.ocean_android_jetpack_30_06_2021

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//class Pessoa(val nome: String) {
//    fun exibirNome() {
//        println(nome)
//    }
//}
//
//object Calculadora {
//    fun somar(a: Int, b: Int) = a + b
//}
//
//class Calculadora2(val marca: String) {
//    companion object {
//        fun somar(a: Int, b: Int) = a + b
//    }
//
//    fun exibirMarca() {
//        println(marca)
//    }
//}
//
//fun exemplo() {
//    val paulo = Pessoa("Paulo Salvatore")
//    val lais = Pessoa("Laís Dias")
//
//    paulo.exibirNome()
//    lais.exibirNome()
//
//    Pessoa("Tenysson").exibirNome()
//
//    Calculadora.somar(1, 5)
//
//    Calculadora2.somar(5, 6)
//
//    val samsung = Calculadora2("Samsung")
//    samsung.exibirMarca()
//}

class TextViewModel : ViewModel() {
    val text = "Hello, world!"
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textViewModel = ViewModelProvider(this).get(TextViewModel::class.java)
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
