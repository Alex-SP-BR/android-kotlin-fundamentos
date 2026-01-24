fun main() {

    println("Digite uma nota:")
    val input = readLine()

    val n = input?.toIntOrNull()

    if (n == null) {
        println("Entrada Invalida")
    } else {

        if (n >= 7) {
            println("Aprovado")
        } else if (n >= 5) {
            println("Recuperação")
        } else {
            println("Reprovado")
        }
    }
}
