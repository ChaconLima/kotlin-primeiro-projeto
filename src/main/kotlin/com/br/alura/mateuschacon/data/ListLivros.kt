package com.br.alura.mateuschacon.data

import com.br.alura.mateuschacon.list.Livro

val livros: MutableList<Livro> = mutableListOf(

    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = " João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    Livro (
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Memória Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1856,
        editora = "Editora B"
    )
)
val livrosNulos: MutableList<Livro?> = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = " João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    null,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Memória Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    null,
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1856,
        editora = "Editora B"
    )
)