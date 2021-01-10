import java.util.*

open class Animal {

    private var nome = "Bob"
    protected var ano = 2011
    internal var tipo = "Mamifero"
    var patas = 4

    fun getNome(): String {
        return nome
    }
}

class Cachorro: Animal() {

    val esteAno = Calendar.getInstance().get(Calendar.YEAR);

    fun imprimirIdade(){
        println(esteAno - this.ano)
    }
}

fun main(args: Array<String>){

    val bob = Cachorro()

    println(bob.getNome())
    println(bob.imprimirIdade())
    println(bob.tipo)
    println(bob.patas)
}