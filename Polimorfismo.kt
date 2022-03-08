import abstractClasses.Cachorro
import abstractClasses.Cavalo
import abstractClasses.Preguica

fun main (){

    val suzy = Cachorro("Suzy", 7)
    val ellen = Cavalo("Ellen", 10)
    val joseph = Preguica("Joseph", 30)

    suzy.emitirSom()
    ellen.emitirSom()
    joseph.emitirSom()
}