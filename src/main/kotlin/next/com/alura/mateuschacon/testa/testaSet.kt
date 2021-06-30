package next.com.alura.mateuschacon.testa

fun testaSet() {
    val assistiramCursoAndroid: List<String> = listOf("Alex", "Fran", "Gui", "Max")
    val assistiramCursoKotlin: List<String> = listOf("Alex", "Paulo", "Max")
    val assistiramAmbos: MutableSet<String> = mutableSetOf<String>()

    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.addAll(assistiramCursoAndroid)

    println(assistiramAmbos)
    println(assistiramCursoAndroid union assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)
}