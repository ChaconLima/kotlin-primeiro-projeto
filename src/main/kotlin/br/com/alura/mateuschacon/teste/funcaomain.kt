package br.com.alura.mateuschacon.teste

import br.com.alura.mateuschacon.modelos.Endereco
import java.lang.ClassCastException
import java.lang.NumberFormatException

fun funcaomain() {
    println("inicio main")

    val entrada: String = "1.9"

    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        e.printStackTrace(); null
    }

    val valorComTaxa: Double? = if (valor != null) {
        valor * 0.1
    } else {
        null
    }

    if (valorComTaxa != null && valor != null) {

        println("valor recebido: ${valor + valorComTaxa}")
    } else {
        println("valor Invalido")
    }

    funcao1()
    println("fim da main")
}

fun funcao1 (){
    println("inicio da funcão 1")
    try {
        funcao2()
    }catch ( e: ClassCastException){
        e.printStackTrace()
    }
    println("fim da funcao 1")

}
fun funcao2() {
    println("inicio da funcao 2")

    for ( i in 1..5){
        val endereco = Any()
        endereco as Endereco
        println(i)
    }
    println("fim da funcao 2")
}
