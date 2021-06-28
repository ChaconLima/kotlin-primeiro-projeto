class Analista(
    nome: String,
    cpf: String,
    salario: Double,


) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificao: Double
        get() {
            return this.salario * 0.1
        }

}