package abstractClasses

class Preguica(
nome: String, idade: Int
) : Animal(nome, idade) {

    override fun emitirSom() {
        println("**Sons de um bicho preguiça**")
    }
    fun subirArvore (){
        println("Subindo na árvore")
    }

}