package one.digitalinnovation.collections

fun main() {
    val joana = Funcionario( "Joana", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4.000, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joana.nome, joana)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joana.nome))

    println("==============================")
    repositorio.findAll().forEach { println(it) }

    println("==============================")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }