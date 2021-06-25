fun main() {

    println("Bem vindo ao Bytebank")

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


class Conta(
    val titular: String,
    val numeroConta: Int
) {

    var saldo: Double = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor;
        }

    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }

    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}


fun testaLacosCrescente() {
    var i = 0
    while (i < 5) {
        val titular: String = "Mateus $i"
        val numeroConta: Int = 1234 + i
        var saldo: Double = i + 10.0

        println("titular: $titular")
        println("número da conta: $numeroConta")
        println("saldo da conta: $saldo")

        testaCondicoes(saldo)
        println("\n")
        i++
    }
}

fun testaLacosDecrecente() {
    for (i in 10 downTo 1 step 2) {

        val titular: String = "Mateus $i"
        val numeroConta: Int = 1234 + i
        var saldo: Double = i + 10.0

        println("titular: $titular")
        println("número da conta: $numeroConta")
        println("saldo da conta: $saldo")

        testaCondicoes(saldo)
        println("\n")
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}