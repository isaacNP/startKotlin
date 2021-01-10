
//Map considerado fazendo parte da hierarquia das Collections
//É uma implementação baseada em chave-valor
fun main(args: Array<String>){
    var map = hashMapOf("Chave1" to 1, "Chave2" to 2, "Chave3" to 3)
    map.put("Chave4", 4)

    println(map)

    map.remove("Chave2")

    for(chave in map.keys){
        println("$chave: ${map.get(chave)}")
    }


    val map3: Map<Int, Int> = emptyMap()

}