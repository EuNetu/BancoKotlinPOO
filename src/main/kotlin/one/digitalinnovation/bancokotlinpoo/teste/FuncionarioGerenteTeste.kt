package one.digitalinnovation.bancokotlinpoo.teste

import one.digitalinnovation.bancokotlinpoo.Analista
import one.digitalinnovation.bancokotlinpoo.Funcionario
import one.digitalinnovation.bancokotlinpoo.Gerente
import one.digitalinnovation.bancokotlinpoo.Pessoa
import java.math.BigDecimal

fun main() {

    val liryel = Gerente( "liryel",  "123.123.123-12",5000.0, "123")

    ImprimeRelatorioFuncionario.imprime(liryel)

    AutenticacaoTeste().autentica(liryel)
}