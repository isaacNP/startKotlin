class Carro(var cor: String, var ano: Int, var modelo: String) {

    //Podemos criar variável já no construtor ou criando a parte.
    //Variáveis devem ser inicializadas, ou na hora da criação, ou no método init.
    var lugares: Int = 4
    var fabricante: String

    //método de inicialização
    init {
        this.fabricante = "Fiat"
    }

    fun acelerar() {
        println("Acelerando o $modelo")
    }
}

fun main(args: Array<String>){
    val uno = Carro("Amarelo", 2018, "Uno")

    println(uno.ano)
    println(uno.cor)
    print(uno.modelo)
    println(uno.acelerar())
}