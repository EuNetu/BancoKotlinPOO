package one.digitalinnovation.bancokotlinpoo.teste

import one.digitalinnovation.bancokotlinpoo.Banco

fun main() {
    val BancoKotlinPOO = Banco(nome = "Banco Kotlin", numero = 12)

    println(BancoKotlinPOO.nome)
    println(BancoKotlinPOO.numero)
}