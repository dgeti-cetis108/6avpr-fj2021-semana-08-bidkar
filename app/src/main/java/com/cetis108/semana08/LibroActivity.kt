package com.cetis108.semana08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LibroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_libro)

        // obtener la variable enviada desde MainActivity
        val libro = intent.getSerializableExtra("libro") as Libro

        // obtener acceso a las vistas de la pantalla libro
        val textViewLibroId = findViewById<TextView>(R.id.tvLibroId)
        val textViewLibroTitulo = findViewById<TextView>(R.id.tvLibroTitulo)
        val textViewLibroEdicion = findViewById<TextView>(R.id.tvLibroEdicion)
        val textViewLibroNumeroDePagina = findViewById<TextView>(R.id.tvLibroNumeroDePagina)
        val textViewLibroIdioma = findViewById<TextView>(R.id.tvLibroIdioma)
        val textViewLibroAutores = findViewById<TextView>(R.id.tvLibroAutores)
        val textViewLibroEditorial = findViewById<TextView>(R.id.tvLibroEditorial)

        // asignando valores a las vistas de la pantalla libro
        textViewLibroId.text = libro.Id.toString()
        textViewLibroTitulo.text = libro.Titulo
        textViewLibroEdicion.text = libro.Edicion.toString()
        textViewLibroNumeroDePagina.text = libro.NumeroDePaginas.toString()
        textViewLibroIdioma.text = libro.Idioma
        textViewLibroEditorial.text = libro.Editorial!!.Nombre

        // concatenar autores
        var autores: ArrayList<String> = ArrayList<String>()
        libro.Autores.forEach {
            autores.add(it.Nombre.toString())
        }
        textViewLibroAutores.text = autores.joinToString(", ")
    }
}