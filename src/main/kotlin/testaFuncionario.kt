fun testaFuncionario() {
    val alex = Funcionario(nome = "Alex", cpf = "111-111-111-11", salario = 1000.0)

    println("\n nome: ${alex.nome} \n cpf: ${alex.cpf} \n salário: ${alex.salario}")
    println("\n Bonificação: ${alex.bonificao}")

    println("-----------------------------")

    val fran = Gerente(nome = "Fran", cpf = "222-222-222-22", salario = 2000.0, senha = 1234)

    println("\n nome: ${fran.nome} \n cpf: ${fran.cpf} \n salário: ${fran.salario}")
    println("\n Bonificação: ${fran.bonificao}")

    if (fran.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    println("-----------------------------")

    val gabi = Diretor(nome = "Gabi", cpf = "333-333-333-33", salario = 6000.0, senha = 1234, plr = 1000.0)

    println("\n nome: ${gabi.nome} \n cpf: ${gabi.cpf} \n salário: ${gabi.salario} \n plr: ${gabi.plr}")
    println("\n Bonificação: ${gabi.bonificao}")

    if (gabi.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    println("-----------------------------")

    val maria = Analista(nome = "Maria", cpf = "444-444-444-44", salario = 1500.0)

    println("\n nome: ${maria.nome} \n cpf: ${maria.cpf} \n salário: ${maria.salario}")
    println("\n Bonificação: ${maria.bonificao}")

    println("-----------------------------")
    val calculadora = CalculadoraBonificacao()

    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gabi)
    calculadora.registra(maria)
    println(" total de bonificação  : ${calculadora.total}")
}