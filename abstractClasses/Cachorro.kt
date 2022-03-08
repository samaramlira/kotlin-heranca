package abstractClasses

class Cachorro(
    nome: String, idade: Int
) : Animal(nome, idade) {

    override fun emitirSom() {
        println("Au Au")
    }
    fun correr (){
        println("Correndo como um cachorro")
    }
}