fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(nome = "Alex", cpf = "111-111-111-11", salario = 1000.0)

    println( "\n nome: ${alex.nome} \n cpf: ${alex.cpf} \n salário: ${alex.salario}")
    println("\n Bonificação: ${alex.bonificao()}")
}






