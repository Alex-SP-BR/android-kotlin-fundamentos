fun main() {
    println("Digite seu turno:")
    val turno = readLine()!!.lowercase()

    if (turno == "manha" || turno == "tarde") {
        println("Turno diurno")
    } else {
        println("Outro turno")
    }
}
