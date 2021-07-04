package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "André"
    var cpf: String = "123.456.789.10"
    private set

    constructor()

    fun pessoaInfo() = "$nome seu CPF é $cpf"

}

fun main() {
    val andre = Pessoa()
    println(andre.pessoaInfo())
}