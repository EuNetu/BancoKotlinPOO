package one.digitalinnovation.bancokotlinpoo.teste

import one.digitalinnovation.bancokotlinpoo.Analista
import one.digitalinnovation.bancokotlinpoo.Funcionario
import one.digitalinnovation.bancokotlinpoo.Pessoa
import java.math.BigDecimal

fun main() {

    val liryel = Analista( "liryel",  "123.123.123-12",5000.0)

    ImprimeRelatorioFuncionario.imprime(liryel)
}