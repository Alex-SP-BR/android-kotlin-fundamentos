fun main() {

    println("Digite quanto dinheiro você tem:")
    val dinheiro = readLine()!!.toDouble()

    val valorProduto = 50.0

    val resultado = if (dinheiro >= valorProduto) {
        "Compra autorizada"
    } else {
        "Dinheiro insuficiente"
    }

    println(resultado)
}
