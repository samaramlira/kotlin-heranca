package abstractClasses

class Cavalo(
    nome: String, idade: Int
) : Animal(nome, idade) {

    override fun emitirSom() {
        println("**Sons de cavalo**")
    }

    fun correr (){
        println("Correndo como cavalo")
}
}