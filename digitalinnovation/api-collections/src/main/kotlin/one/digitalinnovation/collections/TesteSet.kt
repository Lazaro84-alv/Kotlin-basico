package one.digitalinnovation.collections

fun main() {

    val joana = Funcionario( "Joana", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4.000, "CLT")


    val funcionarios1 = setOf(joana, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("====================")
    val funcionarios3 = setOf(joana, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultUnion.forEach { println(it) }

    println("====================")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultSubtract.forEach { println(it) }
}