fun main() {
    println("Digite quanto dinheiro você tem:")
    val dinheiro = readLine()!!.toDouble()

    val precoProduto = 50.0

    if (dinheiro >= precoProduto) {
        println("Compra autorizada")
    } else {
        println("Dinheiro insuficiente")
    }
}
