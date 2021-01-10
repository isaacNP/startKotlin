
class Livro(val titulo: String, val autor: String, val ano: Int) {

    override fun toString(): String {
        return "Livro(titulo='$titulo', autor='$autor', ano=$ano)"
    }
}

data class DataLivro(val titulo: String, val autor: String, val ano: Int)

fun main(args: Array<String>) {
    val livro = Livro("AndroidPro Livro", "Felipe Cordeiro", 2017)
    val dataLivro = DataLivro("AndroidPro Livro", "Felipe Cordeiro", 2017)

    println(livro)
    println(dataLivro)
}