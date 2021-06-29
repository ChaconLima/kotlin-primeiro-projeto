package br.com.alura.mateuschacon.teste

import br.com.alura.mateuschacon.exception.FalhaAutenticacaoException
import br.com.alura.mateuschacon.exception.SaldoInsuficienteException
import br.com.alura.mateuschacon.modelos.Cliente
import br.com.alura.mateuschacon.modelos.Conta
import br.com.alura.mateuschacon.modelos.ContaCorrente
import br.com.alura.mateuschacon.modelos.ContaPoupanca

fun testeComportamentosConta() {

    println("-------------------------------")
    val alex = Cliente(nome = "Alex", cpf = "123", senha = 1234)
    val contaAlex = ContaPoupanca(titular = alex, numeroConta = 1000)
    println(contaAlex.titular.nome)
    println(contaAlex.numeroConta)
    println(contaAlex.saldo)

    val fran = Cliente(nome = "Fran", cpf = "123", senha = 1234)
    val contaFran = ContaCorrente(titular = fran, numeroConta = 1001)
    println(contaFran.titular.nome)
    println(contaFran.numeroConta)
    println(contaFran.saldo)

    println("-------------------------------")

    println("depositando na conta do Alex")
    contaAlex.deposita(2000.0)
    println("contaAlex: ${contaAlex.saldo}")

    println("depositando na conta do Fran")
    contaFran.deposita(1800.0)
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

    try {
        contaFran.transfere(valor = 350.0, destino = contaAlex, senha = 1234)
        println("Transferencia sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferencia")
        println("saldo é insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferencia")
        println("Error na autenticação")
        e.printStackTrace()
    } catch (e: Exception) {
        e.printStackTrace()
    }





    println("contaAlex: ${contaAlex.saldo}")
    println("contaFran: ${contaFran.saldo}")

    println(Conta.total)
}