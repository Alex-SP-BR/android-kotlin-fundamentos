fun main() {
    val notaMinima = 6.0

    println("Digite a média:")
    val media = readLine()!!.toDouble()

    if (media >= notaMinima) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }
}
