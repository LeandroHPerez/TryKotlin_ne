package br.edu.ifsp.scl.trykotlinnew

fun main(args: Array<String>) {

    //List e MutableList
    //listOf é imutável - não aceita remoção nem adição de novos itens, também não aceita uma reatribuição do objeto
    //MutableList é mutável
    var familia: List<String> = listOf<String>("Pedro", "Marcela", "João", "Cadu")
    //familia.add("dog paçoca")  //da erro pq a lista é mutável


    //var lista: MutableList<String>

    familia = listOf<String>()


    //percorrer usando FOR
    for(integrante in familia){
        println(integrante)
    }


    val listaInteiros: List<Int> = listOf<Int>(1,2,3,4,5,6,7,8,9,10)




    //Lista populada com IntRange
    val listaInteirosComIntRange: List<Int> = (1..10).toList()

    //percorrer usando FOR com IntRange
    for(i in 0..9) {
        println(listaInteiros[i])
    }



    val listaInteirosComIntRange2: List<Int> = (1..10 step 2).toList() //vai populaar gerando números pulando de 2 em 2 (step 2)
    //percorrer usando FOR com IntRange
    for(i in 0..listaInteirosComIntRange2.size -1) {
        println(listaInteirosComIntRange2[i])
    }


    //Lista mutável - permite adicionar elemento
    val listaCursos: MutableList<String> = mutableListOf<String>("Sistemas móveis", "ADS")


    listaCursos.add("Tec. em informática")

    //Percorrendo q lista com LAMBDA
    listaCursos.forEach { println(it) } //o it é o item atual do forEach - seria como o this do java



}

