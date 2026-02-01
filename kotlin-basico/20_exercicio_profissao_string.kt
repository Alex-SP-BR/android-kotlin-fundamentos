fun main() {
    println("Digite sua profissão:")
    val profissao = readLine()!!.lowercase()

    if (profissao == "programador") {
        println("Você é programador")
    } else {
        println("Outra profissão")
    }
}
