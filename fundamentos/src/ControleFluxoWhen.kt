fun main(args: Array<String>) {
    var opcao: Int = 1

    when(opcao) {
        1 -> println("Conta Corrente")
        2 -> println("Conta Poupanca")
        3 -> println("Cartao de Crédito")
        else -> {
            println("Nenhuma opção encontrada")
        }
    }

    var isContaCorrente: Boolean = when(opcao) {
        1 -> {
            println("Opção é Conta Corrente")
            true
        }
        2 -> {
            println("Opção é Conta Poupanca")
            false
        }
        3 -> {
            println("Opção é Cartao de Crédito")
            false
        }
        else -> {
            println("Nenhuma opção encontrada")
            false
        }
    }

    println(isContaCorrente)
}