fun main() {
    println("Digite sua média:")
    val media = readLine()!!.toDouble()

    if (media < 5.0) {
        println("Reprovado")
    } else if (media < 7.0) {
        println("Recuperação")
    } else {
        println("Aprovado")
    }
}
