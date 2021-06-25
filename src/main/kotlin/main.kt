fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(nome = "Alex", cpf = "111-111-111-11", salario = 1000.0)

    println( "\n nome: ${alex.nome} \n cpf: ${alex.cpf} \n salário: ${alex.salario}")
    println("\n Bonificação: ${alex.bonificao()}")

    println("-----------------------------")

    val fran = Gerente(nome = "Fran", cpf = "222-222-222-22", salario = 2000.0, senha = 1234)

    println( "\n nome: ${fran.nome} \n cpf: ${fran.cpf} \n salário: ${fran.salario}")
    println("\n Bonificação: ${fran.bonificao()}")

    if( fran.autentica(1234)){
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }
}






