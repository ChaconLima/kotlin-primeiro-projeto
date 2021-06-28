fun main() {
    println("Bem vindo ao Bytebank")

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


    //https://github.com/zup-academy/nosso-cartao-documentacao/tree/master/orange-talent-5#:~:text=final%20do%20curso-,Kotlin%3A%20heran%C3%A7a%2C%20polimorfismo%20e%20interface,-Clique%20aqui%20para
}

private fun imprimeConta(contaCorrente: ContaCorrente, contaPoupanca: ContaPoupanca) {
    println("Saldo Conta corrente: ${contaCorrente.saldo}")
    println("Saldo Conta poupança: ${contaPoupanca.saldo}")
}








