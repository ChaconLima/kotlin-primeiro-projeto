class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificao
    }

    fun registra(gerente: Gerente) {
        this.total += gerente.bonificao
    }

    fun registra(diretor: Diretor) {
        this.total += diretor.bonificao
    }

}