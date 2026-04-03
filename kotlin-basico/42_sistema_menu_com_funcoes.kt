fun main(){
    
    iniciarSistema()
}
fun iniciarSistema(){
    
    while(true){
        
        val opcao = menu()
        
        when(opcao){
            
            1 -> somar()
            2 -> verificarIdade()
            0 ->{
                
                println("Saindo do Sistema...")
                break
            }
            else -> println("Opção Invalida")
        }
        println("\n-----------\n")
    }
}
fun menu(): Int{

println("== Menu ==")
println("1 - Somar")
println("2 - verificar Idade")
println("0 - Sair")

println("Escolha uma Opção:")
return readLine()!!.toInt()
}
fun somar(){
    
    println("Digite o Primeiro Número:")
    val n1 = readLine()!!.toInt()
    
    println("Digite o Segundo Número:")
    val n2 = readLine()!!.toInt()
    
    val resultado = n1 + n2
    
    println("Resultado: $resultado")
}
fun verificarIdade(){
    
    println("Digite sua Idade:")
    val idade = readLine()!!.toInt()
    
    val resultado = if(idade < 0){
        "idade Inválida"
    }else if(idade>=18){
        
        "maior de idade"
    }else{
        
        "Menor de Idade"
    }
    
    println(resultado)
}
