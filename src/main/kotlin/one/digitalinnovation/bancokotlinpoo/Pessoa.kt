package one.digitalinnovation.bancokotlinpoo

class Pessoa {
    var name: String = "Neto"
    var cpf: String = "123.123.123-12"
    private set

    constructor()

    fun pessoaInfo() = "name: $name \ncpf: $cpf"

}

fun main() {
    val neto = Pessoa()

    println(neto.pessoaInfo())
}