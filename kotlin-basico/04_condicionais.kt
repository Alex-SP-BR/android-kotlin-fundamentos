fun main() {
    println("Digite a idade:")
    val input = readLine()

    if (input != null) {
        val idade = input.toInt()

        if (idade < 12) {
            println("Criança")
        } else if (idade < 18) {
            println("Adolescente")
        } else {
            println("Adulto")
        }
    } else {
        println("Entrada inválida")
    }
}
