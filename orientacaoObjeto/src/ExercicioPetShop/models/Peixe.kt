package ExercicioPetShop.models

import ExercicioPetShop.interfaces.Alimentados
import ExercicioPetShop.interfaces.LimparJaulas
import ExercicioPetShop.interfaces.Nada

class Peixe: Alimentados,  Nada, LimparJaulas {

    override fun limparTanqueOuGaiola() {
        println("limpar aquario do Peixe")
    }
}