
fun main(args: Array<String>){

    //Define array, é a mesma coisa que: var array = ArrayList<String>() e depois adicionar os itens com array.add("Item)
    var array = arrayListOf("João", "Maria", "Felipe")

    //adiciona item a lista
    array.add("Pedro")

    println(array)

    //remove item da lista, podendo ser por index ou dado
    array.remove("Maria")

    println(array)

    //tamanho da lista
    println(array.size)
    //verifica se a lista está vazia
    println(array.isEmpty())
    //verifica se contem dado dentro da lista
    println(array.contains("Felipe"))
    println(array.contains("Maria"))

    //inteirando pela lista
    for(nome in array){
        println(nome)
    }
    
}