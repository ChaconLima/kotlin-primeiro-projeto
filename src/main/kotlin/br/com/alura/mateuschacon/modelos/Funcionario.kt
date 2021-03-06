package br.com.alura.mateuschacon.modelos

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    abstract val bonificao: Double
}