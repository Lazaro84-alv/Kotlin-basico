package one.digitalinnovation.collections

fun main() {
    val joana = Funcionario("Joana", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4.000, "CLT")

    val funcionarios = mutableListOf(joana, maria)
    funcionarios.forEach { println(it) }

    println("============================")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("============================")
    funcionarios.remove(joana)
    funcionarios.forEach { println(it) }

    println("============SET================")
    val funcionarioSet = mutableSetOf(joana)
    // funcionarioSet.forEach { println(it) }

    println("============================")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("============================")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}