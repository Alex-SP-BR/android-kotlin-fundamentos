fun menu(){
    
    println("1 - somar")
    println("2 - verificar idade")
}

fun main(){
    
    menu()
    println("Escolha uma opção:")
    val opcao = readLine()!!.toInt()
    
    when(opcao){
        
        1 ->{
             println("Voce escolheu somar")
             }
             
        2 -> {
             println("Você escolheu verificar idade")
             }
             else -> {
                 println("Opção Invalida")
             }
        
    }
}
