fun main(args: Array<String>) {

    // Após settado os valores, o array é imutavel, podendo alterar valores,
    // mas nao a quantidade itens
    var array = arrayOf("SP", "RJ", "PR")
    array[2] = "CE"
    println(array[2])

    var mix = arrayOf("SP", 20, "RJ", 58)
    var inteiros = intArrayOf(5, 10, 15, 20)

    for(inteiro in inteiros) {
        println("inteiro $inteiro")
    }

    //Conseguimos também buscar junto o index
    for((index, inteiro) in inteiros.withIndex()) {
        println("index: $index - inteiro: $inteiro")
    }

    //Inteirando dentro de um array variado
    for(obj in mix){
        println(obj)
    }

    var outrosEstados = arrayOf("PA", "BA", "SC")

    //Só é possivel somar arrays do mesmo tipo, no caso, String
    var todosEstados = array + outrosEstados

    for(estado in todosEstados){
        println("Estado $estado")
    }

    //Por padrão toda string é um array
    val str = "Uma String"
    println(str[0])
}