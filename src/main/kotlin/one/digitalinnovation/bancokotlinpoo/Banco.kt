package one.digitalinnovation.bancokotlinpoo

data class Banco(
    val nome: String,
    val numero: Int
){
    fun info() = "$nome \n $numero"
}
