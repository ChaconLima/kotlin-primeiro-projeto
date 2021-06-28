abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    open val bonificao: Double
        get() {
            return this.salario * 0.1
        }
}