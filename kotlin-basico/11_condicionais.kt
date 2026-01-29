fun main() {

    println("Digite a idade:")
    val idade = readLine()!!.toInt()

    if (idade < 0) {
        println("Idade inválida")
    } else if (idade <= 11) {
        println("Criança")
    } else if (idade <= 17) {
        println("Adolescente")
    } else if (idade <= 49) {
        println("Adulto")
    } else if (idade <= 64) {
        println("Meia-idade")
    } else {
        println("Terceira idade")
    }
}
