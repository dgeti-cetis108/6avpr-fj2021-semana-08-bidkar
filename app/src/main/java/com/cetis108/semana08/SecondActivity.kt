package com.cetis108.semana08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val saludo = intent.getStringExtra("saludo")
        val nombre = intent.getStringExtra("nombre")
        Toast.makeText(this, "$saludo, tu nombre es $nombre", Toast.LENGTH_LONG).show()
    }
}