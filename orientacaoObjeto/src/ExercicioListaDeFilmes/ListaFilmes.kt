package ExercicioListaDeFilmes

class ListaFilmes(val name: String, val movies: MutableList<String> = mutableListOf()) {

    fun print() {
        println("Movie List: $name")
        movies.forEach {
            print(it)
        }
    }
}