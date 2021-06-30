package next.com.alura.mateuschacon.modelos

class BancoDeNomes{

    companion object Dados{
        private val nomes = mutableListOf<String>()
    }

    val nomes: Collection<String> get() = Dados.nomes


    fun salva( nome:String){
        Dados.nomes.add(nome)
    }

}