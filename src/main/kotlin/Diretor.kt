class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double

) : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha){

    override val bonificao: Double
        get() {
            return this.salario + this.plr
        }

}