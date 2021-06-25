fun testeComportamentosConta() {

    val contaAlex = Conta(titular = "Alex", numeroConta = 1000)
    println(contaAlex.titular)
    println(contaAlex.numeroConta)
    println(contaAlex.saldo)

    val contaFran = Conta(titular = "Fran", numeroConta = 1001)
    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.saldo)

    println("-------------------------------")

    println("depositando na conta do Alex")
    contaAlex.deposita(2000.0)
    println("contaAlex: ${contaAlex.saldo}")

    println("depositando na conta do Fran")
    contaFran.deposita(3000.0)
    println("contaFran: ${contaFran.saldo}")

    println("-------------------------------")

    println("saque na conta do Alex")
    contaAlex.saca(250.0)
    println("contaAlex: ${contaAlex.saldo}")

    println("saque na conta do Fran")
    contaFran.saca(150.0)
    println("contaFran: ${contaFran.saldo}")

    println("-------------------------------")

    println("Transferencia da Conta da Fran para o Alex")

    if (contaFran.transfere(valor = 1800.0, destino = contaAlex)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }
    println("contaAlex: ${contaAlex.saldo}")
    println("contaFran: ${contaFran.saldo}")
}