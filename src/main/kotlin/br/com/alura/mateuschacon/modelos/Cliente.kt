package br.com.alura.mateuschacon.modelos

class Cliente (
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    protected val senha: Int,
): Autenticalvel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha ) {
            return true
        }
        return false
    }

}


