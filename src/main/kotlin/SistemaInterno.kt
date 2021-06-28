class SistemaInterno {

    fun entra(gerente: FuncionarioAdmin, senha:Int){

        if(gerente.autentica(senha)){
            println("Bem vindo: ${gerente.nome}")
        } else {
            println(" Falha na autenticação")
        }
    }

}