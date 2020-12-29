package ExercicioPetShop.models

import ExercicioPetShop.interfaces.Alimentados
import ExercicioPetShop.interfaces.LimparJaulas
import ExercicioPetShop.interfaces.Voa

class Passaro: Alimentados, Voa, LimparJaulas {

    override fun limparTanqueOuGaiola() {
        println("limpar gaiola do passaro")
    }
}