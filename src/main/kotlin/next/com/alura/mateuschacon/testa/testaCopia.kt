package next.com.alura.mateuschacon.testa

import next.com.alura.mateuschacon.modelos.BancoDeNomes

fun testaCopia() {

    val banco = BancoDeNomes()
    banco.salva("Alex")
    println(BancoDeNomes().nomes)
}