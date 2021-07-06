package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val eliane = Gerente("Eliane Barbosa", "123.456.789-10",  5000.0)

    ImprimeRelatorioFuncionario.imprime(eliane)
}