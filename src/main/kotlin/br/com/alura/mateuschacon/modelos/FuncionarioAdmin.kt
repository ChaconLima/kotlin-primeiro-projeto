package br.com.alura.mateuschacon.modelos

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
): Funcionario(nome=nome,cpf=cpf,salario=salario), Autenticalvel {

    override fun autentica(senha: Int): Boolean {

        if (this.senha == senha) {
            return true
        }
        return false
    }
}