package br.com.alura.mateuschacon.modelos

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int

) : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha) {

    override val bonificao: Double
        get() {
            return this.salario
        }

}