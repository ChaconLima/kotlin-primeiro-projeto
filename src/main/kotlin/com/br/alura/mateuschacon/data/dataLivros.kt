package com.br.alura.mateuschacon.data

import com.br.alura.mateuschacon.list.Livro

fun dataLivros(){

    livros.add(
        Livro(titulo = "Sagarana", autor = "João Guimaraes Rosa", anoPublicacao = 1946)
    )

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo:List<Livro> = livros.sortedBy { livro: Livro -> livro.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    val ordenadoPorAutor:List<Livro>  = livros.sortedBy { livro: Livro -> livro.autor }
    ordenadoPorAutor.imprimeComMarcadores()

    val titulos: List<String> = livros
        .filter { livro: Livro -> livro.autor.startsWith("J") }
        .sortedBy { livro: Livro -> livro.anoPublicacao }
        .map { livro: Livro -> livro.titulo }

    println(titulos)


    livros
        .groupBy { livro:Livro -> livro.editora ?: "Editora desconhecida"}
        .forEach { (editora: String, livros: List<Livro>) ->
            println("$editora : ${livros.joinToString { livro: Livro -> livro.titulo }}")
        }

}

