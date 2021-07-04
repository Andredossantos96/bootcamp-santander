package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "André"
    var cpf: String = "123.123.123.11"
    private set

}

fun main() {
    val andre = Pessoa()

    println(andre)
    println(andre.nome)
    println(andre.cpf)
}