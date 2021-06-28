fun testaAutenticacao() {
    val gerente = Gerente(nome = "Alex", senha = 1234, cpf = "111-111-111-11", salario = 2000.0)
    val diretor = Diretor(nome = "Fran", senha = 1234, cpf = "222-222-222-22", salario = 3000.0, plr = 200.0)


    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 1234)
}
