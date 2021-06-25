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