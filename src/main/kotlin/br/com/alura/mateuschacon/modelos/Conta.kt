package br.com.alura.mateuschacon.modelos

import br.com.alura.mateuschacon.exception.FalhaAutenticacaoException
import br.com.alura.mateuschacon.exception.SaldoInsuficienteException

abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int
): Autenticalvel by titular {

    var saldo: Double = 0.0
        protected set

    companion object Contador{
        var total: Int = 0
            private set
    }

    init{
        println(" Criando Conta ")
        Contador.total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor;
        }

    }

//    override fun autentica(senha: Int): Boolean {
//        return titular.autentica(senha)
//    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int){

        if(!this.autentica(senha))
            throw FalhaAutenticacaoException()

        if(this.saldo < valor)
            throw SaldoInsuficienteException(mensagem = " Saldo atual: ${this.saldo}, valor a ser abatido: $valor")




        this.saldo -= valor
        destino.deposita(valor)
    }
}