package br.com.alura.mateuschacon.modelos

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
) : Conta( titular = titular, numeroConta = numeroConta) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1

    }

}