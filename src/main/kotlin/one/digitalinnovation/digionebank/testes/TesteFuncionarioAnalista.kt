package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val lucas = Analista("Lucas Santos", "123.456.789-10", 2000.0)

    ImprimeRelatorioFuncionario.imprime(lucas)
}
