package br.com.alura.mateuschacon.modelos

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : Conta( titular = titular, numeroConta = numeroConta) {

    override fun saca(valor: Double) {
        if(this.saldo>= valor){
            this.saldo-=valor
        }
    }


}