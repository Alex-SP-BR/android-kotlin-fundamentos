fun main() {

    println("Digite um número:")
    val n = readLine()!!.toInt()

    if (n == 0) {
        println("Zero eh Par")
    } else if (n % 2 == 0) {
        println("Par")
    } else {
        println("Ímpar")
    }
}
