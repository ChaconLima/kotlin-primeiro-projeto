class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int

) {

    fun bonificao(): Double {
        return this.salario * 0.4
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}