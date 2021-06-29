import br.com.alura.mateuschacon.exception.SaldoInsuficienteException
import br.com.alura.mateuschacon.modelos.Endereco
import br.com.alura.mateuschacon.teste.*
import java.lang.ClassCastException
import java.lang.Exception


fun main() {
    println("inicio da main ")
    testeComportamentosConta()
    println("fim da main")
}
fun funcao1 (){
    println("inicio da funcão 1")
    try {
        funcao2()
    }catch ( e: SaldoInsuficienteException){
        e.printStackTrace()
    }
    println("fim da funcao 1")

}
fun funcao2() {
    println("inicio da funcao 2")

    for ( i in 1..5){
        println(i)
        val endereco = Any()
        throw SaldoInsuficienteException()

    }
    println("fim da funcao 2")
}














