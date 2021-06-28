class SistemaInterno {

    fun entra(admin: Autenticalvel, senha: Int) {

        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println(" Falha na autenticação")
        }
    }

}