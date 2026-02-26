fun main() {

    println("Nome:")
    val nome = readLine()!!

    println("Idade:")
    val idade = readLine()!!.toInt()

    println("Altura")
    val altura = readLine()!!.toDouble()

    if (idade < 18) {

        println("R: ${nome} menor")

    } else if (idade >= 18 && altura >= 1.70) {

        println("R: ${nome} adulto alto")

    } else {

        println("R: ${nome} adulto")

    }
}
