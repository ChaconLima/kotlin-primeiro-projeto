package br.com.alura.mateuschacon.teste

import br.com.alura.mateuschacon.modelos.ContaCorrente
import br.com.alura.mateuschacon.modelos.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(titular = "Alex", numeroConta = 1000)

    val contaPoupanca = ContaPoupanca(titular = "Fran", numeroConta = 1001)

    println("\n Deposito conta")
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    imprimeConta(contaCorrente, contaPoupanca)

    println("\n Saque br.com.alura.mateuschacon.modelos.Conta")
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    imprimeConta(contaCorrente, contaPoupanca)

    println("\n Transferencia br.com.alura.mateuschacon.modelos.Conta")
    contaCorrente.transfere(100.0, contaPoupanca)
    imprimeConta(contaCorrente, contaPoupanca)

    println("\n Transferencia br.com.alura.mateuschacon.modelos.Conta")
    contaPoupanca.transfere(100.0, contaCorrente)
    imprimeConta(contaCorrente, contaPoupanca)
}

private fun imprimeConta(contaCorrente: ContaCorrente, contaPoupanca: ContaPoupanca) {
    println("Saldo br.com.alura.mateuschacon.modelos.Conta corrente: ${contaCorrente.saldo}")
    println("Saldo br.com.alura.mateuschacon.modelos.Conta poupança: ${contaPoupanca.saldo}")
}