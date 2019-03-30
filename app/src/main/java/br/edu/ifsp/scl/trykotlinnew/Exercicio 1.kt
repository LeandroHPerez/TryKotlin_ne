package br.edu.ifsp.scl.trykotlinnew

fun main(args: Array<String>) {


    val listaCursos: MutableList<String> = mutableListOf("Sistemas para Dispositivos Móveis", "Análise e Desenvolvimento de Sistemas")

    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    println("Solução 1")

    //Solução 1
    val listaCursosSistemas = mutableListOf<String>()

    for(curso in listaCursos){
        if (curso.contains("Sistemas")){
            listaCursosSistemas.add(curso)
        }
    }

    for (i in 0..listaCursosSistemas.size -1){
        println("$i - ${listaCursosSistemas[i]}")
    }


    println("Solução 2")

    //Solução 2
    val listaCursosSistemasSol2 = listaCursos.filter { it.contains("Sistemas") }
    //listaCursosSistemasSol2.withIndex().forEach { println(it) }

    listaCursosSistemasSol2.withIndex().forEach { println("${it.index} - ${it.value}") }



    println("Solução 3")

    //Solução 3
    fun imprime(ci: IndexedValue<String>){
        println("${ci.index} - ${ci.value}")

    }

    val listaCursosSistemasSol3 = listaCursos.filter { it.contains("Sistemas") }
    //listaCursosSistemasSol3.withIndex().forEach { println(it) }

    listaCursosSistemasSol3.withIndex().forEach (::imprime) //passa a função como parâmetro



    var funcao = fun(ci: IndexedValue<String>){
        println("${ci.index} - ${ci.value}")

    }


    var g: (IndexedValue<String>) -> Unit
    g = funcao

    val listaCursosSistemasSol3b = listaCursos.filter { it.contains("Sistemas") }
    //listaCursosSistemasSol3.withIndex().forEach { println(it) }

    listaCursosSistemasSol3b.withIndex().forEach (g) //passa a função como parâmetro




}