enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val id: Long)

data class ConteudoEducacional(
    var docker: String,
    var java: String,
    var kotlin: String,
    val duracao: Int = 60
)

data class Formacao(
    val nome: String,
    val conteudos: List<ConteudoEducacional>,
    val nivel: Nivel
)

fun main() {
    val conteudo = ConteudoEducacional(
        docker = "Introdução ao Docker",
        java = "Programação em Java",
        kotlin = "Fundamentos de Kotlin",
        duracao = 90
    )
    val inscritos = mutableListOf<Usuario>()
    inscritos.add(Usuario("Carlos", 1))
    inscritos.add(Usuario("Michelly", 2))
    inscritos.add(Usuario("Eduardo", 3))

    for (usuario in inscritos) {
        println("${usuario.nome}:")
        println("- Conteúdo educacional: ${conteudo.docker}, ${conteudo.java}, ${conteudo.kotlin}")
        println("- Nível: ${Nivel.INTERMEDIARIO}\n")
    }

    val formacao1 = Formacao(
        "docker, java, kotlin",
        listOf(
            ConteudoEducacional("Docker", "Java", "Kotlin", 60),
            ConteudoEducacional("Introdução ao Docker", "Programação em Java", "Fundamentos de Kotlin", 90)
        ),
        Nivel.INTERMEDIARIO
    )

    val formacoes = listOf(
        Formacao(
            "docker, java, kotlin",
            listOf(
                ConteudoEducacional("Docker", "Java", "Kotlin", 60),
                ConteudoEducacional("Introdução ao Docker", "Programação em Java", "Fundamentos de Kotlin", 90)
            ),
            Nivel.INTERMEDIARIO
        ),

        Formacao(
            "docker, java, kotlin",
            listOf(
                ConteudoEducacional("Docker", "Java", "Kotlin", 60),
                ConteudoEducacional("Introdução ao Docker", "Programação em Java", "Fundamentos de Kotlin", 90)
            ),
            Nivel.INTERMEDIARIO
        )
    )

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}