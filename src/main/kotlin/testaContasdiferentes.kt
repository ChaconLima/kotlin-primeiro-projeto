fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(titular = "Alex", numeroConta = 1000)

    val contaPoupanca = ContaPoupanca(titular = "Fran", numeroConta = 1001)

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