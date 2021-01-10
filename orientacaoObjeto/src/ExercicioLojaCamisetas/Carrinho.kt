package ExercicioLojaCamisetas

class Carrinho(var endereco: Endereco, val camisetas: MutableList<Camiseta> = mutableListOf()) {

    fun precoTotal(): Double {
        var precoTotal = 0.0
        camisetas.forEach {
            precoTotal += it.preco
        }
        return precoTotal
    }
}