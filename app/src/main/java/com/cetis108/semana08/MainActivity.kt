package com.cetis108.semana08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_second = findViewById<Button>(R.id.btnMainSecond)
        btn_second.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val nombre = "Bidkar"
            intent.putExtra("nombre", nombre)
            intent.putExtra("saludo", "Hola desde el MainActivity")
            startActivity(intent)
        }
    }
}