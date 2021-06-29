package com.br.alura.mateuschacon.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun testaAumentoComValorMinimo() {
    //    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
//    salarios[0]="1500.55".toBigDecimal(); salarios[1]="2000.00".toBigDecimal()

    val salarios = bigDecimalArrayOf("1500.00", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    val aumento: BigDecimal = "1.1".toBigDecimal()
    val salariosComaumento: Array<BigDecimal> =
        salarios.map { salario ->
            if (salario < "5000.00".toBigDecimal())
                salario + "500.00".toBigDecimal()
            else
                (salario * aumento).setScale(2, RoundingMode.UP)
        }.toTypedArray()

    println(salariosComaumento.contentToString())
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(size = valores.size) { i: Int ->
        valores[i].toBigDecimal()
    }
}