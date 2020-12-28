package ExercicioListaDeFilmes

fun main(args: Array<String>) {
    val alice = Usuario()
    val joao = Usuario()
    val actionList = ListaFilmes(name = "Ação")

    alice.addList(actionList)
    joao.addList(actionList)

    alice.lists["Ação"]?.movies?.add("Rambo")
    alice.lists["Ação"]?.movies?.add("Exterminador")

    joao.lists["Ação"]?.movies?.add("Duro de Matar")

    joao.lists["Ação"]?.print()

    alice.lists["Ação"]?.print()
}