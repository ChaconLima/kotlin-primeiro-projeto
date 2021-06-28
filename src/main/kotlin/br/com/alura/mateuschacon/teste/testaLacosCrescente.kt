package br.com.alura.mateuschacon.teste

fun testaLacosCrescente() {
    var i = 0
    while (i < 5) {
        val titular: String = "Mateus $i"
        val numeroConta: Int = 1234 + i
        var saldo: Double = i + 10.0

        println("titular: $titular")
        println("número da conta: $numeroConta")
        println("saldo da conta: $saldo")

        testaCondicoes(saldo)
        println("\n")
        i++
    }
}