package com.cetis108.semana08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

    fun mostrarLibro(view: View) {
        // crear una editorial
        val editorial1 = Editorial()
        editorial1.Id = 1
        editorial1.Nombre = "DGETI"
        editorial1.SitioWeb = "https://dgeti.sems.gob.mx"

        // crear un par de autores
        val autor1 = Autor().apply {
            Id = 1
            Nombre = "Bidkar"
            Nacionalidad = "Mexicana"
        }

        val autor2 = Autor().apply {
            Id = 2
            Nombre = "Alexandre"
            Nacionalidad = "Mexicana"
        }

        // crear un libro
        val libro = Libro().apply {
            Id = 1
            Titulo = "Kotlin Avanzado"
            Edicion = 2021
            NumeroDePaginas = 100
            Idioma = "Español"
            Autores.add(autor1)
            Autores.add(autor2)
            Editorial = editorial1
        }

        // crear intent para llamar a LibroActivity
        val intent = Intent(this, LibroActivity::class.java)
        // pasar el objeto libro previamente creado
        intent.putExtra("libro", libro)
        startActivity(intent)
    }
}