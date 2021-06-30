package com.br.alura.mateuschacon.list

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
){
    fun organizarPorAutor(): List<Livro>{
        return this.livros.sortedBy { livro:Livro -> livro.autor }

    }
    fun organizarPorAno(): List<Livro>{
        return this.livros.sortedBy { livro:Livro -> livro.anoPublicacao }
    }
}
