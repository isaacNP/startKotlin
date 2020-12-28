package ExercicioListaDeFilmes

class Usuario(val lists: MutableMap<String, ListaFilmes> = mutableMapOf<String, ListaFilmes>()) {

    fun addList(list: ListaFilmes){
        lists[list.name] = list
    }

    fun list(name: String): ListaFilmes? = lists[name]
}