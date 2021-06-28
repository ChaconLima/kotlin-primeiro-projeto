package br.com.alura.mateuschacon.teste

import br.com.alura.mateuschacon.modelos.Cliente
import br.com.alura.mateuschacon.modelos.ContaCorrente
import br.com.alura.mateuschacon.modelos.ContaPoupanca
import br.com.alura.mateuschacon.modelos.Endereco

fun testaContasDiferentes() {

    val enderecoAlex = Endereco(
        logradouro = "Rua inácio guedes",
        numero = 91,
        bairro = "Recanto das Acacias",
        complemento = "Conjuto habitacional",
        cep = "38360-000",
        estado = "Minas Gerais"
    )
    val alex = Cliente(nome = "Alex", cpf = "123", senha = 1234, endereco = enderecoAlex)
    val contaCorrente = ContaCorrente(titular = alex, numeroConta = 1000)

    val fran = Cliente(nome = "Fran", cpf = "123", senha = 1234)
    val contaPoupanca = ContaPoupanca(titular = fran, numeroConta = 1001)

    println("\n Deposito conta")
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    imprimeConta(contaCorrente, contaPoupanca)

    println("\n Saque Conta")
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    imprimeConta(contaCorrente, contaPoupanca)

    println("\n Transferencia Conta")
    contaCorrente.transfere(100.0, contaPoupanca)
    imprimeConta(contaCorrente, contaPoupanca)

    println("\n Transferencia Conta")
    contaPoupanca.transfere(100.0, contaCorrente)
    imprimeConta(contaCorrente, contaPoupanca)
}

private fun imprimeConta(contaCorrente: ContaCorrente, contaPoupanca: ContaPoupanca) {
    println("Saldo Conta corrente: ${contaCorrente.saldo}")
    println("Saldo Conta poupança: ${contaPoupanca.saldo}")
}