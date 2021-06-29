package br.com.alura.mateuschacon.teste

import br.com.alura.mateuschacon.modelos.Endereco

fun testaEnderecos() {
    println("-----------------------------")
    val endereco = Endereco(
        estado = "Minas Gerais",
        cep = "38360-000",
        bairro = "Recando das Acácias",
        logradouro = "Rua Inácio Guedes",
        complemento = "Conjuto habitacional",
        numero = 91
    )
    println(endereco.toString())
    println("-----------------------------")
    val endereco1 = Endereco(
        estado = "Minas Gerais",
        cep = "38360-000",
        bairro = "Recando das Acácias",
        logradouro = "Rua Inácio Guedes",
        complemento = "Conjuto habitacional",
        numero = 91
    )
    println(endereco1.toString())
    println("-----------------------------")
    val endereco2 = Endereco(
        estado = "São Paulo",
        cep = "38360-000",
        bairro = "Recando das Acácias",
        logradouro = "Rua Inácio Guedes",
        complemento = "Conjuto habitacional",
        numero = 91
    )
    println(endereco2.toString())

    println("------Iguais-----------")
    println(" ${endereco.estado} == ${endereco1.estado}: ${endereco.equals(endereco1)}")
    println(" ${endereco1.estado} == ${endereco2.estado}: ${endereco1.equals(endereco2)}")
    println(" ${endereco2.estado} == ${endereco.estado}: ${endereco2.equals(endereco)}")
}