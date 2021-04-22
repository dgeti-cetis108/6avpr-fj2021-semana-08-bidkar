package com.cetis108.semana08

import java.io.Serializable

class Libro: Serializable {
    var Id: Int? = null
    var Titulo: String? = null
    var Edicion: Int? = null
    var NumeroDePaginas: Int? = null
    var Idioma: String? = null
    var Autores: ArrayList<Autor> = ArrayList<Autor>()
    var Editorial: Editorial? = null
}