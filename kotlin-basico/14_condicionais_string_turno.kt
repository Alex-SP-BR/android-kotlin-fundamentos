fun main() {
    println("Digite seu turno (manha / tarde / noite):")
    val turno = readLine()!!

    if (turno == "manha") {
        println("Bom dia!")
    } else if (turno == "tarde") {
        println("Boa tarde!")
    } else if (turno == "noite") {
        println("Boa noite!")
    } else {
        println("Turno inválido")
    }
}
