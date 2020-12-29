package ExercicioPetShop.models

import ExercicioPetShop.interfaces.Alimentados
import ExercicioPetShop.interfaces.Anda

class Cao(val tipo: String = "cachorro"): Alimentados, Anda {

    override fun exercitar() {
        println("Cão se exercita.")
    }

}