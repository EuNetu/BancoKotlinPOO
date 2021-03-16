package one.digitalinnovation.bancokotlinpoo.teste

import one.digitalinnovation.bancokotlinpoo.Analista

fun main() {

    val lucas = Analista( "Lucas",  "123.123.123-12",2000.0)

    ImprimeRelatorioFuncionario.imprime(lucas)

}