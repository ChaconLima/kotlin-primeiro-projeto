package br.com.alura.mateuschacon.teste

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("br.com.alura.mateuschacon.modelos.Conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}