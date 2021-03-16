package one.digitalinnovation.bancokotlinpoo.teste

import one.digitalinnovation.bancokotlinpoo.Analista
import one.digitalinnovation.bancokotlinpoo.Funcionario
import one.digitalinnovation.bancokotlinpoo.Pessoa
import java.math.BigDecimal

fun main() {

    val lucas = Analista( "Lucas",  "123.123.123-12",2000.0)

    imprimeRelatorio(lucas)

}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())