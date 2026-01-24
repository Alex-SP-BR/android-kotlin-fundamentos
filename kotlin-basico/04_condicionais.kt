fun main() {

    println("Digite a idade:")
    val input = readLine()

    val idade = input?.toIntOrNull()

    if (idade == null) {
        println("Entrada inválida")
    } else {

        if (idade < 12) {
            println("Criança")
        } else if (idade < 18) {
            println("Adolescente")
        } else {
            println("Adulto")
        }
    }
}
