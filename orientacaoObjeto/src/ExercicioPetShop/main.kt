package ExercicioPetShop

import ExercicioPetShop.interfaces.*
import ExercicioPetShop.models.Cao
import ExercicioPetShop.models.Gato
import ExercicioPetShop.models.Passaro
import ExercicioPetShop.models.Peixe

fun main(args: Array<String>) {

    val cao = Cao()
    val gato = Gato()
    val passaro = Passaro()
    val peixe = Peixe()

    val animaisAlimentados: Array<Alimentados> = arrayOf(cao, gato, passaro, peixe)
    val animaisEnjaulados: Array<Voa> = arrayOf(passaro)
    val temQueLimpar: Array<LimparJaulas> = arrayOf(passaro, peixe)
    val fazemExercicio: Array<Anda> = arrayOf(cao, gato)
    val nadam: Array<Nada> =  arrayOf(peixe)

    for(animal in animaisAlimentados) animal.alimentar()

    for(animal in animaisEnjaulados) animal.enjaular()

    for(limpa in temQueLimpar) limpa.limparTanqueOuGaiola()

    for(exercicio in fazemExercicio) exercicio.exercitar()

    for(nadar in nadam) nadar.guardarNoTanque()
}