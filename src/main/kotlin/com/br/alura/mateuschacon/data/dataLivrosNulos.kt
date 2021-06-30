package com.br.alura.mateuschacon.data

import com.br.alura.mateuschacon.list.Livro

fun dataLivrosNulos() {

    livrosNulos.add(
        Livro(titulo = "Sagarana", autor = "João Guimaraes Rosa", anoPublicacao = 1946)
    )


    livrosNulos.imprimeComMarcadores()
}