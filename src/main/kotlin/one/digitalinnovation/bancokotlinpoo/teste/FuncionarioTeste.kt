package one.digitalinnovation.bancokotlinpoo.teste

import one.digitalinnovation.bancokotlinpoo.Funcionario
import one.digitalinnovation.bancokotlinpoo.Pessoa
import java.math.BigDecimal

fun main() {
    val neto = Pessoa(nome = "Neto", cpf = "123.123.123-12")

    println(neto.nome)
    println(neto.cpf)

    val lucas = Funcionario( "Lucas",  "123.123.123-12", BigDecimal.valueOf(2000.0))
    println(lucas.nome)
    println(lucas.cpf)
    println(lucas.salario)
}