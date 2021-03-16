package one.digitalinnovation.bancokotlinpoo.teste

import one.digitalinnovation.bancokotlinpoo.Pessoa


fun main() {
    val neto = Pessoa(nome = "Neto", cpf = "123123123-12")

    println(neto.nome)
    println(neto.cpf)
}