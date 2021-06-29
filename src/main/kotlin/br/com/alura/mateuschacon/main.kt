import br.com.alura.mateuschacon.modelos.Endereco


fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua vergueiro")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {  endereco: Endereco ->
        println(endereco.logradouro.length)
    }
}















