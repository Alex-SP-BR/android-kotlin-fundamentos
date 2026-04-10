/*

FLUXO GERAL DO PROGRAMA:

main → iniciarSistema → menu → escolha → ação

*/
fun main() {

    // PONTO DE INÍCIO DO PROGRAMA
    // Tudo começa aqui
    iniciarSistema()
}

/*

Essa função controla o sistema inteiro.
Ela fica em loop até o usuário decidir sair.

*/
fun iniciarSistema() {

    while (true) { // LOOP INFINITO (programa não fecha sozinho)

        val opcao = menu()
        // chama menu()
        // recebe um número (Int)
        // guarda na variável opcao

        when (opcao) {
            // decide o que fazer baseado na escolha

            1 -> somar() // chama função somar

            2 -> verificarIdade() // chama função idade

            0 -> {
                println("Saindo...")
                break // quebra o loop → encerra o sistema
            }

            else -> println("Opção inválida")
        }
    }
}

/*

Função menu:
- Mostra opções
- Lê escolha do usuário
- RETORNA um número

*/
fun menu(): Int {

    println("1 - Somar")
    println("2 - Idade")
    println("0 - Sair")

    val entrada = readLine()
    // usuário digita algo (String)

    return entrada!!.toInt()
    // converte String → Int
    // retorna para quem chamou (iniciarSistema)
}

/*

Função somar:
- Não retorna nada
- Só executa ação

*/
fun somar() {

    println("Digite um número:")
    val n1 = readLine()!!.toInt()
    println("Digite outro número:")
    val n2 = readLine()!!.toInt()

    val resultado = n1 + n2

    println(resultado)
}

/*

Função verificarIdade:
- Usa decisão (if)
- Retorna um resultado lógico (String)

*/
fun verificarIdade() {

    println("Digite sua idade:")
    val idade = readLine()!!.toInt()

    val resultado = if (idade >= 18) {
        "Maior"
    } else {
        "Menor"
    }

    println(resultado)
}
