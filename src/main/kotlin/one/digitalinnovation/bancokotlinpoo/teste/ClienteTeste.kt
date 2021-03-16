package one.digitalinnovation.bancokotlinpoo.teste

import one.digitalinnovation.bancokotlinpoo.Cliente
import one.digitalinnovation.bancokotlinpoo.ClienteTipo

fun main() {
    val debora = Cliente(
        nome = "Debora Simonelli,",
        cpf = "123.123.123-12",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(debora)

    AutenticacaoTeste().autentica(debora)

}