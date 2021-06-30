package com.br.alura.mateuschacon.data

import com.br.alura.mateuschacon.list.Livro

fun List<Livro?>.imprimeComMarcadores(){
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") { livro: Livro ->
        "- ${livro.titulo} de ${livro.autor}"
    }
    println(" ### Lista de Livros ### \n$textoFormatado")
}