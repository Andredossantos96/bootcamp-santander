package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val nilton = Cliente(
        nome = "Nilton da silva",
        cpf = "123.456.789-00",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(nilton)

    TesteAutenticacao().autentica(nilton)
}
