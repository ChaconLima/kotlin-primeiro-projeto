package com.br.alura.mateuschacon.teste

fun testaArrayAumento() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 1000.0)


    val aumento = 1.1
    for ((indice, salario) in salarios.withIndex()) {
        salarios[indice] = salario * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())
}