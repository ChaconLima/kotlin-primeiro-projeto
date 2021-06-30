package com.br.alura.mateuschacon.data

import com.br.alura.mateuschacon.list.Livro

fun dataLivros(){
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = " João Guimarães Rosa",
        anoPublicacao = 1956
    )
    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )
    val livro3 = Livro(
        titulo = "Memória Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )
    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1856,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(titulo = "Sagarana", autor = "João Guimaraes Rosa", anoPublicacao = 1946)
    )

    livros.imprimeComMarcadores()

    livros.remove(livro1)

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

}

fun List<Livro>.imprimeComMarcadores(){
    val textoFormatado = this.joinToString(separator = "\n") { livro: Livro ->
        "- ${livro.titulo} de ${livro.autor}"
    }
    println(" ### Lista de Livros ### \n$textoFormatado")
}