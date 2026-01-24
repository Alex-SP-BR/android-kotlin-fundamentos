fun main() {

    println("Digite a idade:")
    val idade = readLine()!!.toInt()

    if (idade < 12) {
        println("Criança")
    } else if (idade < 18) {
        println("Adolescente")
    } else {
        println("Adulto")
    }

}
