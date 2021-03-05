package one.digitalinnovation.collections

fun main() {
    val joana = Funcionario( "Joana", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4.000, "CLT")

    val funcionarios = listOf(joana, pedro, maria)

    funcionarios.forEach { println(it) }

    println("====================")
    println(funcionarios.find { it.nome == "Maria" })

    println("====================")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("====================")
    funcionarios
        .groupBy { it.salario }
        .forEach { println(it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """"
            Nome: $nome
            Salários: $salario
        """".trimIndent()
}