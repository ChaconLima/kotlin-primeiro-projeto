package com.br.alura.mateuschacon.teste

import com.br.alura.mateuschacon.data.imprimeComMarcadores
import com.br.alura.mateuschacon.data.livros
import com.br.alura.mateuschacon.list.Prateleira

fun testaPateleira() {

    val prateleira = Prateleira(genero = "Literatura", livros = livros)
    prateleira.organizarPorAutor().imprimeComMarcadores()
    prateleira.organizarPorAno().imprimeComMarcadores()

}