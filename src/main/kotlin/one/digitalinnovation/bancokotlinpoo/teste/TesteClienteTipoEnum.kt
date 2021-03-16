package one.digitalinnovation.bancokotlinpoo.teste

import one.digitalinnovation.bancokotlinpoo.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PF
    println("${pj.name} - ${pj.descricao}")
}