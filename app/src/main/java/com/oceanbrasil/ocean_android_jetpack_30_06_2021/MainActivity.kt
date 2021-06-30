package com.oceanbrasil.ocean_android_jetpack_30_06_2021

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.oceanbrasil.ocean_android_jetpack_30_06_2021.databinding.ActivityMainBinding

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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        val textViewModel =
            ViewModelProvider(this)
                .get(TextViewModel::class.java)

        binding.viewModel = textViewModel

        val textView = findViewById<TextView>(R.id.textView)

        // Evento clique normal
        textView.setOnClickListener {
            textViewModel.text.set("Elemento clicado!")
        }

        // Evento clique longo
        textView.setOnLongClickListener {
            textViewModel.text.set("Elemento clicado 2!")

            true
        }

        val cronometroViewModel =
            ViewModelProvider(this)
                .get(CronometroViewModel::class.java)

//        val textView = findViewById<TextView>(R.id.textView)

//        cronometroViewModel.elapsedTime.observe(this, {
//            textView.text = "$it segundo(s) se passaram."
//        })

/*
        val textViewModel =
            ViewModelProvider(this)
                .get(TextViewModel::class.java)

        val textView = findViewById<TextView>(R.id.textView)

        // Lógica de Apresentação
        textViewModel.text.observe(this, {
            textView.text = it
        })

        // Evento clique normal
        textView.setOnClickListener {
            textViewModel.text.value = "Elemento clicado!"
        }

        // Evento clique longo
        textView.setOnLongClickListener {
            textViewModel.text.value = "Elemento clicado 2!"

            true
        }
*/
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
