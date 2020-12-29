package ExercicioPetShop.models

import ExercicioPetShop.interfaces.Alimentados
import ExercicioPetShop.interfaces.Anda

class Gato: Alimentados, Anda {

    override fun exercitar() {
        println("Gato se exercita.")
    }
}