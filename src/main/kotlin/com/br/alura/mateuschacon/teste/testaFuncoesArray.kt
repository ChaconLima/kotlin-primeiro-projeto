package com.br.alura.mateuschacon.teste

fun testaFuncoesArray() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    println("Maior idade: ${idades.maxOrNull()}")

    println("Menor idade: ${idades.minOrNull()}")

    println("Média media: ${idades.average()}")

    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores? : $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Algum é maior de idade ? : $existeMaior")

    val maiores = idades.filter { it >= 18 }
    println("Maiores de 18: $maiores")

    val busca = idades.find { it > 18 }
    println("Busca por 18: $busca")
}