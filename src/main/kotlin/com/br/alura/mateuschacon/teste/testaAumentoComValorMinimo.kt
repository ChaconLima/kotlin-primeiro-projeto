package com.br.alura.mateuschacon.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun testaAumentoComValorMinimo() {
    //    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
//    salarios[0]="1500.55".toBigDecimal(); salarios[1]="2000.00".toBigDecimal()

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    val aumento: BigDecimal = "1.1".toBigDecimal()
    val salariosComaumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento)}
        .toTypedArray()

    println(salariosComaumento.contentToString())

    val gastoInicial = salariosComaumento.somatoria()
    println("Gasto total Inicial: ${gastoInicial}")

    val meses = "6".toBigDecimal()
    val gastoTotal = salariosComaumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto total em $meses meses: ${gastoTotal}")

//    val salariosOrdenados = salariosComaumento.sorted()
//    val tresUltimosSalarios = salariosOrdenados.takeLast(3).toTypedArray()

    val quantidadeSalarios = 3
    val mediaMaioresSalarios = salariosComaumento
        .sorted()
        .takeLast(quantidadeSalarios)
        .toTypedArray()
        .media()

    println(" Media dos $quantidadeSalarios maiores salarios: $mediaMaioresSalarios")

    val mediaMenoresSalarios = salariosComaumento
        .sorted()
        .take(quantidadeSalarios)
        .toTypedArray()
        .media()

    println(" Media dos $quantidadeSalarios menores salarios: $mediaMenoresSalarios")
}
//-------------------------------------------
// somatório do array
//-------------------------------------------
fun Array<BigDecimal> .somatoria(): BigDecimal{
    return this.reduce { acumulador, valor ->
        acumulador+valor
    }
}
//-------------------------------------------
// Media do array
//-------------------------------------------
fun Array<BigDecimal> .media():BigDecimal{
    return if(this.isEmpty()){ BigDecimal.ZERO }
        else { this.somatoria()/this.size.toBigDecimal()}
}
//-------------------------------------------
// Criação do array BigDecimal
//-------------------------------------------
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(size = valores.size) { i: Int ->
        valores[i].toBigDecimal()
    }
}

//-------------------------------------------
//  Aumento Relativo
//-------------------------------------------
fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000.00".toBigDecimal())
        salario + "500.00".toBigDecimal()
    else
        (salario * aumento).setScale(2, RoundingMode.UP)

