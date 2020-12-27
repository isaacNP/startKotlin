fun main(args: Array<String>) {
    var idade: Int = 19

    if(idade < 18) {
        println("Não pode beber e nem tirar CNH")
    } else if( idade <21 ){
        println("Pode beber mas nao pode tirar CNH")
    } else {
        println("Pode beber e tirar CNH")
    }

    var podeDirigir: Boolean = if(idade<18){
        println("Não pode dirigir")
        false
    } else {
        println("Pode dirigir")
        true
    }

    println(podeDirigir)
}