package com.br.alura.mateuschacon.teste

fun testaRangeDeNumerosLetras() {
    val serie: IntRange = 1.rangeTo(10)

    for (s in serie) {
        println("$s")
    }
    println("-----")
    val numerosPares = 2.until(100) step 2
    for (numeropar in numerosPares) {
        println(numeropar)
    }
    println("-----")
    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { println("$it") }
    println("-----")
    val intervalo = 1500.0..5000.0
    val salario = 5000.0
    if (salario in intervalo) {
        println("está no intervalo")
    } else {
        println("não está no intervalo ")
    }
    println("-----")
    val alfabeto = "a".."z"
    val letra = "K"
    println(letra in alfabeto)
}