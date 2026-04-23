fun main() {

    println("1 - Par ou Ímpar")
    println("2 - Dia da semana")
    println("3 - Nota")
    println("0 - Sair")

    println("Escolha uma opção:")
    val opcao = readLine()!!.toInt()

    when (opcao) {

        1 -> {
            println("Digite um número:")
            val numero = readLine()!!.toInt()

            when {
                numero % 2 == 0 -> println("Par")
                else -> println("Ímpar")
            }
        }

        2 -> {
            println("Digite um número de 1 a 7:")
            val dia = readLine()!!.toInt()

            when (dia) {
                1 -> println("Domingo")
                2 -> println("Segunda")
                3 -> println("Terça")
                4 -> println("Quarta")
                5 -> println("Quinta")
                6 -> println("Sexta")
                7 -> println("Sábado")
                else -> println("Inválido")
            }
        }

        3 -> {
            println("Digite a nota:")
            val nota = readLine()!!.toDouble()

            when {
                nota >= 7 -> println("Aprovado")
                else -> println("Reprovado")
            }
        }

        0 -> println("Saindo...")

        else -> println("Opção inválida")
    }
}
