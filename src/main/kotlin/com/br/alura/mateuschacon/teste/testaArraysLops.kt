package com.br.alura.mateuschacon.teste

fun testaArraysLops() {
    //val idades = IntArray(size = 4)
    //idades[0] = 25; idades[1] = 19; idades[2] = 33; idades[3] = 20

    val idades = intArrayOf(25, 19, 33, 20, 55, 40, 88, 12)

    var maiorIdade = 0

    for (idade in idades) {
        if (maiorIdade < idade) {
            maiorIdade = idade
        }
    }
    println("Maior idade: $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (menorIdade > idade) {
            menorIdade = idade
        }
    }
    println("Menor idade: $menorIdade")
}