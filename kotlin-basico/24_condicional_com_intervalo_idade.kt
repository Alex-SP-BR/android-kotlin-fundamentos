fun main() {
    println("Digite sua idade:")
    val idade = readLine()!!.toInt()

    if (idade >= 18 && idade <= 65) {
        println("Idade permitida")
    } else {
        println("Idade fora do intervalo")
    }
}
