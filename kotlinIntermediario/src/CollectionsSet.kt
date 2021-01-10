import java.util.*

//Set não aceita elemento duplicados e não necessáriamente respeita a ordem dos elementos.
fun main(args: Array<String>){

    //mesmo adicionando números repitidos ele só considerará um elemento
    var set = hashSetOf(1,2,4,4,60,60,70)

    for(item in set){
        println(item)
    }

}