import java.lang.Exception

//Não existe exceções verificadas no Kotlin, evitando acúmulo desncecessário de códigos.
//Exemplo: String funcaoTeste(Long numero) throws IOException {}
//No Kotlin não se usa a declaração "throws ..."
fun main(args: Array<String>){

    try {
        print("Digite um numero: ")
        val numero: Int = readLine()!!.toInt()
        val divisao: Int = 100 / numero
        println("A divisao é $divisao")
    } catch (e: Exception){
        println("Erro: ${e.message}")
    } finally {
        println("Programa finalizado!")
    }

}