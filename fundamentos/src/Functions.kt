import java.util.Date

fun main(args: Array<String>){
    olaMundo()
    println(queHorasSao())

    var total = soma(10, 15)

    println("Total $total")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

fun queHorasSao(): Date {
    return Date()
}

fun olaMundo(){
    println("Olá Mundo!")
}