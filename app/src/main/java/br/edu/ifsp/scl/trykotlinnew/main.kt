package br.edu.ifsp.scl.trykotlinnew

fun main(args: Array<String>) {

    //Declaração de variável mutável
    var frase: String = "Hello, World!"

    var fraseDois = "Hello, World 2 sem tipo defino diretamente no fonte"


    val fraseImutavelVal: String = "frase imutavel do tipo VAL"



    println("Hello, world!")

    println(frase)

    println("$frase")
    println("${frase}")

    //Com chamada de função
    println("Quantidade de caracteres: ${frase.count()}")

    //Com propriedade (get)
    println("Quantidade de caracteres: ${frase.length}")


}