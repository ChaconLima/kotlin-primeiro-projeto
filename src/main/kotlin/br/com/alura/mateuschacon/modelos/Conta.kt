package br.com.alura.mateuschacon.modelos

abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int
) {

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

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}