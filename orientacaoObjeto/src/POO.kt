interface Dirigivel {

    fun acelerar(velocidade: Long)
}

interface Carregavel {

    fun carregar(qtd: Int)
}

open class Veiculo(open var cor: String, open var ano: Int, open var modelo: String) {

    init {
        println("Construindo um $modelo")
    }

}

class Carro(override var cor: String, override var ano: Int, override var modelo: String): Veiculo(cor, ano, modelo), Dirigivel {

    fun freiar() {
        println("Freiando o $modelo")
    }

    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade Km/H")
    }
}

class Caminhao(override var cor: String, override var ano: Int, override var modelo: String, var capacidade: Long): Veiculo(cor, ano, modelo), Dirigivel, Carregavel {

    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade Km/H")
    }

    override fun carregar(qtd: Int) {
        println("Carregando o caminhão com $qtd toneladas")
    }

}

fun main(args: Array<String>){
    val uno  = Carro("Amarelo", 2018, "Uno")
    println("Carro:")
    println("modelo: ${uno.modelo} - ano: ${uno.ano} - cor: ${uno.cor}")
    uno.acelerar(50)
    uno.freiar()

    val scania = Caminhao("Preto", 2010, "X 78", 1000)
    println("Caminhão:")
    println("Modelo: ${scania.modelo} - ano: ${scania.ano} - cor: ${scania.cor} - capacidade: ${scania.capacidade}")
    scania.acelerar(100)
    scania.carregar(3)
}