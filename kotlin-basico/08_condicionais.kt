fun main() {

    println("Digite um número inteiro:")
    val n = readLine()!!.toInt()

    if (n < 0) {
        println("Número negativo")
    } else if (n <= 10) {
        println("Entre 0 e 10")
    } else if (n <= 100) {
        println("Entre 11 e 100")
    } else {
        println("Maior que 100")
    }
}
